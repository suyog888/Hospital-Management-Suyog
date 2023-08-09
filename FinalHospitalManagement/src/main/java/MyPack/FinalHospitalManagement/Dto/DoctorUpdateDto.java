
package MyPack.FinalHospitalManagement.Dto;

import java.util.Arrays;

public class DoctorUpdateDto {
	private long doctorId;
	private String firstName;
	private String lastName;
	private String username;
	private String email;
	private String Phone;
	private String city;
	private String pinCode;
	private String password;
	private String salary;
	private String qualification;
	private String dob;
	private String experience;
	private String specialty;
	private String bloodGroup;
	private String gender;
	private boolean enabled =true;
	private byte[] profile;
	public DoctorUpdateDto(long doctorId, String firstName, String lastName, String username, String email, String phone,
			String city, String pinCode, String password, String salary, String qualification, String dob,
			String experience, String specialty, String bloodGroup, String gender, boolean enabled, byte[] profile) {
		super();
		this.doctorId = doctorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.email = email;
		Phone = phone;
		this.city = city;
		this.pinCode = pinCode;
		this.password = password;
		this.salary = salary;
		this.qualification = qualification;
		this.dob = dob;
		this.experience = experience;
		this.specialty = specialty;
		this.bloodGroup = bloodGroup;
		this.gender = gender;
		this.enabled = enabled;
		this.profile = profile;
	}
	public DoctorUpdateDto() {
		// TODO Auto-generated constructor stub
	}
	public long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
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
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
		return "DoctorUpdate [doctorId=" + doctorId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", username=" + username + ", email=" + email + ", Phone=" + Phone + ", city=" + city + ", pinCode="
				+ pinCode + ", password=" + password + ", salary=" + salary + ", qualification=" + qualification
				+ ", dob=" + dob + ", experience=" + experience + ", specialty=" + specialty + ", bloodGroup="
				+ bloodGroup + ", gender=" + gender + ", enabled=" + enabled + ", profile=" + Arrays.toString(profile)
				+ "]";
	}
	

}
