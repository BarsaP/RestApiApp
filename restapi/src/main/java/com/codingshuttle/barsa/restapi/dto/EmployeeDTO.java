package com.codingshuttle.barsa.restapi.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

	private Long id;
	private String name;
	private LocalDate dateOfJoining;
	private boolean isActive;
}
