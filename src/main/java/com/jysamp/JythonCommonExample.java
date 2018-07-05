package com.jysamp;

import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

class JythonCommonExample {
    private PythonInterpreter interpreter = null;

    JythonCommonExample(PythonInterpreter interpreter) {
        this.interpreter = interpreter;
    }

    JythonCommonExample() {
        this.interpreter = new PythonInterpreter();
    }

    void example() throws Exception{

        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
        System.out.println("Going to print Hello World using Python Script");
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");

        interpreter.exec("print \"Python - Hello, world!\"");

        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
        System.out.println("Addition of two Numbers");
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");

        PyObject result = interpreter.eval("2 + 3");
        System.out.println(result.toString());
    }
}
