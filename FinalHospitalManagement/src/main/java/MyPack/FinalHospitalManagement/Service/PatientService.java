package MyPack.FinalHospitalManagement.Service;

import java.util.List;

import MyPack.FinalHospitalManagement.Dto.PatientDto;
import MyPack.FinalHospitalManagement.Dto.PatientLoginDto;
import MyPack.FinalHospitalManagement.Dto.PatientSaveDto;
import MyPack.FinalHospitalManagement.Dto.PatientUpdateDto;
import MyPack.FinalHospitalManagement.Model.Patient;
import MyPack.FinalHospitalManagement.Response.PatientLoginResponse;

public interface PatientService {
	String addPatient(PatientDto patientDto);
	
	String addPatient(PatientSaveDto patientSaveDto );
	
	PatientLoginResponse loginPatient(PatientLoginDto patientLoginDto);
	
	 List<PatientDto> getAllPatient();
	
	//get patient
	
	
	//delete
	boolean deletePatient(int id);
	
	//update
	String updatePatient(PatientUpdateDto patientUpdateDto);
	
	
	//get single patient
	public Patient getUser(String username);


}