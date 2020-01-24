package com.ing.employeesystem.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.employeesystem.dao.EmployeeDao;
import com.ing.employeesystem.dto.EmployeeRequestDto;
import com.ing.employeesystem.entity.Employee;
import com.ing.employeesystem.exception.InvalidException;
import com.ing.employeesystem.exception.RecordNotFoundException;
import com.ing.employeesystem.service.EmployeeService;
import com.ing.employeesystem.util.EmployeeUtil;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeedao;

	@Override
	public String createEmployee(EmployeeRequestDto emplRequestDto) {
		if (emplRequestDto.getEmployeeMail() != null || emplRequestDto.getEmployeeName() != null
				|| emplRequestDto.getEmployeePh() != null) {
			throw new InvalidException(EmployeeUtil.INVALID_EXCEPTION);
		} else {
			Employee employee=new Employee();
			BeanUtils.copyProperties(emplRequestDto, employee);
			employeedao.save(employee);
		}

		return EmployeeUtil.EMPLOYEE_ADD_SUCCESS;

	}

	@Override
	public Iterable<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return employeedao.findAll();
	}

	@Override
	public String deleteEmployeeById(int employeeId) {
		Optional<Employee> findById = employeedao.findById(employeeId);
		if (!findById.isPresent()) {
			throw new RecordNotFoundException(EmployeeUtil.RECORD_NOT_FOUND_EXCEPTION);
		} else {
			employeedao.deleteById(employeeId);
		}

		return EmployeeUtil.EMPLOYEE_DELETE_SUCCESS;

	}

	@Override
	public Optional<Employee> getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return employeedao.findById(employeeId);
	}

	@Override
	public List<Employee> findByNameEndsWith(String employeeName) {
		// TODO Auto-generated method stub
		return employeedao.findByNameEndsWith(employeeName);
	}

	@Override
	public List<Employee> findByEmployeeNameAndEmployeePh(String employeeName, String employeePh) {
		// TODO Auto-generated method stub
		return employeedao.findByEmployeeNameAndEmployeePh(employeeName, employeePh);
	}

	@Override
	public List<Employee> findByEmployeeidAndEmployeename(Integer employeeId, String employeePh) {
		// TODO Auto-generated method stub
		return employeedao.findByEmployeeIdAndEmployeeName(employeeId, employeePh);
	}

	@Override
	public List<Employee> findByEmployeemail(String employeeMail) {
		// TODO Auto-generated method stub
		return employeedao.findByEmployeeMail(employeeMail);
	}

}
