package com.MyPackage.Emp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Employe {
	@Id
	private int DptID;
	private String name;
	private String Dept;
	private String jDate;
	@OneToOne
	private Salary sal;
	
	public Employe(int di, String n, String d, String jd, Salary s) {
		this.DptID = di;
		this.name = n;
		this.Dept = d;
		this.jDate = jd;
		this.sal = s;
	}

	public int getDptID() {
		return DptID;
	}

	public void setDptID(int dptID) {
		DptID = dptID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	public String getjDate() {
		return jDate;
	}

	public void setjDate(String jDate) {
		this.jDate = jDate;
	}

	public Salary getSal() {
		return sal;
	}

	public void setSal(Salary sal) {
		this.sal = sal;
	}
	
	public Employe() {
		
	}
	

}
