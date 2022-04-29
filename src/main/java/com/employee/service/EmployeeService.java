package com.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;

public class EmployeeService {
	@Autowired  
	EmployeeRepository employeeRepository;  
	
	public List<Employee> getAllEmployee()   
	{  
	List<Employee> employees = new ArrayList<Employee>();  
	employeeRepository.findAll().forEach(employee -> employees.add(employee));  
	return employees;  
	}  

	public Employee getStudentById(int id)   
	{  
	return employeeRepository.findById(id).get();  
	}  
	public void saveOrUpdate(Employee employee)   
	{  
	employeeRepository.save(employee);  
	}  
	//deleting a specific record  
	public void delete(int id)   
	{  
	employeeRepository.deleteById(id);  
	}  

}
