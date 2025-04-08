package com.example.anu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
@Id
private int id;
private String name;
private String gender;
private Double sal;
public Employee(int id, String name, String gender,Double sal) {
	
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.sal=sal;
}
public Employee() {
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Double getSal() {
	return sal;
}
public void setSal(Double sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ",sal=" + sal + "]";
}

}
