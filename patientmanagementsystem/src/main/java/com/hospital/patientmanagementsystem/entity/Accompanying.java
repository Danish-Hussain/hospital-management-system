package com.hospital.patientmanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "accompanying")
public class Accompanying {
	
	@Id
	private Integer accompanyingId;
	
	private String firstPerson;
	
	private Integer firstContactNo;
	
	private Integer firstIdProofDetails;
	
	private String secondPerson;
	
	private Integer secondContactNo;
	
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
