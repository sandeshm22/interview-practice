package com.practice.memory.leak;

import java.io.*;
import java.util.*;

public class Leaks {
	public static void main(String[] args) throws Throwable {
		Runtime rt = Runtime.getRuntime();
		double alloc = rt.totalMemory() / 1000.0;
		double free = rt.freeMemory() / 1000.0;
		System.out.printf("Allocated: %.2f kb\nFree: %.2f kb\n\n", alloc, free);
		Scanner in = new Scanner(new File("D:\\logging.log"));
		ArrayList<String> al = new ArrayList<String>();
		while (in.hasNextLine()) {
			String s = in.nextLine();
			al.add(s.substring(0, 5)); // extracts first 1 character
		}
		alloc = rt.totalMemory() / 1000.0;
		free = rt.freeMemory() / 1000.0;
		System.out.printf("Allocated: %.2f kb\nFree: %.2f kb\n\n", alloc, free);
		in.close();
		al = null;
		System.gc();
		alloc = rt.totalMemory() / 1000.0;
		free = rt.freeMemory() / 1000.0;
		System.out.printf("Allocated: %.2f kb\nFree: %.2f kb\n\n", alloc, free);
	}
}