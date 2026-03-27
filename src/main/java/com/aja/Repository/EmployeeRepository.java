package com.aja.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aja.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
