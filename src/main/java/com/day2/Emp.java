package com.day2;

public class Emp {

	private String empName;
	private String empID;
	private String project;
	private double salary;
	private String companyName;
	
	
	// Constructor can call another constructor - we call this as a constructor chaining - using this or super keyword - 1st line in constructor block
	private Emp(String empName, String empID, String project, double salary, String companyName) {
		super(); // call the parent class constructor
		this.empName = empName;
		this.empID = empID;
		this.project = project;
		this.salary = salary;
		this.companyName = companyName;
	}


	@Override
	public String toString() {
		return "Emp [empName=" + empName + ", empID=" + empID + ", project=" + project + ", salary=" + salary
				+ ", companyName=" + companyName + "]";
	}
	
	// Inner Class
	// Can a Class be static - yes, only inner Class in Java is static
	public static class Builder {
		private String empName;
		private String empID;
		private String project;
		private double salary;
		private String companyName;
		
		public Builder setEmpName(String empName) {
			this.empName=empName;
			return this; // current Builder Object instance
		}
		
		public Builder setEmpID(String empID) {
			this.empID=empID;
			return this; // current Builder Object instance
		}
		
		public Builder setProject(String project) {
			this.project=project;
			return this; // current Builder Object instance
		}
		
		public Builder setSalary(double salary) {
			this.salary=salary;
			return this; // current Builder Object instance
		}
		
		public Builder setCompanyName(String companyName) {
			this.companyName=companyName;
			return this; // current Builder Object instance
		}
		
		public Emp build() {
			Emp emp = new Emp(companyName, companyName, companyName, salary, companyName);
			return emp;
		}
	}
	
}