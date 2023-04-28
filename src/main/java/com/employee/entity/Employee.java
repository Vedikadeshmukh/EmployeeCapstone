package com.employee.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@Column(name="employee_id")
	@NotNull
	private long id;
	@Column(name="employee_name")
	@NotBlank
	@NotNull
	private String name;
	@Column(name="employee_date_of_birth")
	@NotNull
	private Date DOB;
	
	

}