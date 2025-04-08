package com.example.anu.service;

import java.util.Arrays;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.anu.dao.EmployeeDao;
import com.example.anu.entity.Employee;

@Service
public class EmpService {
private EmployeeDao employeeDao;

public EmpService(EmployeeDao employeeDao) {
	
	this.employeeDao = employeeDao;
}

public void getEmps() {
	Iterable<Employee> emps = employeeDao.findAll();
	 
	emps.forEach(System.out::println);
}
public void saveEmps() {
	Employee e4=new Employee(20,"sita","female",10000.00);
	Employee e5=new Employee(30,"laxman","male",20000.00);
	Employee e6=new Employee(40,"hanuman","male",30000.00);
	List <Employee> l=Arrays.asList(e4,e5,e6);
//	l.add(e4);
//	l.add(e5);
//	l.add(e6);
	employeeDao.saveAll(l);
	System.out.println(l);
}
public void saveEmp() {
	Employee e= new Employee(0,null,null,null);
	e.setId(10);
	e.setName("ram");
	e.setGender("male");
	e.setSal(10000.00);
	Employee e1=employeeDao.save(e);
	System.out.println(e1);
	System.out.println(e);
	
}

public void calCustomQueries(Integer id) {
	//List<Employee> a =employeeDao.getAllEm();
	Employee a1= employeeDao.getEmpById(id);
   // List<Employee> a2 = employeeDao.getEmpsByHql();
//	a2.forEach(System.out::println);
	System.out.println(a1);
}

public void calByFindBy(Double sal) {
	//List <Employee> a = employeeDao.findByName(name);
  //  List <Employee> a1 = employeeDao.findBySal(sal);
    List <Employee> a2 = employeeDao.findBySalGreaterThanEqual(sal);

    a2.forEach(System.out::println);
}
}
