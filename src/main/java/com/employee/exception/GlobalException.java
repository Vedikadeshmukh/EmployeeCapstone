package com.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(EmployeeNotFound.class)
	public ResponseEntity<Object> handleEmployeeNotFound(){
		return  new ResponseEntity<>("Invalid Employee Id",HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
}
