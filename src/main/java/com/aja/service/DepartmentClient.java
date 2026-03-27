package com.aja.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.aja.dto.DepartmentDto;

@FeignClient(name="103-department-service")
public interface DepartmentClient {
	
	@GetMapping("/fetch/{id}")
	public DepartmentDto fetchById(@PathVariable  Long id);

}
