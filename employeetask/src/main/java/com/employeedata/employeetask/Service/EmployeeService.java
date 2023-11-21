package com.employeedata.employeetask.Service;

import java.util.List;

import com.employeedata.employeetask.Entity.Employee;


public interface EmployeeService {
	public List<Employee> findall();
	public String addEmployee(Employee emp);
	public String updateEmployee(Employee emp,int emp_id);
	public String deleteEmployee(int emp_id);
	public Employee findId(int emp_id);
	

}

