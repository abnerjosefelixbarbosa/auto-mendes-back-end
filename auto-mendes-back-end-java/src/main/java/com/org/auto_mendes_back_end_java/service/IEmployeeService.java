package com.org.auto_mendes_back_end_java.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.org.auto_mendes_back_end_java.dto.EmployeeRequest;
import com.org.auto_mendes_back_end_java.dto.EmployeeResponse;

public interface IEmployeeService {
	EmployeeResponse registerEmployee(EmployeeRequest request);
	
	EmployeeResponse updateEmployee(String cpf, EmployeeRequest request);
	
	EmployeeResponse searchEmployee(String cpf);
	
	Page<EmployeeResponse> listEmployeeByName(String name, Pageable pageable);
}