package com.example.demo;

import org.python.core.PyInteger;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

class Demo {
	public static void main(String a[]) {

		PythonInterpreter python = new PythonInterpreter();

		int number1 = 10;
		int number2 = 32;
		int[] prodValues = { 1, 2, 3, 4 };
		python.set("number1", new PyInteger(number1));
		python.set("number2", new PyInteger(number2));
		python.exec("number3 = number1+number2");
		PyObject number3 = python.get("number3");
		System.out.println("val : " + number3.toString());
	}
}
