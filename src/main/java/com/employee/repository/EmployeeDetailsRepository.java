package com.employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.employee.model.EmployeeDetails;

public interface EmployeeDetailsRepository extends CrudRepository<EmployeeDetails, Integer> {

}
