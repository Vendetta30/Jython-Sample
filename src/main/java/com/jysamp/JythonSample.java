package com.jysamp;

import org.python.util.PythonInterpreter;

public class JythonSample {

    public static void main(String[] args) {

        try {
            JythonEngineDetails details = new JythonEngineDetails();
            details.details();

            PythonInterpreter interpreter = new PythonInterpreter();

            JythonCommonExample jythonCommonExample = new JythonCommonExample(interpreter);
            jythonCommonExample.example();

            JythonMethodExample jythonMethodExample = new JythonMethodExample(interpreter);
            jythonMethodExample.example();

            System.out.println("*****************************************************");
            System.out.println("*****************************************************");
            System.out.println("*****************************************************");
            System.out.println("*****************************************************");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}