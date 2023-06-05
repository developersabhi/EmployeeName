package com.employee_app.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee_app.data.models.Employee;
import com.employee_app.data.payloads.request.EmployeeRequest;
import com.employee_app.data.payloads.response.MessageResponse;
import com.employee_app.service.EmployeeService;
import com.employee_app.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
    EmployeeService employeeService;
	
	
	
	
	 @GetMapping("/all")
	    public ResponseEntity<List<Employee>> getAllEmployees () {
	        List<Employee> footballers = employeeService.getAllEmployees();
	        return new ResponseEntity<>(footballers, HttpStatus.OK);
	    }
	 
	 @GetMapping("/find/{id}")
	    public ResponseEntity<Employee> getEmployeeById (@PathVariable("id") Integer id) {
	        Employee employee = employeeService.getASingleEmployee(id);
	        return new ResponseEntity<>(employee, HttpStatus.OK);
	    }
	 
	 @PostMapping("/add")
	    public ResponseEntity<MessageResponse> addEmployee( @RequestBody EmployeeRequest employee) {
	        MessageResponse newEmployee = employeeService.createEmployee(employee);
	        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
	    }

	 @PutMapping("/update/{id}")
	    public Optional<Employee> updateEmployee(@PathVariable Integer id, @RequestBody EmployeeRequest employee) {
	        return employeeService.updateEmployee(id, employee);
	    }
	 
	 @DeleteMapping("/delete/{id}")
	    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Integer id) {
	        employeeService.deleteEmployee(id);
	        return new ResponseEntity<>(HttpStatus.OK);
	    }

}
