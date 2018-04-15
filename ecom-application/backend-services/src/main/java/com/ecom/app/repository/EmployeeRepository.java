package com.ecom.app.repository;

import org.springframework.stereotype.Repository;

import com.ecom.app.entity.Employee;

@Repository
public interface EmployeeRepository extends AbstractRepository<Employee, Long> {

}
