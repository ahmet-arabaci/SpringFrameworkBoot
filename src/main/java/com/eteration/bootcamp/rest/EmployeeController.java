package com.eteration.bootcamp.rest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eteration.bootcamp.model.EmployeeModel;
import com.eteration.bootcamp.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/employeelist")
	public List<EmployeeModel> getEmployeeList() {
		return employeeService.getEmployeeList();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/employeelist")
	public String addEmployeeList(@RequestBody EmployeeModel emp) {
		return employeeService.addEmployeeList(emp);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/employeelist/{id}")
	public String updateEmployeeList(@PathVariable("id") int id, @RequestBody EmployeeModel emp) {
		return employeeService.updateEmployeeList(id, emp);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/employeelist/{id}")
	public List<EmployeeModel> deleteEmployee(@PathVariable("id") int id) {
		return employeeService.deleteEmployee(id);
	}
	
}
