package com.hospital.patientmanagementsystem.service;

import com.hospital.patientmanagementsystem.dto.PatientDTO;
import com.hospital.patientmanagementsystem.exception.PatientManagementException;

public interface PatientService {

	public void addPatient(PatientDTO patientDTO) throws PatientManagementException;
	
	public void editPatient(PatientDTO patientDTO) throws PatientManagementException;
}
