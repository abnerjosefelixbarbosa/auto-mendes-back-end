package com.org.auto_mendes_back_end_java.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.org.auto_mendes_back_end_java.dto.EmployeeRequest;
import com.org.auto_mendes_back_end_java.dto.EmployeeResponse;
import com.org.auto_mendes_back_end_java.entity.Employee;

@Component
public class EmployeeMapper implements IEmployeeMapper {

	public Employee toEmployee(EmployeeRequest request) {
		Employee employee = new Employee();
		
		BeanUtils.copyProperties(request, employee);
		
		return employee;
	}
	
	public EmployeeResponse toEmployeeResponse(Employee employee) {
		EmployeeResponse response = new EmployeeResponse(
				employee.getId(),
				employee.getName(),
				employee.getEmployeeType(),
				employee.getBirthDate(),
				employee.getCpf(),
				employee.getRg(),
				employee.getEmail(),
				employee.getContact()
		);
		
		return response;
	}
	
}