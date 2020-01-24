package com.ing.employeesystem.dto;

public class EmployeeResponseDto {
	private String message;
	private int statusCode;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public EmployeeResponseDto(String message, int statusCode) {
		super();
		this.message = message;
		this.statusCode = statusCode;
	}
	public EmployeeResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ResponseDto [message=" + message + ", statusCode=" + statusCode + ", getMessage()=" + getMessage()
				+ ", getStatusCode()=" + getStatusCode() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


}
