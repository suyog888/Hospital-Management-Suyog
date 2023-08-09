package MyPack.FinalHospitalManagement.Response;

public class AdminLoginResponse {
	String message;
	Boolean status;
	public AdminLoginResponse() {
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
		return "AdminLoginResponse [message=" + message + ", status=" + status + "]";
	}
	public AdminLoginResponse(String message, Boolean status) {
		super();
		this.message = message;
		this.status = status;
	}
	
	

}
