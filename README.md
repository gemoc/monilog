# MoniLog
Monitoring and logging tool for executable domain-specific models run on GraalVM.

Requires GraalVM 21.0.0.

## Setup

To enable MoniLog on GraalVM, download the jar file available [here](https://github.com/gemoc/monilog/releases/tag/v1.0.0), and put it in the `tools/monilogger/` folder of your GraalVM installation. To enable the Xtext editor on your Eclipse IDE, download the `monilog-syntax.zip` file, available [here](https://github.com/gemoc/monilog/releases/tag/v1.0.0), and install it through the **Install New Software...** menu.

## Use

Use the `--monilogger.files=` option when starting an execution from the command line, and supply the list of MoniLog files (.mnlg) you want to include in the execution, as a comma-separated list.
In addition, according to the language you are using (e.g. js/node), you might need to use the `--jvm` and `--polyglot` options or their equivalents to enable execution on the VM and polyglot access.

Example command for node: `node --polyglot --jvm --monilogger.files=todolist.mnlg todolist.js`

## Syntax

### Imports

The MoniLog language allows to import other MoniLog packages so that the entities declared within can be used, including the `org.gemoc.monilog.stl` package, which contains some basic layouts and appenders. The language also allows to import files from other languages such as Python files, and to give them an alias so their callable entities can be referred to.

```
import org.gemoc.monilog.stl.*
import fr.cea.nabla.monilog.nablalib.*
import "/absolute/path/to/file/mylib.py" as mylib
```

This snippet imports the aforementionned standard library of MoniLog, as well as a NabLab-specific library allowing to print to the NabLab console.
It also imports a Python file to be used later.

### Events

Events are declared using the following syntax:

```
call Initialized {
	after InitU
}

call BeforeComputeTn {
	before ComputeTn
}

call AfterComputeTn {
	after ComputeTn
}
```

This snippet declares three events, Initialized, BeforeCOmputeTn and AfterComputeTn, to which moniloggers can listen during the execution. These events are respectively fired after calls to InitU, before calls to ComputeTn, and after calls to ComputeTn.

### Expressions

The other entities make use of expressions, which can be MoniLog expressions or language expressions. MoniLog expressions are written between curly braces, such as `{x * 2}`, `{sizeOf(u_nplus1)}`, or `{u_nplus1[0]}`. Language expressions are either calls to functions of imported files, such as `python(mylib.format({u_nplus1})`, or inline snippets of code supplied as strings, such as `python("count % 2 == 0")`. Any language available on your GraalVM installation can be provided by specifying the language id instead of `python` in the examples.


### Layouts

Personnalized layouts can be declared to fit your needs.
The following snippet declares a `BasicPythonLayout` which uses the `StringLayout` from the standard library to format a plain string message containing the value of a time variable, followed by the content of an array formatted using a function from the imported `mylib.py` file.

```
layout BasicPythonLayout {
	StringLayout.call({"t={0,number,0.000000} u={1}"}, {t_nplus1}, python(mylib.format({u_nplus1})))
}
```

The following snippet declares a `SummaryLayout` using exclusively MoniLog expressions to format a plain string message containing the value of a time variable, followed by the first, middle, and last cells of an array.

```
layout SummaryLayout {
	StringLayout.call({"[t={0,number,0.000000}] u[0]={1,number,0.000000}; u[{2}]={3,number,0.000000} ; u[{4}]={5,number,0.000000}"},
		{t_nplus1},
		{u_nplus1[0]},
		{sizeOf(u_nplus1) / 2},
		{u_nplus1[sizeOf(u_nplus1) / 2]},
		{sizeOf(u_nplus1) - 1},
		{u_nplus1[sizeOf(u_nplus1) - 1]})
}
```

The first parameter of a call to `StringLayout` is the pattern of the message, where curly braces such as `{0,number,0.000000}` indicate where the subsequent parameters should be inserted in the message, and how they should be formatted, according to the semantics of [MessageFormat](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/text/MessageFormat.html?is-external=true).
Consequently, the following parameters are expressions retrieving and computing the actual values to insert in the message.

### Moniloggers

A monilogger definition can be given a name and is split in three blocks:

 - events: allow to specify the name of declared events that trigger the actions of the monilogger.
 - conditions: this optional block is used to evaluate expressions on the state of the program to determine whether the actions of the monilogger should actually be executed.
 - actions: the actions to be undertaken by the monilogger are listed in this block.

#### Conditions

Conditions are expressions written in the native MoniLog expression language, or a language available on your GraalVM installation, whose result are interpreted as a boolean (i.e., any value different than 0 is considered as true).
Conditions can be used to determine whether a particular event should trigger an action or not, according to the current state of the program under execution.

In the following monilogger, a condition specifies that actions should only be triggered if the pressure `p` is below `0.1`.

```
monilogger lowPressure [WARNING] {
	event AfterComputePressure
	conditions {
		{p <= 0.1}
	}
	...
}
```

In the following monilogger, the condition specifies that the `isInvertible` function declared in `mylib.py` should return false on the variable `alpha` (obtained through the MoniLog expression language) for the actions of the `invalidMatrix` monilogger to be executed.

```
monilogger invalidMatrix [WARNING] {
	events BeforeUpdateU
	conditions {
		python(!mylib.isInvertible({alpha})
	}
	...
}
```

#### Actions

Two types of actions are available to moniloggers: evaluating language expressions, in particular expressions with side-effects, and calling appenders.
Two appenders are provided as part of the MoniLog standard library: `ConsoleAppender` and `FileAppender`.

##### Executing languages expressions

The following monilogger evaluates a Python statement that increments a `count` variable (accessible only from Python expressions) whenever an AfterComputeTn occurs.

```
monilogger updateCount [INFO] {
	event AfterComputeTn
	actions {
		python("count = count + 1");
	}
}
```

##### Printing to the console

The `ConsoleAppender` allows to print text to the console.
The following monilogger uses the `SummaryLayout` to print a summary of an array to the console.

```
monilogger "printU" [INFO] {
	event AfterComputeTn
	actions {
		ConsoleAppender.call(SummaryLayout.call)
	}
}
```

##### Printing to a file

The `FileAppender` allows to print text to a file.
The following monilogger prints the same array summaries as the example above, but this time to the `log.txt` file.

```
monilogger "traceU" [INFO] {
	event AfterComputeTn
	actions {
		FileAppender.call(SummaryLayout.call, {"/absolute/path/to/log.txt"}, {true})
	}
}
```

The second parameter is the path to the file where the message should be printed.
The third parameter is a boolean expression indicated whether calls to the appender should overwrite the file or add lines to it.

