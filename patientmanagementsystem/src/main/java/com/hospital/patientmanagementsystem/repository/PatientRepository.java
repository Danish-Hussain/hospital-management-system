package com.hospital.patientmanagementsystem.repository;

import org.springframework.data.repository.CrudRepository;

import com.hospital.patientmanagementsystem.entity.Patient;

public interface PatientRepository extends CrudRepository<Patient, Integer>{

	Patient findByIdProofDetails(Integer idProofDetails);
}
