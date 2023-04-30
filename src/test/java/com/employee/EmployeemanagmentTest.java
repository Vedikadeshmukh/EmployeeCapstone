package com.employee;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.employee.DTO.EmployeeDTO;
import com.employee.exception.EmployeeNotFound;
import com.employee.service.IEmployeeservice;

@SpringBootTest
class EmployeemanagmentTest {
	@Autowired
	IEmployeeservice service;

	@Test
	void testGetEmployeeById() throws EmployeeNotFound {
		EmployeeDTO emp =service.getEmployeeById(101);
		assertEquals(emp.getId(),101);
	}

}
