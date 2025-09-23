package com.InheritanceDemos;

public class Employee {
	private int empId;
	private String empName;
	private String gender;
	private double basicSalary;

	public Employee() {
		empId = 101;
		empName = "Amita";
		gender = "Female";
		basicSalary = 50000;
	}

	public Employee(int id, String nm, String gn, double bs) {
		empId = id;
		empName = nm;
		gender = gn;
		basicSalary = bs;
	}

	public void displayData() {
		System.out.println("Employee Id  : " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Gender       : " + gender);
		System.out.println("Basic Salary : " + basicSalary);
	}

	public double calculateSalary() {
		double da, hra, pf, net;

		da = basicSalary * 0.50;
		hra = basicSalary * 0.20;
		pf = basicSalary * 0.05;
		net = basicSalary + da + hra - pf;

		return net;
	}
}
