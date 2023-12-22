package com.employee_management_System.entityClass;

import javax.persistence.Entity; 
import javax.persistence.Id;

@Entity
public class Employeedata {
	private int id;
	private String fname;
	private String lname;
	private String designation;
	private String salary;
	private int age;
	private String email;
	private String experience;
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "EmployeeData [id=" + id + ", fname=" + fname + ", lname=" + lname + ", designation=" + designation
				+ ", salary=" + salary + ", age=" + age + ", email=" + email + ", experience=" + experience + "]";
	}
	
	
	
	
	

}
