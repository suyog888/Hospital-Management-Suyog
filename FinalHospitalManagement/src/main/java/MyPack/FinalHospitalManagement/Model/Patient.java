package MyPack.FinalHospitalManagement.Model;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {
	@Id
	@Column(name="patientId",length=45)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int patientId;
	//fname
	//lastname
	//username
	//password
	//dob
	//email
	//phone
	//address
	//Insurance Provider
	//Policy/ID Number:
	//Reason for Appointment
	//Preferred Appointment Date and Time:
	//Medical History
	//Emergency Contact Information
	// regi date
	
	@Column(name="firstName", length = 245,nullable = true)
	private String firstName;
	
	@Column(name="lastName" ,length=245 ,nullable = true)
	private String lastName;
	
	
	@Column(name="username", length = 245 ,nullable = false)
	private String username;
	
	@Column(name="password", length = 245,nullable = true)
	private String password;
	
	@Column(name="dob", length = 245,nullable = true)
	private String dob;
	
	@Column(name="email", length = 245,nullable = true)
	private String email;
	
	@Column(name="phone", length = 245,nullable = true)
	private String phone;
	
	@Column(name="address", length = 245,nullable = true)
	private String address;
	
	//Insurance Provider
		//Policy/ID Number:
		//Reason for Appointment
		//Preferred Appointment Date and Time:
		//Medical History
		//Emergency Contact Information
		// regi date
	
	@Column(name="insuranceProvider", length = 245,nullable = true)
	private String insuranceProvider;
	
	@Column(name="PolicyId", length = 245,nullable = true)
	private String policyId;
	
	@Column(name="reason", length = 245,nullable = true)
	private String reason;

	@Column(name="dateAndTime", length = 245,nullable = true)
	private String dateAndTime;

	@Column(name="history", length = 245,nullable = true)
	private String history;

	@Column(name="emergencyContact", length = 245,nullable = true)
	private String emergencyContact;

	@Column(name="regiDate", length = 245,nullable = true)
	private String regiDate;
	
	
	@Column(name="bloodGroup", length = 245,nullable = true)
	private String bloodGroup;
	
	@Column(name="gender", length = 255,nullable = true)
	private String gender;
	
	
	
	
	@Column(columnDefinition="Blob")
	private byte[] profile;
	@Column(name="status", length = 255,nullable = true)
	private String status;
	
	public Patient() {
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

	public Patient(int patientId, String firstName, String lastName, String username, String password, String dob,
			String email, String phone, String address, String insuranceProvider, String policyId, String reason,
			String dateAndTime, String history, String emergencyContact, String regiDate, String bloodGroup,
			String gender, byte[] profile, String status) {
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

	public Patient(String firstName, String lastName, String username, String password, String dob, String email,
			String phone, String address, String insuranceProvider, String policyId, String reason, String dateAndTime,
			String history, String emergencyContact, String regiDate, String bloodGroup, String gender, byte[] profile,
			String status) {
		super();
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
		return "Patient [patientId=" + patientId + ", firstName=" + firstName + ", lastName=" + lastName + ", username="
				+ username + ", password=" + password + ", dob=" + dob + ", email=" + email + ", phone=" + phone
				+ ", address=" + address + ", insuranceProvider=" + insuranceProvider + ", policyId=" + policyId
				+ ", reason=" + reason + ", dateAndTime=" + dateAndTime + ", history=" + history + ", emergencyContact="
				+ emergencyContact + ", regiDate=" + regiDate + ", bloodGroup=" + bloodGroup + ", gender=" + gender
				+ ", profile=" + Arrays.toString(profile) + ", status=" + status + "]";
	}
	
	
	
	



	

	


}