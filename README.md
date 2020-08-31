# Monilog
Monitoring and Logging tool for executable domain-specific models

## Syntax

A monilog definition can be given a name and is split in three blocks:

 - events: allow to specify the name of callable syntactic constructs (e.g. function, job or method names) that trigger monilogging actions.
 - conditions: this block is optional and is used to evaluate expressions on the state of the program to determine whether the monilogging actions should actually be executed.
 - actions: the monilogging actions to be undertaken are listed in this block.

### Events

When specifying an event, you can add the **before** or **after** keywords in front of the reference to the callable, to specify whether monilogging actions should be triggered before or after each call. If no keyword is present, actions are triggered both before and after each call.

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

In the following monilogger, the condition specifies that the `id` parameter of the request `req` should be smaller than the length of the `todolist` of the current session.

```
	monilog "invalidDel" [WARNING] {
		events {
			before del
		}
		
		conditions {
			"req.params.id < |req.session.todolist|"
		}
		
		...
		
	}
```

Both of these expressions are written using the MiniExpr language, which is available [here](https://github.com/gemoc/miniexpr/).

#### Temporal Conditions

Temporal conditions are expressed using the `stream` keyword and by specifying a temporal pattern from a list of predefined patterns (`always`, `exists`, `never`, `precedence` and `response`) and scopes (`globally`, which is the default one, `after`, `before`, `between-and` and `after-until`).
These patterns reference events defined by the user, such as the `InvalidDel` event in the example below.
Events can hold parameters, declared as a comma-separated list of key/value pairs between brackets.

In the following monilogger, the temporal condition evaluates to `true` whenever the event stream (see Actions below) contains at least 3 `InvalidDel` events, each holding a parameter equal to the `uuid` of the current `session`.
This pattern of 3 event occurrences is evaluated over the complete execution as no scope has been specified, which leads to the default `globally` scope being used.
This effectively triggers the associated action whenever a user issues three invalid delete requests.

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

The available 

### Actions

Three types of actions are available to moniloggers: printing to the console, to a file or pushing events to the stream for the subsequent evaluation of temporal conditions.

#### Printing to the console

Printing a message to the console is done through the `append console` keywords.
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

Printing a message to a file is very similar to printing to the console, and is done through the `append file` keywords.
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

```
	monilog {
		events {
			before del
		}
		conditions {
			"req.params.id < |req.session.todolist|"
		}
		actions {
			append file("log", "Invalid delete call by {0} on id {1}", "req.session.uuid", "req.params.id"),
			append stream(InvalidDel["req.session.uuid"])
		}
	}
```











