package com.org.auto_mendes_back_end_java.model.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.auto_mendes_back_end_java.model.entity.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, String> {
	boolean existsByEmailOrContact(String email, String contact);
	
	boolean existsByCpfOrRgOrEmailOrContact(String cpf, String rg, String email, String contact);
	
	Optional<Employee> findByCpf(String cpf);
	
	Page<Employee> findAllByNameContaining(String name, Pageable pageable);
}