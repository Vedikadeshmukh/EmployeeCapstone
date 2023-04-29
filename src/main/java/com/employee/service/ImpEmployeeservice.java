package com.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.DTO.EmployeeDTO;
import com.employee.encryption.AesEncryptor;
import com.employee.entity.Employee;
import com.employee.exception.EmployeeNotFound;
import com.employee.repository.EmployeeRepo;

@Service
public class ImpEmployeeservice implements IEmployeeservice {

	@Autowired
	EmployeeRepo repo;
	
	@Override
	public EmployeeDTO getEmployeeById(long id) throws EmployeeNotFound{
		
		Employee emp=repo.findById(id).orElse(null);
		if(emp==null) {
			throw new EmployeeNotFound(null);
		}
		
		EmployeeDTO dto=new EmployeeDTO();
		String x=AesEncryptor.encrypt(emp.getDOB().toString());
		dto.setDOB(x);
		dto.setId(id);
		dto.setName(emp.getName());
		return dto;
	}

}
