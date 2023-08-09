package MyPack.FinalHospitalManagement.Model;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	@Id
	@Column(name="adminId", length = 45)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int adminId;
	
	@Column(name="firstName", length = 255)
	private String firstName;
	
	@Column(name="lastName", length = 255)
	private String lastName;
	
	
	@Column(name="username", length = 255)
	private String username;
	
	@Column(name="email", length = 255)
	private String email;
	
	@Column(name="Phone", length = 255)
	private String Phone;
	
	@Column(name="city", length = 255)
	private String city;
	
	@Column(name="pinCode", length = 255)
	private String pinCode;
	
	@Column(name="password", length = 255)
	private String password;
	
	
	private boolean enabled =true;
	@Column(columnDefinition="Blob")
	private byte[] profile;
	
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}


	public int getAdminId() {
		return adminId;
	}


	public void setAdminId(int adminId) {
		this.adminId = adminId;
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
		this.Phone = phone;
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


	public Admin(int adminId, String firstName, String lastName, String username, String email, String phone,
			String city, String pinCode, String password, boolean enabled, byte[] profile) {
		super();
		this.adminId = adminId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.email = email;
		this.Phone = phone;
		this.city = city;
		this.pinCode = pinCode;
		this.password = password;
		this.enabled = enabled;
		this.profile = profile;
	}


	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", firstName=" + firstName + ", lastName=" + lastName + ", username="
				+ username + ", email=" + email + ", Phone=" + Phone + ", city=" + city + ", pinCode=" + pinCode
				+ ", password=" + password + ", enabled=" + enabled + ", profile=" + Arrays.toString(profile) + "]";
	}


	public Admin(String firstName, String lastName, String username, String email, String phone, String city,
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
	
	
    
}
