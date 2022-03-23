package com.example.demo.entites;



public class Employee {
		
	private long Id;
	private String name;
	private String place;
	
	
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", place=" + place + ", department=" + department + "]";
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(long id, String name, String place, String department) {
		super();
		Id = id;
		this.name = name;
		this.place = place;
		this.department = department;
	}
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	private String department;
	
	
}
