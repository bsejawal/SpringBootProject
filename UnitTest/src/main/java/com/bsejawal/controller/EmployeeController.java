package com.bsejawal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bsejawal.model.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	
	
	@RequestMapping(value = "/1")
	public Employee getFirstEmployee() {
		Employee e = new Employee();
		e.setName("emp1");
		e.setEmpId(1);
		e.setDesignation("Java Developer");
		e.setSalary(800);
		return e;
	}
}
