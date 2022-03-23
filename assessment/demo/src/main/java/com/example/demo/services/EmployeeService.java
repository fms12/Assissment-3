package com.example.demo.services;

import com.example.demo.entites.Employee;

import java.util.*;


// it's super class 
public interface EmployeeService {
	
	public List<Employee> getEmployee();

	public Employee addEmployee(Employee employee);

	public Employee getEmployee(long employeeId);

	public Employee updateEmployee(long employeeId);

//	Employee updateEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);
	

	
	
	

}
