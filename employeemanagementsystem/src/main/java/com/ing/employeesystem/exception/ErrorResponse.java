package com.ing.employeesystem.exception;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ErrorResponse {
	private String message;
	private String httpStatusCode;
	private LocalDateTime localDate;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getHttpStatusCode() {
		return httpStatusCode;
	}

	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public LocalDateTime getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDateTime localDate) {
		this.localDate = localDate;
	}

	@Override
	public String toString() {
		return "ErrorResponse [message=" + message + ", httpStatusCode=" + httpStatusCode + ", localDate=" + localDate
				+ ", getMessage()=" + getMessage() + ", getHttpStatusCode()=" + getHttpStatusCode()
				+ ", getLocalDate()=" + getLocalDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public ErrorResponse(String message, String httpStatusCode, LocalDateTime localDate) {
		super();
		this.message = message;
		this.httpStatusCode = httpStatusCode;
		this.localDate = localDate;
	}

	public ErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

}
