package com.Emp.ems.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.Emp.ems.model.Employee;

@Repository
public interface EmployeeRepository  {

	List<Employee> findAll();;

	Employee save(Employee emp);

	void deleteById(Long empId);

}
