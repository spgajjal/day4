package com.capgemini.icici.domain;

public class President extends Employee {

	double kilometerTravelled ;
	double tourAllowance ;
	final static double telephoneallowance=2000;
	public President() {
		super();
		// TODO Auto-generated constructor stub
	}
	public President(long employeeId, String employeeName,double medical,double kilometerTravelled) {
		super(employeeId, employeeName, medical);
		this.kilometerTravelled=kilometerTravelled ;
		}
	public double calculateNetSalary(double basicSalary)
	{	tourAllowance=8*kilometerTravelled ;
		return super.calculateNetSalary(basicSalary)+tourAllowance+telephoneallowance ;
	}
	
	
	
	

}
