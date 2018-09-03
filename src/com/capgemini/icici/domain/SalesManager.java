package com.capgemini.icici.domain;

public class SalesManager extends Employee {
	double petrolAllowance ;
	double foodAllowance ;
	double otherAllowance ;
	
	public SalesManager(long employeeId, String employeeName, double medical) {
		super(employeeId, employeeName, medical);
		this.petrolAllowance=petrolAllowance ;
		this.foodAllowance=foodAllowance ;
		this.otherAllowance=otherAllowance ;
	}
	
	public double calculateNetSalary(double basicSalary)
	{
		petrolAllowance=0.08*basicSalary ;
		foodAllowance=0.13*basicSalary ;
		otherAllowance=0.03*basicSalary ;
		return super.calculateNetSalary(basicSalary)+petrolAllowance+foodAllowance+otherAllowance ;
	}
	
	
	

}
	
	


