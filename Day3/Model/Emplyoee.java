package com.sonata.Model;

public class Emplyoee {
	private int empId;
	private String empName;
	private double sal;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Empbean [empId=" + empId + ", empName=" + empName + ", sal=" + sal + "]";
	}

}
