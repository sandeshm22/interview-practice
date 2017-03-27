package com.practice.accessmodifier;

import java.util.NavigableSet;
import java.util.SortedSet;

public class OuterClass {

	public static class Nested {

	}
	
	class Inner{
		
	}

	public static void main(String[] args) {
		Object clazz = new OuterClass.Nested();
		Inner inner = new OuterClass().new Inner();
		NavigableSet set = null;
	}
}