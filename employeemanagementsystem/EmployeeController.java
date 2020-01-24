package com.ing.employeemanagementsystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ing.employeemanagementsystem.entity.Employee;
import com.ing.employeemanagementsystem.service.EmployeeService;

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
	@Autowired
	EmployeeService employeeService;

	/**
	 * This method is used to create employee
	 * 
	 * @param employee This is the parameter to createEmployee method 
	 * @return string
	 */

	@PostMapping("/employees")
	public String createEmployee(@RequestBody Employee employee) {

		return employeeService.createEmployee(employee);
	}

	/**
	 * This method is used to get employee list
	 * 
	 * @return list This returns list of employees
	 */
	@GetMapping("/employees")
	public Iterable<Employee> getAllEmployees() {

		return employeeService.getEmployee();
	}

	/**
	 * This method is used to delete employee
	 * 
	 * @param employeeid This is the parameter to deleteEmployeeById method
	 * @return string
	 */

	@DeleteMapping("/{employeeid}")
	public String deleteEmployeeById(@PathVariable("employeeid") int employeeid) {
		return employeeService.deleteEmployeeById(employeeid);

	}

	/**
	 * This method is used to get employee
	 * 
	 * @param employeeid This is the parameter to getEmployeeById method
	 * @return employee
	 */

	@GetMapping("/{employeeid}")
	public Optional<Employee> getEmployeeById(@PathVariable("employeeid") int employeeid) {

		return employeeService.getEmployeeById(employeeid);
	}
	/**
	 * This method is used to get employees ends with particular character
	 * @param employeename This is the parameter to findEmployeesNameEndsWithId method
	 * @return list of employees
	 */
	@GetMapping("/showEmployeesEnding")
    public List<Employee> findEmployeesNameEndsWith( @RequestParam String employeename) {

       List<Employee> employees = (List<Employee>) employeeService.findByNameEndsWith(employeename);

       
        return employees;
    }
	
	/**
	 * This method is used to get employees name and phone number
	 * @param employeename This is the first parameter to findByEmployeeNameAndEmployeePh method
	 * @param employeeph This is the second parameter to findByEmployeeNameAndEmployeePh method
	 * @return list of employees 
	 */
	@GetMapping("/showEmployeesNameAndPh")
    public List<Employee> findByEmployeeNameAndEmployeePh( @RequestParam String employeename, String employeeph) {

       List<Employee> employees = (List<Employee>) employeeService.findByEmployeeNameAndEmployeePh(employeename, employeeph);

       
        return employees;
    }
	/**
	 * This method is used to get employees id and name 
	 * @param employeename This is the first parameter to findByEmployeeidAndEmployeename method
	 * @param employeeph This is the second parameter to findByEmployeeidAndEmployeename method
	 * @return list of employees 
	 */
	
	@GetMapping("/showEmployeesIdAndName")
    public List<Employee> findByEmployeeidAndEmployeename( @RequestParam Integer employeeid, String employeeph) {

       List<Employee> employees = (List<Employee>) employeeService.findByEmployeeidAndEmployeename(employeeid, employeeph);

       
        return employees;
    }
	/**
	 * 
	 * @param employeemail This is the parameter to findByEmployeemail method
	 * @return list of employees
	 */
	@GetMapping("/showEmployeesMailIds")
    public List<Employee> findByEmployeemail( @RequestParam String employeemail) {

       List<Employee> employees = (List<Employee>) employeeService.findByEmployeemail(employeemail);

       
        return employees;
    }
	
	

}
