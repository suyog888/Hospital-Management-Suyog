package MyPack.FinalHospitalManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import MyPack.FinalHospitalManagement.Dto.DoctorDto;
import MyPack.FinalHospitalManagement.Dto.DoctorLoginDto;
import MyPack.FinalHospitalManagement.Dto.DoctorSaveDto;
import MyPack.FinalHospitalManagement.Dto.DoctorUpdateDto;
import MyPack.FinalHospitalManagement.Model.Doctor;
import MyPack.FinalHospitalManagement.Repo.DoctorRepo;
import MyPack.FinalHospitalManagement.Response.DoctorLoginResponse;
import MyPack.FinalHospitalManagement.Service.DoctorService;

@RestController
@CrossOrigin("*")
@RequestMapping(path="api/v1/doctor")
public class DoctorController {
	@Autowired
	private DoctorService doctorService;
	
	
	
	@PostMapping(path="/save")
	public String saveDoctor(@RequestBody DoctorSaveDto doctorSaveDto) {
		String id=doctorService.addDoctor(doctorSaveDto);
		return id;
	}
	
	@PostMapping(path="/login")
	public ResponseEntity<?>loginDoctor(@RequestBody DoctorLoginDto doctorLoginDto){
		DoctorLoginResponse doctorLoginResponse=doctorService.loginDoctor(doctorLoginDto);
		return ResponseEntity.ok(doctorLoginResponse);
	}
	
	
	@GetMapping("/getAllDoctor")
	public List<DoctorDto> getAllDoctor()
	{
		List<DoctorDto>allDoctor=doctorService.getAllDoctor();
		return allDoctor;
	}
	@PutMapping(path="/update")
	public String updateDoctor(@RequestBody DoctorUpdateDto doctorUpdateDto) {
		String id=doctorService.updateDoctor(doctorUpdateDto);
		return id;
	}
	@DeleteMapping(path="/deletedoctor/{id}")
	public String deleteDoctor(@PathVariable(value = "id")long id) {
		boolean deleteDoctor=doctorService.deleteDoctor(id);
		return "deleted";
	}
}
