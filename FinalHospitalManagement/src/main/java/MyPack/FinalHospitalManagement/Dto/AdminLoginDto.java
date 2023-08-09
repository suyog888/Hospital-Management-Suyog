package MyPack.FinalHospitalManagement.Dto;

public class AdminLoginDto {
	private String username;
	private String password;
	public AdminLoginDto() {
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
	public AdminLoginDto(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "AdminLoginDto [username=" + username + ", password=" + password + "]";
	}
	

}
