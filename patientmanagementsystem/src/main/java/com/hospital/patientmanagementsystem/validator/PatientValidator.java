package com.hospital.patientmanagementsystem.validator;

import java.time.LocalDate;

import com.hospital.patientmanagementsystem.dto.PatientDTO;
import com.hospital.patientmanagementsystem.exception.PatientManagementException;

public class PatientValidator {

	public static void validatePatient(PatientDTO patientDTO)throws PatientManagementException {
		if(isValidDateOfBirth(patientDTO.getDateOfBirth(), patientDTO.getGuardianName(), patientDTO.getGuardianPhoneNumber(), patientDTO.getGuardianRelation())==false) {
			throw new PatientManagementException("PatientValidator.INVALID_DATEOFBIRTH");
		}
		else if(isValidDisability(patientDTO.getDisability(), patientDTO.getGuardianName(), patientDTO.getGuardianPhoneNumber(), patientDTO.getGuardianRelation())==false){
			throw new PatientManagementException("PatientValidator.INVALID_DISABILITY");
		}
		if(isValidHealthInsurance(patientDTO.getHealthInsurance())==false) {
			throw new PatientManagementException("PatientValidator.INVALID_INSURANCE");
		}
		
		}
	
	public static Boolean isValidDateOfBirth(LocalDate dateOfBirth,String guardianName, String guardianPhoneNumber, String guardianRelation) {
		if(dateOfBirth.isAfter(LocalDate.now().minusYears(18)) || guardianName.isEmpty() || guardianPhoneNumber.isEmpty() || guardianRelation.isEmpty()) {
			return false;
		}
			return true;
		}
	public static Boolean isValidDisability(String disability,String guardianName, String guardianPhoneNumber, String guardianRelation) {
		if(disability.matches("Yes|YES") || guardianName.isEmpty() || guardianPhoneNumber.isEmpty() || guardianRelation.isEmpty()) {
			return false;
		}
			return true;
		}
	public static Boolean isValidHealthInsurance(String healthInsurance) {
	
		if(healthInsurance.matches("[A-Z0-9a-z]+")) {
			return true;
		}
			return false;
	}
	}
