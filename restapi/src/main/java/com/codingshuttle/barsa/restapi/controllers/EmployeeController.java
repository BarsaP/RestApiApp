package com.codingshuttle.barsa.restapi.controllers;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codingshuttle.barsa.restapi.dto.EmployeeDTO;

@RestController
public class EmployeeController {

	  @GetMapping(path = "/employees")
      public EmployeeDTO getEmployees() {
    	  return new EmployeeDTO(12l, "Barsa", LocalDate.of(2025, 3, 1), true);
      }	
}
