package com.employee.service;

import com.employee.DTO.EmployeeDTO;
import com.employee.entity.Employee;
import com.employee.exception.EmployeeNotFound;

public interface IEmployeeservice {
	
	public EmployeeDTO getEmployeeById(long id) throws EmployeeNotFound;
	
}
