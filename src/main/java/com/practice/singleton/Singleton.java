package com.practice.singleton;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
	private static Singleton INSTANCE = null;

	private Singleton() {
		if (INSTANCE != null) {
			throw new IllegalStateException();
		}
	}

	private static Singleton getInstance() {
		synchronized (Singleton.class) {
			if (INSTANCE == null) {
				INSTANCE = new Singleton();
			}
		}
		return INSTANCE;
	}

	public Object readResolve() {
		return Singleton.getInstance();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	/*
	 * public void writeReplace(final ObjectOutputStream outputStream) throws
	 * IOException{ outputStream.writeObject(Singleton.getInstance()); }
	 */
}
