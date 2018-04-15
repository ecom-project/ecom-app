package com.ecom.app.service;

import com.ecom.app.entity.Employee;

public interface EmployeeService {

	public String save(Employee emp);

	public Employee find(Long id);

}
