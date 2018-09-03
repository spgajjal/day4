package com.capgemini.icici.domain;

public class Employee {
	
	
	long employeeId ;
	String employeeName ;
	double basicSalary ;
	double HRA=0 ;
	double PF=0 ;
	double PT=0 ;
	double grossSalary ;
	double medical ;
	double netSalary ;

	public Employee()
	{
		
	}


	public Employee(long employeeId, String employeeName, double medical) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.medical = medical;
	}


	public double calculateNetSalary(double basicSalary)
	{
		HRA=0.5*basicSalary ;
		PF=0.12*basicSalary ;
		grossSalary=HRA+basicSalary+medical ;
		netSalary=grossSalary-(PF+PT) ;
		return netSalary ;
	}

	public void displayEmployeInformation()
	{
		System.out.println("id: "+employeeId+"\nname"+employeeName+"\nNetSalary"+netSalary);
	}


	}		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

