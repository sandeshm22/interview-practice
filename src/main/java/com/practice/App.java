package com.practice;

/**
 * Hello world!
 *
 */
public class App {

	static {
		System.out.println(App.staticString + " " + App.staticInteger);
	}

	final static Integer staticInteger = 1;

	final static String staticString = "static";
	static int x = method("x");

	static {
		System.out.println("init 1");
	}

	static int y = method("y");

	static {
		System.out.println("init 2");
	}

	static int method(String name) {
		System.out.println(name);
		return 0;
	}

	public static void main(String[] args)// throws Exception
	{
	}
}
