package com.ing.employeesystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ing.employeesystem.dto.EmployeeRequestDto;
import com.ing.employeesystem.entity.Employee;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
	@Query("select e from Employee e where e.employeeName like %?1")
	List<Employee> findByNameEndsWith(String chars);

	@Query("SELECT e FROM Employee e WHERE employeeName = ?1 AND EmployeePh = ?2")
	List<Employee> findByEmployeeNameAndEmployeePh(String employeeName, String EmployeePh);

	List<Employee> findByEmployeeIdAndEmployeeName(Integer EmployeeId, String employeeName);

	public List<Employee> findByEmployeeMail(String employeeName);

}
