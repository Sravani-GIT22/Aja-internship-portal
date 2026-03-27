package com.aja.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.aja.entity.Employee;
import com.aja.service.impl.EmployeeServiceImplementation;

public class EmployeeController {
	
	private EmployeeServiceImplementation empServiceImpl;
	
	@PostMapping("/create")
	public Employee saveEmployee(@RequestBody  Employee employee) {
		return empServiceImpl.createEmployee(employee);
		
	}
	

	@GetMapping("/fetch")
	public List<Employee>viewEmployee(){
		return empServiceImpl.viewAlllEmployees();
		
	}

}
