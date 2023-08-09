package MyPack.FinalHospitalManagement.Dto;

import java.util.Arrays;

public class PatientUpdateDto {
	private int patientId;
	private String firstName;
	private String lastName;
	
	private String username;
	private String password;
	private String dob;
	private String email;
	private String phone;
	private String address;
	private String insuranceProvider;
	private String policyId;
	private String reason;
	private String dateAndTime;
	private String history;
	private String emergencyContact;
	private String regiDate;
	private String bloodGroup;
	private String gender;
	private byte[] profile;
	private String status;
	public PatientUpdateDto() {
		// TODO Auto-generated constructor stub
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getInsuranceProvider() {
		return insuranceProvider;
	}
	public void setInsuranceProvider(String insuranceProvider) {
		this.insuranceProvider = insuranceProvider;
	}
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getDateAndTime() {
		return dateAndTime;
	}
	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	public String getEmergencyContact() {
		return emergencyContact;
	}
	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}
	public String getRegiDate() {
		return regiDate;
	}
	public void setRegiDate(String regiDate) {
		this.regiDate = regiDate;
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
	public byte[] getProfile() {
		return profile;
	}
	public void setProfile(byte[] profile) {
		this.profile = profile;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public PatientUpdateDto(int patientId, String firstName, String lastName, String username, String password,
			String dob, String email, String phone, String address, String insuranceProvider, String policyId,
			String reason, String dateAndTime, String history, String emergencyContact, String regiDate,
			String bloodGroup, String gender, byte[] profile, String status) {
		super();
		this.patientId = patientId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.dob = dob;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.insuranceProvider = insuranceProvider;
		this.policyId = policyId;
		this.reason = reason;
		this.dateAndTime = dateAndTime;
		this.history = history;
		this.emergencyContact = emergencyContact;
		this.regiDate = regiDate;
		this.bloodGroup = bloodGroup;
		this.gender = gender;
		this.profile = profile;
		this.status = status;
	}
	@Override
	public String toString() {
		return "PatientUpdateDto [patientId=" + patientId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", username=" + username + ", password=" + password + ", dob=" + dob + ", email=" + email + ", phone="
				+ phone + ", address=" + address + ", insuranceProvider=" + insuranceProvider + ", policyId=" + policyId
				+ ", reason=" + reason + ", dateAndTime=" + dateAndTime + ", history=" + history + ", emergencyContact="
				+ emergencyContact + ", regiDate=" + regiDate + ", bloodGroup=" + bloodGroup + ", gender=" + gender
				+ ", profile=" + Arrays.toString(profile) + ", status=" + status + "]";
	}
	
	
}