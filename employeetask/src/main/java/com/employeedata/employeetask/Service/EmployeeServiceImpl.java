package com.employeedata.employeetask.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeedata.employeetask.Entity.Employee;
import com.employeedata.employeetask.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
@Autowired
EmployeeRepository employeeRepository;

public List<Employee> findall() {
	// TODO Auto-generated method stub
	return employeeRepository.findAll();
}

public String addEmployee(Employee emp) {
	// TODO Auto-generated method stub
	employeeRepository.save(emp);
	return "data added";
}

public String updateEmployee(Employee emp, int emp_id) {
	// TODO Auto-generated method stub
	Optional<Employee> cont=employeeRepository.findById(emp_id);
	if(cont.isPresent()) {
		Employee e=cont.get();
		e.setEmp_name(emp.getEmp_name());
		e.setAddress(emp.getAddress());
		employeeRepository.save(emp);
		return "Employee Details upadted with id"+emp_id;
	}
	
	
	else {
		return "Employee Details with Id not found";
	}
}

public String deleteEmployee(int emp_id) {
	Optional<Employee> cont=employeeRepository.findById(emp_id);
	if(cont.isPresent()) {
		Employee e=cont.get();
		employeeRepository.delete(e);
		return "Employee Details deleted with id"+ emp_id;
	}
	else {
		return "Employee Details with Id not found";
	}
}

public Employee findId(int emp_id) {
	// TODO Auto-generated method stub
	return employeeRepository.findById(emp_id).get();
}

}
