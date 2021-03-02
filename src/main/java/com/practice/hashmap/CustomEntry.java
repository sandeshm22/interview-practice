package com.practice;

import java.util.Map.Entry;

public class CustomEntry<K, V> implements Entry<K, V> {

	K key;
	V value;
	int hash;

	public K getKey() {
		return this.key;
	}

	public V getValue() {
		return this.value;
	}

	public V setValue(V theValue) {
		V val = this.value;
		this.value = theValue;
		return val;
	}

}
