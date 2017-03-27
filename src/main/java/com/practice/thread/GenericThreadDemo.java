package com.practice.thread;

public class GenericThreadDemo {
	public static void main(String[] args) {
		final Employee employee = new Employee();
		employee.setEmpID(1);
		final GenericThread cr1 = new GenericThread();
		final GenericThread cr2 = new GenericThread();
		cr1.setEmployee(employee);
		cr2.setEmployee(employee);
		final Thread t1 = new Thread(cr1, "one");
		final Thread t2 = new Thread(cr2, "two");
		t1.start();
		t2.start();
	}
}
