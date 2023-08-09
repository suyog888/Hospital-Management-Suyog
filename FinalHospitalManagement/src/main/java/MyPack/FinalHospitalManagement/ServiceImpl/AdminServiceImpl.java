package MyPack.FinalHospitalManagement.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import MyPack.FinalHospitalManagement.Dto.AdminDto;
import MyPack.FinalHospitalManagement.Dto.AdminLoginDto;
import MyPack.FinalHospitalManagement.Dto.AdminSaveDto;
import MyPack.FinalHospitalManagement.Dto.AdminUpdateDto;
import MyPack.FinalHospitalManagement.Model.Admin;
import MyPack.FinalHospitalManagement.Repo.AdminRepo;
import MyPack.FinalHospitalManagement.Response.AdminLoginResponse;
import MyPack.FinalHospitalManagement.Service.AdminService;


@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminRepo adminRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	

	@Override
	public AdminLoginResponse loginAdmin(AdminLoginDto adminLoginDto) {
		 String msg = "";
	        Admin admin1 = adminRepo.findByUsername(adminLoginDto.getUsername());
	        if (admin1 != null) {
	            String password = adminLoginDto.getPassword();
	            String encodedPassword = admin1.getPassword();
	            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
	            if (isPwdRight) {
	                Optional<Admin> admin = adminRepo.findOneByUsernameAndPassword(adminLoginDto.getUsername(), encodedPassword);
	                if (admin.isPresent()) {
	                    return new AdminLoginResponse("Login Success", true);
	                } else {
	                    return new AdminLoginResponse("Login Failed", false);
	                }
	            } else {
	                return new AdminLoginResponse("password Not Match", false);
	            }
	        }else {
	            return new AdminLoginResponse("Email not exits", false);
	        }
	}



	@Override
	public String addAdmin(AdminDto adminDto) {
		// TODO Auto-generated method stub
	Admin  admin=new Admin(
				adminDto.getAdminId(),
				adminDto.getFirstName(),
				adminDto.getLastName(),
				adminDto.getUsername(),
				adminDto.getEmail(),
				adminDto.getPhone(),
				adminDto.getCity(),
				adminDto.getPinCode(),
				this.passwordEncoder.encode(adminDto.getPassword()),
				adminDto.isEnabled(),
				adminDto.getProfile()
				
				);
		adminRepo.save(admin);
		return admin.getFirstName();
	}



	@Override
	public String addAdmin(AdminSaveDto adminSaveDto) {
		// TODO Auto-generated method stub
		Admin admin=new Admin(
				adminSaveDto.getFirstName(),
				adminSaveDto.getLastName(),
				adminSaveDto.getUsername(),
				adminSaveDto.getEmail(),
				adminSaveDto.getPhone(),
				adminSaveDto.getCity(),
				adminSaveDto.getPinCode(),
				this.passwordEncoder.encode(adminSaveDto.getPassword()),
				adminSaveDto.isEnabled(),
				adminSaveDto.getProfile()
				);
		adminRepo.save(admin);
		
		return admin.getFirstName();
	}



	@Override
	public List<AdminDto> getAllAdmin() {
		// TODO Auto-generated method stub
		List<Admin>getAdmins=adminRepo.findAll();
		List<AdminDto>adminDtoList=new ArrayList<>();
		for(Admin a:getAdmins) {
			AdminDto adminDto=new AdminDto(
			a.getAdminId(),
			a.getFirstName(),
			a.getLastName(),
			a.getUsername(),
			a.getEmail(),
			a.getPhone(),
			a.getCity(),
			a.getPinCode(),
			a.getPassword(),
			a.isEnabled(),
			a.getProfile());
			adminDtoList.add(adminDto);
		}
		return adminDtoList;
	}



	@Override
	public String updateAdmin(AdminUpdateDto adminUpdateDto) {
		// TODO Auto-generated method stub
		if(adminRepo.existsById(adminUpdateDto.getAdminId())) {
			Admin admin=adminRepo.getById(adminUpdateDto.getAdminId());
			admin.setFirstName(adminUpdateDto.getFirstName());
			admin.setLastName(adminUpdateDto.getLastName());
			admin.setUsername(adminUpdateDto.getUsername());
			admin.setEmail(adminUpdateDto.getEmail());
			admin.setPhone(adminUpdateDto.getPhone());
			admin.setCity(adminUpdateDto.getCity());
			admin.setPinCode(adminUpdateDto.getPinCode());
			admin.setPassword(adminUpdateDto.getPassword());
			admin.setProfile(adminUpdateDto.getProfile());
			adminRepo.save(admin);
			
		}
		else {
			System.out.println("admin is not exist!!!!");
		}
		return null;
	}



	@Override
	public boolean deleteAdmin(int id) {
		// TODO Auto-generated method stub
		if(adminRepo.existsById(id)) {
			adminRepo.deleteById(id);
		}
		else {
			System.out.println("admin is not found");
		}
		return true;
	}



	@Override
	public Admin getUser(String username) {
		// TODO Auto-generated method stub
		System.out.println(username+" login succesfully");
		return this.adminRepo.findByUsername(username);
	}




}
