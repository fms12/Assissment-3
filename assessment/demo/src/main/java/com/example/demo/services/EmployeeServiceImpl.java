package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entites.Employee;

// this my serivce class so if i want change any thing though I can change here . its helps to remove the couplings
// its overriding the method of EmployeeService class 

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	List<Employee> list;

	
	public EmployeeServiceImpl() {
		list = new ArrayList<Employee>();
	}
//	return list so we can get the list in the json format ......

	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return list;
	}
	

// this method add employee inside the list ......
	
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		list.add(employee);
		return employee;
	}
// this method helps to get the employee by there IDs...
	
	@Override
	public Employee getEmployee(long employeeId) {
		Employee e = null;
		for(Employee employee:list) {
			if(employee.getId() == employeeId) {
				e = employee;
				break;
			}
		}
		return e;
	}
// this method just updating the employees......
	@Override
	public Employee updateEmployee(long employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		list.forEach(e ->{
			if(e.getId() == employee.getId()) {
				e.setName(employee.getName());
				e.setPlace(employee.getPlace());
				e.setDepartment(employee.getDepartment());
				
			}
		});
		return employee;
	}

	
	

}
