package com.day2;

public class Runner {

	public static void main(String[] args) {
		Emp e1 = new Emp.Builder().setEmpName("Jatin").setEmpID("E101").setProject("Abc").setSalary(1000).setCompanyName("Accenture").build();
		System.out.println(e1);
	}
}