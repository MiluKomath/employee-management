package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.EmployeeDetails;
import com.employee.service.EmployeeDetailsService;

@RestController
public class EmployeeDetailsController {
	@Autowired
	EmployeeDetailsService employeedetailsService;

	@GetMapping("/employeedetails")
	private List<EmployeeDetails> getAllEmployeeDetails() {
		return employeedetailsService.getAllEmployeedetails();
	}

	@GetMapping("/employeedetails/{id}")
	private EmployeeDetails getEmployeeDetails(@PathVariable("id") int id) {
		return employeedetailsService.getEmployeeDetailsById(id);
	}

	@DeleteMapping("/employeedetails/{id}")
	private void deleteEmployeeDetails(@PathVariable("id") int id) {
		employeedetailsService.delete(id);
	}

	@PutMapping("/employeedetails/{id}")
	private int updateEmployeeDetails(@RequestBody EmployeeDetails employeedetails) {
		employeedetailsService.saveOrUpdate(employeedetails);
		return employeedetails.getId();

	}

	@PostMapping("/employeedetail")
	private int saveEmployee(@RequestBody EmployeeDetails employeedetails) {
		employeedetailsService.saveOrUpdate(employeedetails);
		return employeedetails.getId();
	}

}
