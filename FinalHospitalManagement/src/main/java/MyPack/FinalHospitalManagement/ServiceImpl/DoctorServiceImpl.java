package MyPack.FinalHospitalManagement.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import MyPack.FinalHospitalManagement.Dto.DoctorDto;
import MyPack.FinalHospitalManagement.Dto.DoctorLoginDto;
import MyPack.FinalHospitalManagement.Dto.DoctorSaveDto;
import MyPack.FinalHospitalManagement.Dto.DoctorUpdateDto;
import MyPack.FinalHospitalManagement.Model.Doctor;
import MyPack.FinalHospitalManagement.Repo.DoctorRepo;

import MyPack.FinalHospitalManagement.Response.DoctorLoginResponse;
import MyPack.FinalHospitalManagement.Service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	private DoctorRepo doctorRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public String addDoctor(DoctorDto doctorDto) {
		// TODO Auto-generated method stub
		Doctor doctor =new Doctor(
				doctorDto.getDoctorId(),
				doctorDto.getFirstName(),
				doctorDto.getLastName(),
				doctorDto.getUsername(),
				doctorDto.getEmail(),
				doctorDto.getPhone(),
				doctorDto.getCity(),
				doctorDto.getPinCode(),
				this.passwordEncoder.encode(doctorDto.getPassword()),
				doctorDto.getSalary(),
				doctorDto.getQualification(),
				doctorDto.getDob(),
				doctorDto.getExperience(),
				doctorDto.getSpecialty(),
				doctorDto.getBloodGroup(),
				doctorDto.getGender(),
				doctorDto.isEnabled(),
				doctorDto.getProfile()
				
				
				
				);
		doctorRepo.save(doctor);
		return  doctor.getFirstName();
	}

	@Override
	public DoctorLoginResponse loginDoctor(DoctorLoginDto doctorLoginDto) {
		// TODO Auto-generated method stub
		
		 String msg = "";
	        Doctor doctor1 = doctorRepo.findByUsername(doctorLoginDto.getUsername());
	        if (doctor1 != null) {
	            String password = doctorLoginDto.getPassword();
	            String encodedPassword = doctor1.getPassword();
	            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
	            if (isPwdRight) {
	                Optional<Doctor> doctor = doctorRepo.findOneByUsernameAndPassword(doctorLoginDto.getUsername(), encodedPassword);
	                if (doctor.isPresent()) {
	                    return new DoctorLoginResponse("Login Success", true);
	                } else {
	                    return new DoctorLoginResponse("Login Failed", false);
	                }
	            } else {
	                return new DoctorLoginResponse("password Not Match", false);
	            }
	        }else {
	            return new DoctorLoginResponse("Email not exits", false);
	        }
	}

	@Override
	public String addDoctor(DoctorSaveDto doctorSaveDto) {
		// TODO Auto-generated method stub
		Doctor doctor =new Doctor(
				doctorSaveDto.getFirstName(),
				doctorSaveDto.getLastName(),
				doctorSaveDto.getUsername(),
				doctorSaveDto.getEmail(),
				doctorSaveDto.getPhone(),
				doctorSaveDto.getCity(),
				doctorSaveDto.getPinCode(),
				this.passwordEncoder.encode(doctorSaveDto.getPassword()),
				doctorSaveDto.getSalary(),
				doctorSaveDto.getQualification(),
				doctorSaveDto.getDob(),
				doctorSaveDto.getExperience(),
				doctorSaveDto.getSpecialty(),
				doctorSaveDto.getBloodGroup(),
				doctorSaveDto.getGender(),
				doctorSaveDto.isEnabled(),
				doctorSaveDto.getProfile()
				);
				doctorRepo.save(doctor);
				return doctor.getFirstName();
	}

	@Override
	public List<DoctorDto> getAllDoctor() {
		// TODO Auto-generated method stub
		List<Doctor>getDoctors=doctorRepo.findAll();
		List<DoctorDto>doctorDtoList=new ArrayList<>();
		for(Doctor a:getDoctors) {
			DoctorDto doctorDto=new DoctorDto(
					a.getDoctorId(),
					a.getFirstName(),
					a.getLastName(),
					a.getUsername(),
					a.getEmail(),
					a.getPhone(),
					a.getCity(),
					a.getPinCode(),
					a.getPassword(),
					a.getSalary(),
					a.getQualification(),
					a.getDob(),
					a.getExperience(),
					a.getSpecialty(),
					a.getBloodGroup(),
					a.getGender(),
					a.isEnabled(),
					a.getProfile());
			doctorDtoList.add(doctorDto);
		}
		return doctorDtoList;
	}

	@Override
	public String updateDoctor(DoctorUpdateDto doctorUpdateDto) {
		// TODO Auto-generated method stub
		if(doctorRepo.existsById(doctorUpdateDto.getDoctorId())) {
			Doctor doctor=doctorRepo.getById(doctorUpdateDto.getDoctorId());
			doctor.setFirstName(doctorUpdateDto.getFirstName());
			doctor.setLastName(doctorUpdateDto.getLastName());
			doctor.setUsername(doctorUpdateDto.getUsername());
			doctor.setEmail(doctorUpdateDto.getEmail());
			doctor.setPhone(doctorUpdateDto.getPhone());
			doctor.setCity(doctorUpdateDto.getCity());
			doctor.setPinCode(doctorUpdateDto.getPinCode());
			doctor.setPassword(this.passwordEncoder.encode(doctorUpdateDto.getPassword()));
			doctor.setSalary(doctorUpdateDto.getSalary());
			doctor.setQualification(doctorUpdateDto.getQualification());
			doctor.setDob(doctorUpdateDto.getDob());
			doctor.setExperience(doctorUpdateDto.getExperience());
			doctor.setSpecialty(doctorUpdateDto.getSpecialty());
			doctor.setBloodGroup(doctorUpdateDto.getBloodGroup());
			doctor.setGender(doctorUpdateDto.getGender());
			doctor.setProfile(doctorUpdateDto.getProfile());
			doctorRepo.save(doctor);
			
			
			
			
			
		}
		else {
			System.out.println("Doctor id not exist!!!!");
		}
		return null;
	}

	@Override
	public boolean deleteDoctor(long id) {
		// TODO Auto-generated method stub
		if(doctorRepo.existsById(id)) {
			doctorRepo.deleteById(id);
		}
		else {
			System.out.println("doctor id not found");
		}
		return true;
	}

	
	
	
	

}
