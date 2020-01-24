package com.ing.employeesystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId;

	private String employeeName;

	private String employeeMail;
	private String employeePh;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeMail() {
		return employeeMail;
	}
	public void setEmployeeMail(String employeeMail) {
		this.employeeMail = employeeMail;
	}
	public String getEmployeePh() {
		return employeePh;
	}
	public void setEmployeePh(String employeePh) {
		this.employeePh = employeePh;
	}
	public Employee(int employeeId, String employeeName, String employeeMail, String employeePh) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeMail = employeeMail;
		this.employeePh = employeePh;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeMail="
				+ employeeMail + ", employeePh=" + employeePh + ", getEmployeeId()=" + getEmployeeId()
				+ ", getEmployeeName()=" + getEmployeeName() + ", getEmployeeMail()=" + getEmployeeMail()
				+ ", getEmployeePh()=" + getEmployeePh() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
