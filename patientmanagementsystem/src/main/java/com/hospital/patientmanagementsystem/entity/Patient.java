package com.hospital.patientmanagementsystem.entity;

import java.time.LocalDate;

import com.hospital.patientmanagementsystem.dto.PatientDTO;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer patientId;
	
	private String patientName;
	
	private LocalDate dateOfBirth;
	
	private String address;
	
	private Integer idProofDetails;
	
	private Integer contactNo;
	
	private Integer emergencyContactNo;
	
	private String primaryIllness;
	
	private String symptoms;
	
	private String healthInsurance;
	
	private String preferredDoctorGender;
	
	
	
	private String disability;
	
	private String guardianName;
	
	private String guardianPhoneNumber;
	
	private String guardianRelation;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "accompanying_id")
	private Accompanying accompanying;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "room_id")
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
	
	public static Patient prepareEntity(PatientDTO patientDTO) {
	Patient patient=new Patient();
	patient.setPatientName(patientDTO.getPatientName());
	patient.setDateOfBirth(patientDTO.getDateOfBirth());
	patient.setAddress(patientDTO.getAddress());
	patient.setIdProofDetails(patientDTO.getIdProofDetails());
	patient.setContactNo(patientDTO.getContactNo());
	patient.setEmergencyContactNo(patientDTO.getEmergencyContactNo());
	patient.setPrimaryIllness(patientDTO.getPrimaryIllness());
	patient.setSymptoms(patientDTO.getSymptoms());
	patient.setHealthInsurance(patientDTO.getHealthInsurance());
	patient.setPreferredDoctorGender(patientDTO.getPreferredDoctorGender());
	patient.setDisability(patientDTO.getDisability());
	patient.setGuardianName(patientDTO.getGuardianName());
	patient.setGuardianPhoneNumber(patientDTO.getGuardianPhoneNumber());
	patient.setGuardianRelation(patientDTO.getGuardianRelation());
	patient.setAccompanying(patientDTO.getAccompanying());
	patient.setHospitalCapacity(patientDTO.getHospitalCapacity());
	return patient;
	}
}
