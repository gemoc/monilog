# Monilog
Monitoring and logging tool for executable domain-specific models run on GraalVM.

Requires GraalVM 20.1.0.

## Setup

To enable the monilog tool on GraalVM, the archives available [here](https://github.com/gemoc/monilog/releases/tag/v1.0.0) (for the monilog tool) and optionally [here](https://github.com/gemoc/miniexpr/releases/tag/v1.0.0) (for an expression language to use in your moniloggers), extract them in a folder of your choice, and run their corresponding graalvm-setup.sh scripts. Each archive also contain an eclipse update site (packaged as a zip file) which you can use to install the monilogger and miniexpr editors into your Eclipse IDE, providing auto-completion and syntax highlighting for these languages.

## Use

Use the `--monilogger.files=` option when starting an execution from the command line, and supply the list of monilogger files (.mnlg) you want to include in the execution, as a comma-separated list.
In addition, according to the language you are using (e.g. js/node), you might need to use the `--jvm` and `--polyglot` options or their equivalents to enable execution on the VM and polyglot access.

Example command for node: `node --polyglot --jvm --monilogger.files=todolist.mnlg todolist.js`

## Syntax

A monilog definition can be given a name and is split in three blocks:

 - events: allow to specify the name of callable syntactic constructs (e.g. function, job or method names) that trigger monilogging actions.
 - conditions: this block is optional and is used to evaluate expressions on the state of the program to determine whether the monilogging actions should actually be executed.
 - actions: the monilogging actions to be undertaken are listed in this block.

### Events

When specifying an execution event, you can add the `before` or `after` keywords in front of the reference to the callable, to specify whether monilogging actions should be triggered before or after each call. If no keyword is present, actions are triggered both before and after each call.

```
	monilog "lowPressure" [WARNING] {
		events {
			after computePressure
		}
		
		...
		
	}
```
```
	monilog "invalidDel" [WARNING] {
		events {
			before del
		}
		
		...
		
	}
```

### Conditions

Two kinds of conditions can be expressed here: structural conditions and temporal conditions. 

#### Structural Conditions 

Structural conditions are expressions written in a language available on your GraalVM installation, whose result are interpreted as a boolean (i.e., any value different than 0 is considered as true).
Structural conditions can be used to determine whether a particular execution event should trigger an action or not, according to the current state of the program under execution.

In the following monilogger, a condition specifies that actions should only be triggered if the pressure `p` is below `0.1`.

```
	monilog "lowPressure" [WARNING] {
		events {
			after computePressure
		}
		
		conditions {
			"p <= 0.1"
		}
		
		...
		
	}
```

In the following monilogger, the condition specifies that the `id` parameter of the request `req` should be greater or equal to the length of the `todolist` of the current session for the monilogger's action to be triggered.

```
	monilog "invalidDel" [WARNING] {
		events {
			before del
		}
		
		conditions {
			"req.params.id >= |req.session.todolist|"
		}
		
		...
		
	}
```

Both of these expressions (and all other expressions in the examples thereafter) are written using the MiniExpr language, which is available [here](https://github.com/gemoc/miniexpr/).

#### Temporal Conditions

Temporal conditions are expressed using the `stream` condition and by specifying a temporal pattern from a list of predefined patterns (`always`, `exists`, `never`, `precedence` and `response`) and scopes (`globally`, which is the default one, `after`, `before`, `between-and` and `after-until`).
In more details, temporal patterns are defined as follows:

```
	TemporalPattern: <Pattern> <Scope>?

	Pattern:
		'always' <event> |
		'exists' (n | 'atleast' n | atmost 'n')? <event> |
		'never' <event> |
		<event> 'precedes' <event> |
		<event> 'respondsTo' <event>;

	Scope:
		'globally' |
		'after' <event> |
		'before' <event> |
		'between' <event> 'and' <event> |
		'after' <event> 'until' <event>;
```

The `<event>` tag is a placeholder for events defined by the user, such as the `InvalidDel` event in the example below.
Events can hold parameters, declared as a comma-separated list of key/value pairs between brackets.

In the following monilogger, the temporal condition evaluates to `true` whenever the event stream (see Actions below) contains at least 3 `InvalidDel` events, each holding a parameter equal to the `uuid` of the current `session`.
This pattern of 3 event occurrences is evaluated over the complete execution as no scope has been specified, which leads to the default `globally` scope being used.
This effectively triggers the monilogger's actions whenever a user issues three invalid delete requests.

```
	monilog "suspiciousBehavior" [SEVERE] {
		events {
			before del
		}
		conditions {
			stream(exists atleast 3 InvalidDel[x="req.session.uuid"])
		}
		
		...
		
	}
```

### Actions

Three types of actions are available to moniloggers: printing to the console, to a file or pushing events to the stream for the subsequent evaluation of temporal conditions.

#### Printing to the console

Printing a message to the console is done through the `append console` action.
The following monilogger prints the first, middle and last values of an array named `u_nplus1`:

```
	monilog "logU" [INFO] {
		events {
			after ComputeTn
		}
		actions {
			append console("u[0]={0}; u[{1}]={2} ; u[{3}]={4}",
					"u_nplus1[0]",
					"|u_nplus1| / 2",
					"u_nplus1[|u_nplus1| / 2]",
					"|u_nplus1| - 1",
					"u_nplus1[|u_nplus1| - 1]")
		}
	}
```

The first parameter is the pattern of the message, where curly braces such as `{0}` indicate where the subsequent parameters should be inserted in the message.
Consequently, the following parameters are expressions computing the dynamic values to insert in the message.

Here is an example of message that is printed by this monilogger:

```
	[monilogger] INFO: u[0]=0.031; u[800]=0.133 ; u[1,599]=0.031
```

#### Printing to a file

Printing a message to a file is very similar to printing to the console, and is done through the `append file` action.
The following monilogger prints a message to the `log.txt` file whenever `p` is negative after a call to `computePressure`.

```
	monilog "negativePressure" [SEVERE] {
		events {
			after computePressure
		}
		conditions {
			"p < 0"
		}
		actions {
			append file("log.txt", "Negative pressure: p={0}", "p")
		}
	}
```

The first parameter is the path to the file where the message should be printed.
The following parameters are the same as those used for printing to the console (the pattern for the message, and the dynamic values to insert into that pattern).

#### Pushing events to the stream

Pushing events to the stream is done through the `append stream` action.
You must provide a name for the event, and can then specify values held by the occurrence by providing a comma separated list of expressions inside brackets `[...]`.

The following monilogger prints a message to the `log.txt` file and then pushes an occurrence of the `InvalidDel` event with the `uuid` of the current `session` whenever an invalid request to delete an item of `todolist` is received.

```
	monilog {
		events {
			before del
		}
		conditions {
			"req.params.id >= |req.session.todolist|"
		}
		actions {
			append file("log.txt", "Invalid delete call by {0} on id {1}", "req.session.uuid", "req.params.id"),
			append stream(InvalidDel["req.session.uuid"])
		}
	}
```
