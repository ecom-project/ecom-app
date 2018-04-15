package com.ecom.app.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.app.entity.Employee;
import com.ecom.app.service.EmployeeService;

@RestController
@RequestMapping(AbstractController.EMPLOYEE)
public class EmployeeController extends AbstractController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping(value = SAVE)
	public ResponseEntity<String> saveEmployee(@RequestBody Employee emp) {
		return ResponseEntity.ok(employeeService.save(emp));
	}

	@GetMapping(value = FIND)
	public ResponseEntity<Employee> find(@PathVariable("id") Long id) {
		return ResponseEntity.ok(employeeService.find(id));
	}

}
