package com.practice.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorVsForEach {
	public static void main(String args[]) {
		List<String> names = new ArrayList<String>();
		names.add("Sandesh");
		names.add("Aadesh");
		names.add("Vikesh");
		names.add("Ankit");
		names.add("Sunny");
		names.add("Ravi");
		names.add("Siddharth");
		names.add("Rakesh");
		names.add("Ashwin");
		List<String> strNames = new ArrayList<String>(names);
		Iterator<String> namesItr = strNames.iterator();
		int change = 0;
		while (namesItr.hasNext()) {
			String str = namesItr.next();
			if (change == 1){
				namesItr.remove();
			}
			System.out.println(str);
			change++;
		}
		
		System.out.println(names);
		
		
		
		/*
		change = 0;
		for (String name : names) {
			change++;
			if (change == 1)
				{}//names.remove(1);
		}
		change = 0;
		for (int i = 0; i < names.size(); i++) {
			change++;
			if (change == 1)
				names.remove(1);
			//System.out.print(names.get(i));
		}
		 */	
		}
}
