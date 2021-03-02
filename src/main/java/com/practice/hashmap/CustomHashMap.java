package com.practice;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class CustomHashMap<K, V> implements Map<K, V> {

	private static final int MAP_SIZE = 10;

	public CustomHashMap(int size) {
		super();
		this.table = new CustomEntry[size];
	}

	public CustomHashMap() {
		this.table = new CustomEntry[MAP_SIZE];
	}

	private CustomEntry<K, V>[] table;

	public int size() {
		return table.length;
	}

	private int indexForHash(int hash) {
		return hash % 10;
	}

	public boolean isEmpty() {
		return table.length > 0;
	}

	public boolean containsKey(Object key) {
		return false;
	}

	public boolean containsValue(Object value) {
		return false;
	}

	public V get(Object key) {
		int hash = key.hashCode();
		int index = indexForHash(hash);
		if (table[index] != null) {
			V value = table[index].value;
			return value;
		}
		return null;
	}

	public V put(K key, V value) {
		int hash = key.hashCode();
		int index = indexForHash(hash);
		V oldValue = null;
		if (table[index] == null) {
			CustomEntry<K, V> entry = new CustomEntry<K, V>();
			entry.key = key;
			entry.value = value;
			table[index] = entry;
		} else {
			oldValue = table[index].value;
			table[index].value = value;
		}

		return oldValue;

	}

	public V remove(Object key) {
		int hash = key.hashCode();
		int index = indexForHash(hash);
		V value = table[index].value;
		table[index] = null;
		return value;
	}

	public void putAll(Map<? extends K, ? extends V> m) {

	}

	public void clear() {
		table = null;
	}

	public Set<K> keySet() {
		return null;
	}

	public Collection<V> values() {
		return null;
	}

	public Set<Entry<K, V>> entrySet() {
		return null;
	}

}
