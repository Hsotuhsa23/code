package com.employeedata.employeetask.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeedata.employeetask.Entity.Employee;
import com.employeedata.employeetask.Service.EmployeeService;

@CrossOrigin("*")
@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	

	@PostMapping("/add")
	public String addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}

	@PutMapping("/update/{emp_id}")
	public String updateEmployee( @RequestBody Employee employee,@PathVariable int emp_id) {
		return employeeService.updateEmployee(employee,emp_id);
	}

	@DeleteMapping("/delete/{emp_id}")
	public String deleteEmployee(@PathVariable int emp_id) {
		return employeeService.deleteEmployee(emp_id);
	}
	
	

	@GetMapping("/find/{emp_id}")
	public Employee findId(@PathVariable int emp_id) {
		return employeeService.findId(emp_id);
	}

	@GetMapping("/findall")
	public List<Employee> findAll() {
		return employeeService.findall();
	}

	
}
