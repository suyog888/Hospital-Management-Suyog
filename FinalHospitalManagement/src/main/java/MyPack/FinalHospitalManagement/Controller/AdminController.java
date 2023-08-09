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

import MyPack.FinalHospitalManagement.Dto.AdminDto;
import MyPack.FinalHospitalManagement.Dto.AdminLoginDto;
import MyPack.FinalHospitalManagement.Dto.AdminSaveDto;
import MyPack.FinalHospitalManagement.Dto.AdminUpdateDto;
import MyPack.FinalHospitalManagement.Model.Admin;
import MyPack.FinalHospitalManagement.Response.AdminLoginResponse;
import MyPack.FinalHospitalManagement.Service.AdminService;

@RestController
@CrossOrigin("*")
@RequestMapping("api/v1/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@PostMapping(path="/save")
	public String saveAdmin(@RequestBody AdminSaveDto adminSaveDto) {
		String id=adminService.addAdmin(adminSaveDto);
		return id;
	}
	@PostMapping(path="/login")
	public ResponseEntity<?> loginAdmin(@RequestBody AdminLoginDto adminLoginDto)
	{
		AdminLoginResponse adminLoginResponse=adminService.loginAdmin(adminLoginDto);
		return ResponseEntity.ok(adminLoginResponse);
	}
	@GetMapping("/getAllAdmin")
	public List<AdminDto> getAllAdmin(){
		List<AdminDto>allAdmin=adminService.getAllAdmin();
		return allAdmin;
	}
	
	@DeleteMapping("/deleteadmin/{id}")
	public String deleteAdmin(@PathVariable(value = "id")int id) {
		boolean deleteAdmin= adminService.deleteAdmin(id);
		return "deleted";
	}
	@PutMapping("/update")
		public String updateAdmin(@RequestBody AdminUpdateDto adminUpdateDto) {
		String id=adminService.updateAdmin(adminUpdateDto);
		return id;
		
	}
	
	
	
	@GetMapping("/{username}")
	public Admin getUser(@PathVariable("username") String username)
	{
		return this.adminService.getUser(username);

	}

}
