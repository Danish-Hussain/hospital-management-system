package com.hospital.patientmanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hospital_capacity")
public class HospitalCapacity {

	@Id
	private Integer roomId;

	private Integer numberOfRooms;

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public Integer getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(Integer numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	
	
}
