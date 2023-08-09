package MyPack.FinalHospitalManagement.Response;

public class PatientLoginResponse {
	String message;
	Boolean status;
	public PatientLoginResponse() {
		// TODO Auto-generated constructor stub
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "PatientLoginResponse [message=" + message + ", status=" + status + "]";
	}
	public PatientLoginResponse(String message, Boolean status) {
		super();
		this.message = message;
		this.status = status;
	}
	

}
