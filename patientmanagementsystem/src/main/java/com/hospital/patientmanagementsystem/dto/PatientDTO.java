package com.hospital.patientmanagementsystem.dto;

import java.time.LocalDate;

import com.hospital.patientmanagementsystem.entity.Accompanying;
import com.hospital.patientmanagementsystem.entity.HospitalCapacity;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class PatientDTO {

	private Integer patientId;
	
	private String patientName;
	
	private LocalDate dateOfBirth;
	
	private String address;
	
	@NotNull(message = "{patient.aadhar.notpresent}")
	private Integer idProofDetails;
	
	@NotNull(message = "{patient.contactnumber.notpresent}")
	private Integer contactNo;
	
	private Integer emergencyContactNo;
	
	private String primaryIllness;
	
	private String symptoms;
	
	private String healthInsurance;
	
	private String preferredDoctorGender;
	
	
	@NotNull(message = "{patient.disability.nopresent}")
	@Pattern(regexp = "Yes|No", message = "{patient.disability.invalid}")
	private String disability;
	
	private String guardianName;
	
	private String guardianPhoneNumber;
	
	private String guardianRelation;
	
	
	
	private Accompanying accompanying;
	
	private HospitalCapacity hospitalCapacity;

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getIdProofDetails() {
		return idProofDetails;
	}

	public void setIdProofDetails(Integer idProofDetails) {
		this.idProofDetails = idProofDetails;
	}

	public Integer getContactNo() {
		return contactNo;
	}

	public void setContactNo(Integer contactNo) {
		this.contactNo = contactNo;
	}

	public Integer getEmergencyContactNo() {
		return emergencyContactNo;
	}

	public void setEmergencyContactNo(Integer emergencyContactNo) {
		this.emergencyContactNo = emergencyContactNo;
	}

	public String getPrimaryIllness() {
		return primaryIllness;
	}

	public void setPrimaryIllness(String primaryIllness) {
		this.primaryIllness = primaryIllness;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public String getHealthInsurance() {
		return healthInsurance;
	}

	public void setHealthInsurance(String healthInsurance) {
		this.healthInsurance = healthInsurance;
	}

	public String getPreferredDoctorGender() {
		return preferredDoctorGender;
	}

	public void setPreferredDoctorGender(String preferredDoctorGender) {
		this.preferredDoctorGender = preferredDoctorGender;
	}

	public String getDisability() {
		return disability;
	}

	public void setDisability(String disability) {
		this.disability = disability;
	}

	public String getGuardianName() {
		return guardianName;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

	public String getGuardianPhoneNumber() {
		return guardianPhoneNumber;
	}

	public void setGuardianPhoneNumber(String guardianPhoneNumber) {
		this.guardianPhoneNumber = guardianPhoneNumber;
	}

	public String getGuardianRelation() {
		return guardianRelation;
	}

	public void setGuardianRelation(String guardianRelation) {
		this.guardianRelation = guardianRelation;
	}

	public Accompanying getAccompanying() {
		return accompanying;
	}

	public void setAccompanying(Accompanying accompanying) {
		this.accompanying = accompanying;
	}

	public HospitalCapacity getHospitalCapacity() {
		return hospitalCapacity;
	}

	public void setHospitalCapacity(HospitalCapacity hospitalCapacity) {
		this.hospitalCapacity = hospitalCapacity;
	}
	
	
}
