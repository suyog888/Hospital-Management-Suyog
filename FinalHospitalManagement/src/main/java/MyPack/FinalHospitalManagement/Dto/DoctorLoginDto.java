package MyPack.FinalHospitalManagement.Dto;

public class DoctorLoginDto {
	private String username;
	private String password;
	public DoctorLoginDto() {
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public DoctorLoginDto(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "DoctorLoginDto [username=" + username + ", password=" + password + "]";
	}
	

}
