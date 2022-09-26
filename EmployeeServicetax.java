package com.Emp.ems.service;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.Emp.ems.model.Employee;
import com.Emp.ems.repository.EmployeeService;
import com.Emp.ems.repository.Employeeserviceimp;

public class EmployeeServicetax {
	
	public static JSONArray getEmpTax() throws JSONException {
		
			List<Employee> Employees=EmployeeService.getallEmployees();
		
		JSONArray jsonarry = new JSONArray();
		for(Employee emp:Employees) {
			int salary=emp.getSalary();
			int tax=0;
			int Chess=0;
			if (salary>2500000) {
				Chess=(salary/100)*2;
			}
			if(emp.getSalary()>1000000) {
				int t1=salary-1000000;
				t1=(t1/100)*20;
				tax=tax+37500;
			}
			else if(emp.getSalary()>500000&&emp.getSalary()<1000001) {
				
				
				tax=37500;
			}
			else if(emp.getSalary()>250000 && emp.getSalary()<500001) {
				tax=12500;
						}
			else if(emp.getSalary()<=250000) {
				tax=0;
			}
			JSONObject obj=new JSONObject();
			obj.put("EmpName",emp.getFirstName()+" "+emp.getSecondName());
			obj.put("tax",tax);
			obj.put("EmpId",emp.getEmpId());
			obj.put("chess",Chess);
			jsonarry.put(obj);
			
		}
		
		
		
		return jsonarry;
		
	}
	
	
	

}
