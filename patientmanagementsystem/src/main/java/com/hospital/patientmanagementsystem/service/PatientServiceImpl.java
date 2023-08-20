package com.hospital.patientmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hospital.patientmanagementsystem.dto.PatientDTO;
import com.hospital.patientmanagementsystem.entity.Patient;
import com.hospital.patientmanagementsystem.exception.PatientManagementException;
import com.hospital.patientmanagementsystem.repository.HospitalRepository;
import com.hospital.patientmanagementsystem.repository.PatientRepository;
import com.hospital.patientmanagementsystem.validator.PatientValidator;

@Service("patientService")
@Transactional
public class PatientServiceImpl implements PatientService{

	@Autowired
	PatientRepository patientrepository;

	@Autowired
	HospitalRepository hospitalrepository;
	
	@Override
	public void addPatient(PatientDTO patientDTO) throws PatientManagementException {
		// TODO Auto-generated method stub
		PatientValidator.validatePatient(patientDTO);
		Patient pDTO=patientrepository.findByIdProofDetails(patientDTO.getIdProofDetails());
		if(!(pDTO==null)){
			throw new PatientManagementException("PatientService.PATIENT_ALREADYEXIST");
				}
//		hospitalrepository.getNumberOfRooms(null)
//		if(hospitalrepository.getNumberOfRooms()==0) {
//			throw new PatientManagementException("PatientService.Hospital_CAPACITY_is_EMPTY");
//		}
		Patient p=Patient.prepareEntity(patientDTO);
		Patient pati=patientrepository.save(p);
		patientDTO.setPatientId(pati.getPatientId());
		
	}

	@Override
	public void editPatient(PatientDTO patientDTO) throws PatientManagementException {
		// TODO Auto-generated method stub
		Patient pDTO=patientrepository.findByIdProofDetails(patientDTO.getIdProofDetails());
		if(pDTO==null){
			throw new PatientManagementException("PatientService.PATIENT_DOESNTEXIST");
				}
		pDTO.setPatientName(patientDTO.getPatientName());
		pDTO.setDateOfBirth(patientDTO.getDateOfBirth());
		pDTO.setAddress(patientDTO.getAddress());
		pDTO.setIdProofDetails(patientDTO.getIdProofDetails());
		pDTO.setContactNo(patientDTO.getContactNo());
		pDTO.setEmergencyContactNo(patientDTO.getEmergencyContactNo());
		pDTO.setPrimaryIllness(patientDTO.getPrimaryIllness());
		pDTO.setSymptoms(patientDTO.getSymptoms());
		pDTO.setHealthInsurance(patientDTO.getHealthInsurance());
		pDTO.setPreferredDoctorGender(patientDTO.getPreferredDoctorGender());
		pDTO.setDisability(patientDTO.getDisability());
		pDTO.setGuardianName(patientDTO.getGuardianName());
		pDTO.setGuardianPhoneNumber(patientDTO.getGuardianPhoneNumber());
		pDTO.setGuardianRelation(patientDTO.getGuardianRelation());
		pDTO.setAccompanying(patientDTO.getAccompanying());
		pDTO.setHospitalCapacity(patientDTO.getHospitalCapacity());
		patientrepository.save(pDTO);
	}
	
	
}
