package com.ing.employeesystem.exceptionhandler;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.ing.employeesystem.exception.ErrorResponse;
import com.ing.employeesystem.exception.InvalidException;
import com.ing.employeesystem.exception.RecordNotFoundException;

/**
 * 
 * @author Amala
 *
 */

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	/**
	 * 
	 * @param exception this is the parameter for handleUserNotFoundException method
	 * @return exception details
	 */
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<Object> handleUserNotFoundException(RecordNotFoundException exception) {

		ErrorResponse eeErrorResponse = new ErrorResponse();

		eeErrorResponse.setHttpStatusCode("EMS404");
		eeErrorResponse.setLocalDate(LocalDateTime.now());
		eeErrorResponse.setMessage(exception.getMessage());

		return new ResponseEntity<>(eeErrorResponse, HttpStatus.NOT_FOUND);
	}

	/**
	 * 
	 * @param exception this is the parameter for handleMethodArgumentNotValid
	 *                  method
	 * @return exception detail
	 */

	@ExceptionHandler(InvalidException.class)
	public ResponseEntity<Object> handleMethodArgumentNotValid(InvalidException exception) {

		ErrorResponse eeErrorResponse = new ErrorResponse();

		eeErrorResponse.setHttpStatusCode("EMS404");
		eeErrorResponse.setLocalDate(LocalDateTime.now());
		eeErrorResponse.setMessage(exception.getMessage());

		return new ResponseEntity<>(eeErrorResponse, HttpStatus.NOT_FOUND);
	}

}
