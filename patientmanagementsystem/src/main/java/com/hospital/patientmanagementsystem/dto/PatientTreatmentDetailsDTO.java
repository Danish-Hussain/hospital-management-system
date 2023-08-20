package com.hospital.patientmanagementsystem.dto;

public class PatientTreatmentDetailsDTO {

	private String patientName;
	
	private String prefferedDoctor;
	
	private String primaryIllness;
	
	private String DoctorAllocated;

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPrefferedDoctor() {
		return prefferedDoctor;
	}

	public void setPrefferedDoctor(String prefferedDoctor) {
		this.prefferedDoctor = prefferedDoctor;
	}

	public String getPrimaryIllness() {
		return primaryIllness;
	}

	public void setPrimaryIllness(String primaryIllness) {
		this.primaryIllness = primaryIllness;
	}

	public String getDoctorAllocated() {
		return DoctorAllocated;
	}

	public void setDoctorAllocated(String doctorAllocated) {
		DoctorAllocated = doctorAllocated;
	}
	
	
}
