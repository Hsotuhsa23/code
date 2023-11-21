package com.employeedata.employeetask.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="employee_details")
public class Employee {
	@Id
	private int emp_id;
	private String emp_name;
	private String address;
	public Employee() {
		super();
	}
	public int getEmp_id() {
		return emp_id;
		
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;

}
}