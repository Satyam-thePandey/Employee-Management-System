package com.practice.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.employee.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
