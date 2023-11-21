package com.employeedata.employeetask.Repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.employeedata.employeetask.Entity.Employee;


@Repository
public interface EmployeeRepository extends MongoRepository<Employee,Integer>{


}
