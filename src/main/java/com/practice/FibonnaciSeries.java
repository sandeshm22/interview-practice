package com.practice;

public class FibonnaciSeries {

	public static void main(String[] args)  throws OutOfBoundsException{
		int n = 4, i = 0;
		for (int c = 1; c <= n; c++) {
			System.out.println(new FibonnaciSeries().fibonacci(i));
			i++;
		}
		System.out.println(new FibonnaciSeries().fibonacci(4));
	}

	public int fibonacci(int n) {
		if (n == 0) {
			return n;
		} else if (n == 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
