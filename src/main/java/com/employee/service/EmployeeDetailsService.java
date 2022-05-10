package com.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.employee.model.EmployeeDetails;
import com.employee.repository.EmployeeDetailsRepository;


@Service
public class EmployeeDetailsService {
	@Autowired
	EmployeeDetailsRepository employeedetailsRepository;

	public List<EmployeeDetails> getAllEmployeedetails() {
		List<EmployeeDetails> employeesdetails = new ArrayList<EmployeeDetails>();
		employeedetailsRepository.findAll().forEach(employeedetails -> employeesdetails.add(employeedetails));
		return employeesdetails;
	}

	public EmployeeDetails getEmployeeDetailsById(int id) {
		return employeedetailsRepository.findById(id).get();
	}

	public void saveOrUpdate(EmployeeDetails employeedetails) {
		employeedetailsRepository.save(employeedetails);
	}

	public void delete(int id) {
		employeedetailsRepository.deleteById(id);
	}

}
