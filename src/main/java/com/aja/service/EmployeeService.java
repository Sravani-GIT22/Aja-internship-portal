package com.aja.service;

import java.util.List;

import com.aja.dto.EmployeeDepartmentDto;
import com.aja.entity.Employee;

public interface EmployeeService {
	
	public Employee createEmployee(Employee employee);
	public List<Employee>viewAlllEmployees();
	
	
	public EmployeeDepartmentDto fetchById(long eid);
}
