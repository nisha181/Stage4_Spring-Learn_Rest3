package com.cognizant.springlearn.service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cognizant.springlearn.Employee;
import com.cognizant.springlearn.dao.EmployeeDao;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);
	
	public EmployeeService() {
		LOGGER.debug("Employee Rest Service Called!");
	}

	
	public ArrayList<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
		
	}
}
