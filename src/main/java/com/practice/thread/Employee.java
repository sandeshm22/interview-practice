package com.practice.thread;

public class Employee {

	private int empID;

	/**
	 * @return the empID
	 */
	public int getEmpID() {
		return empID;
	}

	/**
	 * @param empID the empID to set
	 */
	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public void incrementEmpID() {
		this.empID++;
	}

}
