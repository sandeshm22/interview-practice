package com.practice.accessmodifier;

class DefaultAccess {
	String defaultString = "default";
}

class Default extends DefaultAccess {
	static DefaultAccess access = new DefaultAccess();

	public static void main(String[] args) {
		String str = access.defaultString;
		str.concat(str);
	}
}