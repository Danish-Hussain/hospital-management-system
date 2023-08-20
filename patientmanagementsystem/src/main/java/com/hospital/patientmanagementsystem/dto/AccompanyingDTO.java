package com.hospital.patientmanagementsystem.dto;

import jakarta.validation.constraints.NotNull;

public class AccompanyingDTO {

private Integer accompanyingId;
	
	private String firstPerson;
	
	@NotNull(message = "{accompany.contactnumber.notpresent}")
	private Integer firstContactNo;
	
	@NotNull(message = "{firstperson.aadhar.notpresent}")
	private Integer firstIdProofDetails;
	
	
	private String secondPerson;
	
	@NotNull(message = "{accompany.contactnumber.notpresent}")
	private Integer secondContactNo;
	@NotNull(message = "{secondperson.aadhar.notpresent}")
	private Integer secondIdProofDetails;

	public Integer getAccompanyingId() {
		return accompanyingId;
	}

	public void setAccompanyingId(Integer accompanyingId) {
		this.accompanyingId = accompanyingId;
	}

	public String getFirstPerson() {
		return firstPerson;
	}

	public void setFirstPerson(String firstPerson) {
		this.firstPerson = firstPerson;
	}

	public Integer getFirstContactNo() {
		return firstContactNo;
	}

	public void setFirstContactNo(Integer firstContactNo) {
		this.firstContactNo = firstContactNo;
	}

	public Integer getFirstIdProofDetails() {
		return firstIdProofDetails;
	}

	public void setFirstIdProofDetails(Integer firstIdProofDetails) {
		this.firstIdProofDetails = firstIdProofDetails;
	}

	public String getSecondPerson() {
		return secondPerson;
	}

	public void setSecondPerson(String secondPerson) {
		this.secondPerson = secondPerson;
	}

	public Integer getSecondContactNo() {
		return secondContactNo;
	}

	public void setSecondContactNo(Integer secondContactNo) {
		this.secondContactNo = secondContactNo;
	}

	public Integer getSecondIdProofDetails() {
		return secondIdProofDetails;
	}

	public void setSecondIdProofDetails(Integer secondIdProofDetails) {
		this.secondIdProofDetails = secondIdProofDetails;
	}
	
	
	
}
