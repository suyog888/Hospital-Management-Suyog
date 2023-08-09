package MyPack.FinalHospitalManagement.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import MyPack.FinalHospitalManagement.Dto.PatientDto;
import MyPack.FinalHospitalManagement.Dto.PatientLoginDto;
import MyPack.FinalHospitalManagement.Dto.PatientSaveDto;
import MyPack.FinalHospitalManagement.Dto.PatientUpdateDto;
import MyPack.FinalHospitalManagement.Model.Patient;
import MyPack.FinalHospitalManagement.Repo.PatientRepo;
import MyPack.FinalHospitalManagement.Response.PatientLoginResponse;
import MyPack.FinalHospitalManagement.Service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	private PatientRepo patientRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public String addPatient(PatientDto patientDto) {
		
		Patient patient=new Patient(
				patientDto.getPatientId(),
				patientDto.getFirstName(),
				patientDto.getLastName(),
				patientDto.getUsername(),
				this.passwordEncoder.encode(patientDto.getPassword()),
				patientDto.getDob(),
				patientDto.getEmail(),
				patientDto.getPhone(),
				patientDto.getAddress(),
				patientDto.getInsuranceProvider(),
				patientDto.getPolicyId(),
				patientDto.getReason(),
				patientDto.getDateAndTime(),
				patientDto.getHistory(),
				patientDto.getEmergencyContact(),
				patientDto.getRegiDate(),
				patientDto.getBloodGroup(),
				patientDto.getGender(),
				patientDto.getProfile(),
				patientDto.getStatus()
				
				
				
				
				
				);
		patientRepo.save(patient);
		return patient.getFirstName();
	}

	@Override
	public PatientLoginResponse loginPatient(PatientLoginDto patientLoginDto) {
		String msg = "";
        Patient patient1 = patientRepo.findByUsername(patientLoginDto.getUsername());
        if (patient1 != null) {
            String password = patientLoginDto.getPassword();
            String encodedPassword = patient1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<Patient> patient = patientRepo.findOneByUsernameAndPassword(patientLoginDto.getUsername(), encodedPassword);
                if (patient.isPresent()) {
                    return new PatientLoginResponse("Login Success", true);
                } else {
                    return new PatientLoginResponse("Login Failed", false);
                }
            } else {
                return new PatientLoginResponse("password Not Match", false);
            }
        }else {
            return new PatientLoginResponse("Email not exits", false);
        }
	}

	@Override
	public String addPatient(PatientSaveDto patientSaveDto) {
		// TODO Auto-generated method stub
		Patient patient=new Patient(
				 patientSaveDto.getFirstName(),
					patientSaveDto.getLastName(),
					patientSaveDto.getUsername(),
					this.passwordEncoder.encode(patientSaveDto.getPassword()),
					patientSaveDto.getDob(),
					patientSaveDto.getEmail(),
					patientSaveDto.getPhone(),
					patientSaveDto.getAddress(),
					patientSaveDto.getInsuranceProvider(),
					patientSaveDto.getPolicyId(),
					patientSaveDto.getReason(),
					patientSaveDto.getDateAndTime(),
					patientSaveDto.getHistory(),
					patientSaveDto.getEmergencyContact(),
					patientSaveDto.getRegiDate(),
					patientSaveDto.getBloodGroup(),
					patientSaveDto.getGender(),
					patientSaveDto.getProfile(),
					patientSaveDto.getStatus()
				
				
				
				);
		patientRepo.save(patient);
		return patient.getFirstName();
	}

	@Override
	public List<PatientDto> getAllPatient() {
		// TODO Auto-generated method stub
		List<Patient>getPatients=patientRepo.findAll();
		List<PatientDto>patientDtoList=new ArrayList<>();
		for(Patient a:getPatients) {
			PatientDto patientDto=new PatientDto(
					 a.getPatientId(),
					  a.getFirstName(),
					  a.getLastName(),
					  a.getUsername(),
					  a.getPassword(),
					  a.getDob(),
					  a.getEmail(),
					  a.getPhone(),
					  a.getAddress(),
					  a.getInsuranceProvider(),
					  a.getPolicyId(),
					  a.getReason(),
					  a.getDateAndTime(),
					  a.getHistory(),
					  a.getEmergencyContact(),
					  a.getRegiDate(),
					  a.getBloodGroup(),
					  a.getGender(),
					  a.getProfile(),
					  a.getStatus()
					  );
			patientDtoList.add(patientDto);
		}
		return patientDtoList;
	}

	@Override
	public boolean deletePatient(int id) {
		// TODO Auto-generated method stub
		if(patientRepo.existsById(id)) {
			patientRepo.deleteById(id);
		}
		else {
			System.out.println("Patient id not found......");
		}
		return true;
	}

	@Override
	public String updatePatient(PatientUpdateDto patientUpdateDto) {
		// TODO Auto-generated method stub
		if(patientRepo.existsById(patientUpdateDto.getPatientId())) {
			Patient patient=patientRepo.getById(patientUpdateDto.getPatientId());
			patient.setFirstName(patientUpdateDto.getFirstName());
			patient.setLastName(patientUpdateDto.getLastName());
			patient.setUsername(patientUpdateDto.getUsername());
			patient.setPassword(this.passwordEncoder.encode(patientUpdateDto.getPassword()));
			patient.setDob(patientUpdateDto.getDob());
			patient.setEmail(patientUpdateDto.getEmail());
			patient.setPhone(patientUpdateDto.getPhone());
			patient.setAddress(patientUpdateDto.getAddress());
			patient.setInsuranceProvider(patientUpdateDto.getInsuranceProvider());
			patient.setPolicyId(patientUpdateDto.getPolicyId());
			patient.setReason(patientUpdateDto.getReason());
			patient.setDateAndTime(patientUpdateDto.getDateAndTime());
			patient.setHistory(patientUpdateDto.getHistory());
			patient.setEmergencyContact(patientUpdateDto.getEmergencyContact());
			patient.setRegiDate(patientUpdateDto.getRegiDate());
			patient.setBloodGroup(patientUpdateDto.getBloodGroup());
			patient.setGender(patientUpdateDto.getGender());
			patient.setProfile(patientUpdateDto.getProfile());
			patient.setStatus(patientUpdateDto.getStatus());
			patientRepo.save(patient);
		}
		else {
			System.out.println("Patient id not exist!!!!!!");
		}
		
		return null;
	}

	//getting User by username
		@Override
		public Patient getUser(String username)
		{
			System.out.println(username+" login succesfully");
			return this.patientRepo.findByUsername(username);
		}

	

}