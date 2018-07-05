package com.jysamp;

import org.python.core.PyObject;
import org.python.core.PyString;
import org.python.util.PythonInterpreter;

class JythonMethodExample {
    private PythonInterpreter interpreter = null;

    JythonMethodExample(PythonInterpreter interpreter) {
        this.interpreter = interpreter;
    }

    JythonMethodExample() {
        this.interpreter = new PythonInterpreter();
    }

    void example() throws Exception{
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
        System.out.println("Example of Method in Jython");
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
        interpreter.exec("def myLowerCase(s):\n\treturn s.lower()\n");
        PyObject myLowerCase = interpreter.get("myLowerCase");
        PyObject result = myLowerCase.__call__(new PyString("TEST!"));
        String realResult = (String) result.__tojava__(String.class);
        System.out.println(realResult);
    }
}
