package com.ing.employeesystem.service;

import java.util.List;
import java.util.Optional;

import com.ing.employeesystem.dto.EmployeeRequestDto;
import com.ing.employeesystem.entity.Employee;

public interface EmployeeService {

	String createEmployee(EmployeeRequestDto emplRequestDto);

	Iterable<Employee> getEmployee();


	Optional<Employee> getEmployeeById(int employeeid);

	String deleteEmployeeById(int employeeid);

	List<Employee> findByNameEndsWith(String employeename);

	List<Employee> findByEmployeeNameAndEmployeePh(String employeename, String employeeph);

	List<Employee> findByEmployeeidAndEmployeename(Integer employeeid, String employeeph);

	List<Employee> findByEmployeemail(String employeemail);
	

}
