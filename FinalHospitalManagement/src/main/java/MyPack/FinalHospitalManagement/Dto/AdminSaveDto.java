package MyPack.FinalHospitalManagement.Dto;

import java.util.Arrays;

public class AdminSaveDto {
	private String firstName;
	private String lastName;
	private String username;
	private String email;
	private String Phone;
	private String city;
	private String pinCode;
	private String password;
	private boolean enabled =true;
	private byte[] profile;
	public AdminSaveDto() {
		// TODO Auto-generated constructor stub
	}
	public AdminSaveDto(String firstName, String lastName, String username, String email, String phone, String city,
			String pinCode, String password, boolean enabled, byte[] profile) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.email = email;
		Phone = phone;
		this.city = city;
		this.pinCode = pinCode;
		this.password = password;
		this.enabled = enabled;
		this.profile = profile;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public byte[] getProfile() {
		return profile;
	}
	public void setProfile(byte[] profile) {
		this.profile = profile;
	}
	@Override
	public String toString() {
		return "AdminSaveDto [firstName=" + firstName + ", lastName=" + lastName + ", username=" + username + ", email="
				+ email + ", Phone=" + Phone + ", city=" + city + ", pinCode=" + pinCode + ", password=" + password
				+ ", enabled=" + enabled + ", profile=" + Arrays.toString(profile) + "]";
	}
	

}
