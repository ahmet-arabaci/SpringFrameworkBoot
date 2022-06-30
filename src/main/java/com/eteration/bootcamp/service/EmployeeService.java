package com.eteration.bootcamp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.eteration.bootcamp.model.EmployeeModel;

@Service
public class EmployeeService {

	EmployeeModel employee1 = new EmployeeModel();
	EmployeeModel employee2 = new EmployeeModel();
	EmployeeModel employee3 = new EmployeeModel();
	List<EmployeeModel> employeeList = new ArrayList<EmployeeModel>();
	
	public List<EmployeeModel> getEmployeeList() {
		return employeeList;
	}
	
	public String addEmployeeList(EmployeeModel emp) {
		try {
			employeeList.add(emp);
			return "OK";
		} catch (Exception e) {
			return "NOK";
		}
	}
	
	public String updateEmployeeList(int id, EmployeeModel emp) {
		try {
			for (int i=0; i<employeeList.size(); i++) {
				if (id == employeeList.get(i).getId()) {
					employeeList.set(i, emp);
				}
			}
			return "OK";
		} catch (Exception e) {
			return "NOK";
		}
	}
	
	public List<EmployeeModel> deleteEmployee(int id) {
		for (int i = 0; i<employeeList.size(); i++) {
			if (id == employeeList.get(i).getId()) {
				employeeList.remove(i);
			}
		}
		return employeeList;
	}
}
