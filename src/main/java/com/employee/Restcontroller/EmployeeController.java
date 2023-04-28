package com.employee.Restcontroller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.DTO.EmployeeDTO;
import com.employee.exception.EmployeeNotFound;
import com.employee.service.IEmployeeservice;

@RestController
@RequestMapping("/Employeedetails")
public class EmployeeController {

	Logger logger =LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	IEmployeeservice service;
	
	@GetMapping("/fetch/{id}")
	public EmployeeDTO getEmployeeById(@PathVariable @Valid long id) throws EmployeeNotFound{
		logger.info("[getEmployeeById] info message");
		logger.warn("[getEmployeeById] warn message");
		logger.debug("[getEmployeeById] debug message");
		logger.error("[getEmployeeById] error message");
		logger.trace("[getEmployeeById] trace message");
		return service.getEmployeeById(id);
		
	}
}