package com.hospital.patientmanagementsystem.repository;

import org.springframework.data.repository.CrudRepository;

import com.hospital.patientmanagementsystem.entity.HospitalCapacity;

public interface HospitalRepository extends CrudRepository<HospitalCapacity, Integer>{

	//HospitalCapacity getNumberOfRooms(Integer numberOfRooms);
}
