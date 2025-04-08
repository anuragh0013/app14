package com.example.anu.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.anu.entity.Employee;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {
	
	
	
	@Query("from Employee")
    public List<Employee> getEmpsByHql(); 
	
	
	@Query("from Employee where id=:id")
    public Employee getEmpById(Integer id);
	
	
	@Query(value = "Select * from employee",nativeQuery=true)
	public List<Employee> getAllEm();
	
	public List<Employee> findByName(String name);
	
	public List<Employee> findBySal(Double sal);
	
	public List<Employee> findBySalGreaterThanEqual(Double sal);
}
