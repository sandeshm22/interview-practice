package com.practice.staticexample;

public class StaticModifier {

	static int i = 0;
	static {
		int k = 10 / i;

	}
	static {
		try {
			Thread.sleep(1000);
			System.out.println("static example  " + i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("sss");
	}

}
