package MyPack.FinalHospitalManagement.Service;

import java.util.List;

import MyPack.FinalHospitalManagement.Dto.AdminDto;
import MyPack.FinalHospitalManagement.Dto.AdminLoginDto;
import MyPack.FinalHospitalManagement.Dto.AdminSaveDto;
import MyPack.FinalHospitalManagement.Dto.AdminUpdateDto;
import MyPack.FinalHospitalManagement.Model.Admin;
import MyPack.FinalHospitalManagement.Response.AdminLoginResponse;

public interface AdminService {
	
	String addAdmin(AdminDto adminDto);
	
	String addAdmin(AdminSaveDto adminSaveDto);
	
	AdminLoginResponse loginAdmin(AdminLoginDto adminLoginDto);
	

	//get all admin
	 List<AdminDto>getAllAdmin();
	
	String updateAdmin(AdminUpdateDto adminUpdateDto);
	
	boolean deleteAdmin(int id);
	
	
	
	public Admin getUser(String username);
	
	
	

}
