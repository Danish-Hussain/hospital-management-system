package com.hospital.patientmanagementsystem.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.patientmanagementsystem.dto.PatientDTO;
import com.hospital.patientmanagementsystem.exception.PatientManagementException;
import com.hospital.patientmanagementsystem.service.PatientService;

import jakarta.validation.Valid;

@RestController
@Validated
@RequestMapping("api")
public class PatientAPI {
	
	@Autowired
	PatientService patientService;
	
	
	@PostMapping(value = "patient", consumes = "application/json")
	public ResponseEntity<String> addPatient(@RequestBody @Valid PatientDTO patientDTO) throws PatientManagementException{
		patientService.addPatient(patientDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body("Patient created successfully");
	}

	@PutMapping(value = "patient/update")
	public ResponseEntity<String> editPatient(@RequestBody PatientDTO patientDTO) throws PatientManagementException{
		patientService.editPatient(patientDTO);
		return ResponseEntity.ok("Patient updated successfully");
		
	}
}
