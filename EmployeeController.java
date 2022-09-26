package com.Emp.ems.controller;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Emp.ems.model.Employee;
import com.Emp.ems.repository.EmployeeService;
import com.Emp.ems.service.EmployeeServicetax;

@RestController
@RequestMapping("/SaveEmployee")
public class EmployeeController {
        @Autowired
        EmployeeService empService;

        @RequestMapping(value="/employees", method=RequestMethod.POST)
        public Employee createEmployee(@RequestBody Employee emp) {
            return empService.createEmployee(emp);
        }
        
        @RequestMapping(value="/employeesfinal", method=RequestMethod.GET)
        public Model readEmployees() throws Exception {
        	 JSONArray EmployeeArray = new JSONArray();
        
        	 EmployeeArray=EmployeeServicetax.getEmpTax(); 
        	
            return (Model) EmployeeArray;
        }
        
}
