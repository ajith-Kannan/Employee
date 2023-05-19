package com.employee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmpoyeeException {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<Object> idNotFound() {
		return new ResponseEntity<>("No employee in the id", HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(EmployeeNameNotFound.class)
	public ResponseEntity<Object> givenNameNotFound() {
		return new ResponseEntity<>("No employee in the name", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(EmployeeAgeNotFoundException.class)
	public ResponseEntity<Object> givenAgeNotFound(){
		return new ResponseEntity<>("No employee in the Age",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(EmployeeSalaryNotFoundException.class)
	public ResponseEntity<Object> salaryNotHere(){
		return new ResponseEntity<>("Salary is not available in this id",HttpStatus.NOT_FOUND);
	}
	


}
