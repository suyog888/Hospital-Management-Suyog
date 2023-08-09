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

import MyPack.FinalHospitalManagement.Dto.PatientDto;
import MyPack.FinalHospitalManagement.Dto.PatientLoginDto;
import MyPack.FinalHospitalManagement.Dto.PatientSaveDto;
import MyPack.FinalHospitalManagement.Dto.PatientUpdateDto;
import MyPack.FinalHospitalManagement.Model.Patient;
import MyPack.FinalHospitalManagement.Response.PatientLoginResponse;
import MyPack.FinalHospitalManagement.Service.PatientService;

@RestController
@CrossOrigin("*")
@RequestMapping(path="api/v1/patient")
public class PatientController {
	@Autowired
	private PatientService patientService;
	
	@PostMapping(path="/save")
	public String savePatient(@RequestBody PatientSaveDto patientSaveDto) {
		String id=patientService.addPatient(patientSaveDto);
		return id;
	}
	@PostMapping("/login")
	public ResponseEntity<?>loginPatient(@RequestBody PatientLoginDto patientLoginDto){
		PatientLoginResponse patientLoginResponse=patientService.loginPatient(patientLoginDto);
		return ResponseEntity.ok(patientLoginResponse);
	}
	@GetMapping("/getAllPatient")
	public List<PatientDto>getAllPatient(){
		List<PatientDto>allPatient=patientService.getAllPatient();
		return allPatient;
		
	}
	@PutMapping(path="/update")
	public String updatePatient(@RequestBody PatientUpdateDto patientUpdateDto) {
		String id=patientService.updatePatient(patientUpdateDto);
		return id;
	}
	@DeleteMapping(path="/deletepatient/{id}")
		public String deletePatient(@PathVariable(value = "id")int id) {
			boolean deletePatient=patientService.deletePatient(id);
			return "deleted";
		}
	
	@GetMapping("/{username}")
	public Patient getUser(@PathVariable("username") String username)
	{
		return this.patientService.getUser(username);

	}
	
	
	
	}


