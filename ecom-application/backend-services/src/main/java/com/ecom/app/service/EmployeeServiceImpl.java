package com.ecom.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.app.entity.Employee;
import com.ecom.app.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public String save(Employee emp) {
		try {
			
			emp = employeeRepository.save(emp);
			
		}catch (Exception e) {
			return "Failed";
		}
		return emp != null ? "Success" : "Failed";
	}
	
	@Override
	public Employee find(Long id) {
		return employeeRepository.findOne(id);
	}
}
