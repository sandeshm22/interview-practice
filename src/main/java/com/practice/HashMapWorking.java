package com.practice;

import java.util.Map;

public class HashMapWorking {
	public static void main(String[] args) {
		Map<String, String> dataMap = new CustomHashMap<String, String>(10);
		for (int i = 0; i < 1; i++) {
			String data = "data - " + i;
			String key = String.valueOf(i);
			dataMap.put(key, data);
		}
		
		System.out.println(dataMap.size());

		for (int i = 0; i < 10; i++) {
			System.out.println(dataMap.get(String.valueOf(i)));
		}

	}

}
