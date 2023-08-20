DROP SCHEMA IF EXISTS patient_management;

CREATE SCHEMA patient_management;
USE patient_management;

CREATE TABLE hospital_capacity (
    room_id INT PRIMARY KEY,
    number_of_rooms INT
);

CREATE TABLE accompanying (
    accompanying_id INT PRIMARY KEY,
    first_person VARCHAR(255),
    first_contact_no INT,
    first_id_proof_details INT,
    second_person VARCHAR(255),
    second_contact_no INT,
    second_id_proof_details INT
);
CREATE TABLE patient (
	patient_id INT PRIMARY KEY AUTO_INCREMENT,
	patient_name VARCHAR(255),
	date_of_birth DATE,
	address VARCHAR(255),
	id_proof_details INT,
	contact_no INT,
	emergency_contact_no INT,
	primary_illness VARCHAR(255),
	symptoms VARCHAR(255),
	health_insurance VARCHAR(255),
	preferred_doctor_gender VARCHAR(255),
	disability VARCHAR(255),
	guardian_name VARCHAR(255),
	guardian_phone_number VARCHAR(255),
	guardian_relation VARCHAR(255),
	accompanying_id INT,
	room_id INT,
	FOREIGN KEY (accompanying_id) REFERENCES accompanying(accompanying_id),
	FOREIGN KEY (room_id) REFERENCES hospital_capacity(room_id)
);


INSERT INTO hospital_capacity (room_id, number_of_rooms) VALUES (1001, 0);
INSERT INTO accompanying (accompanying_id, first_person, first_contact_no, first_id_proof_details, second_person, second_contact_no, second_id_proof_details) VALUES (1, 'John', 1234567890, 12345, 'prem', 1234567890, 12345);
INSERT INTO patient(patient_id, patient_name, date_of_birth, address, id_proof_details, contact_no, emergency_contact_no, primary_illness, symptoms, health_insurance, preferred_doctor_gender, disability, guardian_name, guardian_phone_number, guardian_relation) VALUES (101, 'Bunty', SYSDATE()+INTERVAL 2 DAY, 'Hyderabad', 565678, 943256, 546976, 'headache', 'weakness', 'VED3435', 'Male', 'No', 'mom', '4684948474', 'mother');
select * from patient;
select * from accompanying;
select * from hospital_capacity;
