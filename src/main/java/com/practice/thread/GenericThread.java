package com.practice.thread;

import java.util.concurrent.locks.ReentrantLock;

public class GenericThread implements Runnable {

	private Employee employee;
	private final ReentrantLock lock = new ReentrantLock();

	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * @param employee
	 *            the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void run() {
			//this.lock.try
			
			try {
				final String currentThread = Thread.currentThread().getName();
				System.out.println(currentThread);
				if ("one".equals(currentThread)) {
					Thread.sleep(10000);
					if (this.getEmployee().getEmpID() > 1) {
						throw new Exception();
					}
				} else {
					this.getEmployee().incrementEmpID();
				}
			} catch (Exception e) {

			}
		//}
	}

}
