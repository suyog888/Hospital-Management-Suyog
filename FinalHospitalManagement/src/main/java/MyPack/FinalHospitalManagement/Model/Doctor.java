package MyPack.FinalHospitalManagement.Model;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


	//doctor id
		
		
		//qualification
		//
		//Experience
		//
		//blood group
		//
		
	
	@Entity
	@Table(name="doctor")
	public class Doctor {
		@Id
		@Column(name="doctorId", length = 45)
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long doctorId;
		
		@Column(name="firstName", length = 255)
		private String firstName;
		
		@Column(name="lastName", length = 255)
		private String lastName;
		
		
		@Column(name="username", length = 255,unique = true)
		private String username;
		
		@Column(name="email", length = 255)
		private String email;
		
		@Column(name="phone", length = 255)
		private String phone;
		
		@Column(name="city", length = 255)
		private String city;
		
		@Column(name="pinCode", length = 255)
		private String pinCode;
		
		@Column(name="password", length = 255)
		private String password;
		
		@Column(name="salary", length = 255)
		private String salary;
		
		@Column(name="qualification", length = 255)
		private String qualification;
		
		@Column(name="dob", length = 255)
		private String dob;
		
		@Column(name="experience", length = 255)
		private String experience;
		
		
		@Column(name="specialty", length = 255)
		private String specialty;
		
		
		@Column(name="bloodGroup", length = 255)
		private String bloodGroup;
		
		@Column(name="gender", length = 255)
		private String gender;
		
		
		
		private boolean enabled =true;
		@Column(columnDefinition="Blob")
		private byte[] profile;
		
		public Doctor() {
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
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
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

		public Doctor(long doctorId, String firstName, String lastName, String username, String email, String phone,
				String city, String pinCode, String password, String salary, String qualification, String dob,
				String experience, String specialty, String bloodGroup, String gender, boolean enabled,
				byte[] profile) {
			super();
			this.doctorId = doctorId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.username = username;
			this.email = email;
			this.phone = phone;
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

		@Override
		public String toString() {
			return "Doctor [doctorId=" + doctorId + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", username=" + username + ", email=" + email + ", phone=" + phone + ", city=" + city
					+ ", pinCode=" + pinCode + ", password=" + password + ", salary=" + salary + ", qualification="
					+ qualification + ", dob=" + dob + ", experience=" + experience + ", specialty=" + specialty
					+ ", bloodGroup=" + bloodGroup + ", gender=" + gender + ", enabled=" + enabled + ", profile="
					+ Arrays.toString(profile) + "]";
		}

		public Doctor(String firstName, String lastName, String username, String email, String phone, String city,
				String pinCode, String password, String salary, String qualification, String dob, String experience,
				String specialty, String bloodGroup, String gender, boolean enabled, byte[] profile) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.username = username;
			this.email = email;
			this.phone = phone;
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
		
		
		

		
	

}
