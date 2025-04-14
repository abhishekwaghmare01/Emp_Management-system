package com.MyPackage.Emp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Salary {
	@Id
	private int id;
	private int Salary;
	
	public Salary(int id, int Salary) {
		this.id = id;
		this.Salary = Salary;
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getSalary() {
		return Salary;
	}


	public void setSalary(int Salary) {
		this.Salary = Salary;
	}


	public Salary() {
		// TODO Auto-generated constructor stub
	}

}
