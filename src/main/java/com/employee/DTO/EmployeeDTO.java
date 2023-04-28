package com.employee.DTO;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class EmployeeDTO {

	@Column(name="employee_id")
	private long id;
	@Column(name="employee_name")
	private String name;
	@Column(name="employee_date_of_birth")
	private String DOB;
}