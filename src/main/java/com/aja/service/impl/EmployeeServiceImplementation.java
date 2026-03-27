package com.aja.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.aja.Repository.EmployeeRepository;
import com.aja.dto.DepartmentDto;
import com.aja.dto.EmployeeDepartmentDto;
import com.aja.entity.Employee;
import com.aja.service.DepartmentClient;
import com.aja.service.EmployeeService;

public class EmployeeServiceImplementation implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepo;
	@Autowired
	private DepartmentClient departmentClient;

	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	public List<Employee> viewAlllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	@Override
	public EmployeeDepartmentDto fetchById(long eid) {
		// TODO Auto-generated method stub
		
		Employee emp=employeeRepo.findById(eid).get();
		DepartmentDto fetchById=departmentClient.fetchById(emp.getDepartmentId());
		EmployeeDepartmentDto empDto=new EmployeeDepartmentDto();
		empDto.setFirstName(emp.getFirstName());
		empDto.setLastName(emp.getLastName());
		empDto.setDname(fetchById.getDname());
		empDto.setLocation(fetchById.getLocation());
		return empDto;
	}

}
