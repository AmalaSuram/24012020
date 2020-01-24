package com.ing.employeesystem.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ing.employeesystem.dto.EmployeeRequestDto;
import com.ing.employeesystem.entity.Employee;
import com.ing.employeesystem.service.EmployeeService;


/**
 * The EmployeeController program implements an application that
* simply all CRUD operations of employee and Prints
* the output on the screen.
 * 
 * @author Amala
 * @version 1.0
 * @since   2020-01-21
 *
 */
@RestController
public class EmployeeController {
	//private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	private static final Logger logger=LoggerFactory.getLogger(EmployeeController.class);
	@Autowired
	EmployeeService employeeService;

	/**
	 * This method is used to create employee
	 * 
	 * @param employee This is the parameter to createEmployee method 
	 * @return string
	 */

	@PostMapping("/employees")
	public String createEmployee(@RequestBody EmployeeRequestDto emplRequestDto) {
		 logger.info("starting createEmployee method , inside EmployeeController");

		return employeeService.createEmployee(emplRequestDto);
	}

	/**
	 * This method is used to get employee list
	 * 
	 * @return list This returns list of employees
	 */
	@GetMapping("/employees")
	public Iterable<Employee> getAllEmployees() {
		logger.info("starting getAllEmployees method , inside EmployeeController");

		return employeeService.getEmployee();
	}

	/**
	 * This method is used to delete employee
	 * 
	 * @param employeeid This is the parameter to deleteEmployeeById method
	 * @return string
	 */

	@DeleteMapping("/{employeeId}")
	public String deleteEmployeeById(@PathVariable("employeeId") int employeeId) {
		 logger.info("starting deleteEmployeeById method , inside EmployeeController");

		return employeeService.deleteEmployeeById(employeeId);

	}

	/**
	 * This method is used to get employee
	 * 
	 * @param employeeid This is the parameter to getEmployeeById method
	 * @return employee
	 */

	@GetMapping("/{employeeId}")
	public Optional<Employee> getEmployeeById(@PathVariable("employeeId") int employeeId) {
		logger.info("starting getEmployeeById method , inside EmployeeController");

		return employeeService.getEmployeeById(employeeId);
	}
	/**
	 * This method is used to get employees ends with particular character
	 * @param employeename This is the parameter to findEmployeesNameEndsWithId method
	 * @return list of employees
	 */
	@GetMapping("/showEmployeesEnding")
    public List<Employee> findEmployeesNameEndsWith( @RequestParam String employeeName) {
		logger.info("starting findEmployeesNameEndsWith method , inside EmployeeController");


       List<Employee> employees = (List<Employee>) employeeService.findByNameEndsWith(employeeName);

       
        return employees;
    }
	
	/**
	 * This method is used to get employees name and phone number
	 * @param employeename This is the first parameter to findByEmployeeNameAndEmployeePh method
	 * @param employeeph This is the second parameter to findByEmployeeNameAndEmployeePh method
	 * @return list of employees 
	 */
	@GetMapping("/showEmployeesNameAndPh")
    public List<Employee> findByEmployeeNameAndEmployeePh( @RequestParam String employeeName, String employeePh) {
		logger.info("starting findByEmployeeNameAndEmployeePh method , inside EmployeeController");

       List<Employee> employees = (List<Employee>) employeeService.findByEmployeeNameAndEmployeePh(employeeName, employeePh);

       
        return employees;
    }
	/**
	 * This method is used to get employees id and name 
	 * @param employeename This is the first parameter to findByEmployeeidAndEmployeename method
	 * @param employeeph This is the second parameter to findByEmployeeidAndEmployeename method
	 * @return list of employees 
	 */
	
	@GetMapping("/showEmployeesIdAndName")
    public List<Employee> findByEmployeeIdAndEmployeeName( @RequestParam Integer employeeId, String employeePh) {
		logger.info("starting findByEmployeeIdAndEmployeeName method , inside EmployeeController");

       List<Employee> employees = (List<Employee>) employeeService.findByEmployeeidAndEmployeename(employeeId, employeePh);

       
        return employees;
    }
	/**
	 * 
	 * @param employeemail This is the parameter to findByEmployeemail method
	 * @return list of employees
	 */
	@GetMapping("/showEmployeesMailIds")
    public List<Employee> findByEmployeeMail( @RequestParam String employeeMail) {
		logger.info("starting findByEmployeeMail method , inside EmployeeController");
       List<Employee> employees = (List<Employee>) employeeService.findByEmployeemail(employeeMail);

       
        return employees;
    }
	
	

}
