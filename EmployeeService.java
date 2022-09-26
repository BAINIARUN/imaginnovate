package com.Emp.ems.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Emp.ems.model.Employee;

@Service
public class EmployeeService {

        @Autowired
		static
            EmployeeRepository empRepository;  
        
     // CREATE 
        public Employee createEmployee(Employee emp) {
        	
        	
        	
            return empRepository.save(emp);
        }

        // READ
        public List<Employee> getEmployees() {
        	
        	
            return empRepository.findAll();
        }

        // DELETE
        public void deleteEmployee(Long empId) {
            empRepository.deleteById(empId);
        }
        	public static List<Employee> getallEmployees() {
        	
        	
            return empRepository.findAll();
        }
        
}
