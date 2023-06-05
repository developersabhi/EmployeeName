package com.employee_app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.employee_app.data.models.Employee;
import com.employee_app.data.payloads.request.EmployeeRequest;
import com.employee_app.data.payloads.response.MessageResponse;


@Component
public interface EmployeeService {
	
	MessageResponse createEmployee(EmployeeRequest employeeRequest);
	Optional<Employee> updateEmployee(Integer employeeId ,EmployeeRequest employeeRequest);
	void deleteEmployee(Integer employeeId);
	Employee getASingleEmployee(Integer employeeId);
	List<Employee> getAllEmployees();	
}
