package com.org.auto_mendes_back_end_java.dto;

import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;

import com.org.auto_mendes_back_end_java.entity.EmployeeType;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record RegisterEmployeeRequest(
		@NotEmpty(message = "Name empty")
		@NotNull(message = "Name null")
		String name,
		@NotNull(message = "Employee type null")
		@Enumerated(EnumType.STRING)
		EmployeeType employeeType,
		@NotNull(message = "Birth date null")
		LocalDate birthDate,
		@NotEmpty(message = "CPF empty")
		@NotNull(message = "CPF null")
		@CPF(message = "CPF invalid")
		@Pattern(regexp = "^\\d+$", message = "CPF without period")
		String cpf,
		@NotEmpty(message = "RG empty")
		@NotNull(message = "RG null")
		@Pattern(regexp = "^\\d+$", message = "RG without period")
		String rg,
		@NotEmpty(message = "Email empty")
		@NotNull(message = "Email null")
		@Email(message = "Email invalid")
		String email,
		@NotEmpty(message = "Contact empty")
		@NotNull(message = "Contact null")
		@Size(min = 15, max = 15, message = "Contact with min and max 15 in size")
		String contact
) {}