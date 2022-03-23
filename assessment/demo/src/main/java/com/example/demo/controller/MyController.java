package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Employee;
import com.example.demo.services.EmployeeService;


@RestController
public class MyController {
	
	

	@Autowired(required = true)
	private EmployeeService emploService;
	
	
//	we can get all the data and see the json
	
	@GetMapping("/employee")
	public List<Employee> getEmployee(){
		return this.emploService.getEmployee();
		}
	
//	add the employee inside the list
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return this.emploService.addEmployee(employee);
	}
	
//	get the employee by there ID 
	
	@GetMapping("/employee/{employeeId}")
	public Employee getEmployee(@PathVariable String employeeId) {
		return this.emploService.getEmployee(Long.parseLong(employeeId));
	}
//in this method I've update the employees
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee){
		return this.emploService.updateEmployee(employee);
	}
}
