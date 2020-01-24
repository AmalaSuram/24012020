package com.ing.employeesystem.dto;

public class EmployeeRequestDto {
	private String employeeName;

	private String employeeMail;
	private String employeePh;

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

	public EmployeeRequestDto(String employeeName, String employeeMail, String employeePh) {
		super();
		this.employeeName = employeeName;
		this.employeeMail = employeeMail;
		this.employeePh = employeePh;
	}

	public EmployeeRequestDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EmployeeRequestDto [employeeName=" + employeeName + ", employeeMail=" + employeeMail + ", employeePh="
				+ employeePh + ", getEmployeeName()=" + getEmployeeName() + ", getEmployeeMail()=" + getEmployeeMail()
				+ ", getEmployeePh()=" + getEmployeePh() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
