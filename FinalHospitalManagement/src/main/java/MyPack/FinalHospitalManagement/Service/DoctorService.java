package MyPack.FinalHospitalManagement.Service;

import java.util.List;

import MyPack.FinalHospitalManagement.Dto.DoctorDto;
import MyPack.FinalHospitalManagement.Dto.DoctorLoginDto;
import MyPack.FinalHospitalManagement.Dto.DoctorSaveDto;
import MyPack.FinalHospitalManagement.Dto.DoctorUpdateDto;
import MyPack.FinalHospitalManagement.Model.Doctor;
import MyPack.FinalHospitalManagement.Response.DoctorLoginResponse;

public interface DoctorService {
	
	String addDoctor(DoctorDto doctorDto);
	
	String addDoctor(DoctorSaveDto doctorSaveDto);
	
	DoctorLoginResponse loginDoctor(DoctorLoginDto doctorLoginDto);
	
	List<DoctorDto> getAllDoctor();
	
	String updateDoctor(DoctorUpdateDto doctorUpdateDto);
	
	boolean deleteDoctor(long id);
	
	
		
	
	
	
	

}
