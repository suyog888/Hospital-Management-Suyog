package MyPack.FinalHospitalManagement.Dto;

public class NoticeSaveDto {
	private String noticeTitle;
	private String noticeDis;
	
	public NoticeSaveDto() {
		// TODO Auto-generated constructor stub
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeDis() {
		return noticeDis;
	}

	public void setNoticeDis(String noticeDis) {
		this.noticeDis = noticeDis;
	}

	public NoticeSaveDto(String noticeTitle, String noticeDis) {
		super();
		this.noticeTitle = noticeTitle;
		this.noticeDis = noticeDis;
	}

	@Override
	public String toString() {
		return "NoticeSaveDto [noticeTitle=" + noticeTitle + ", noticeDis=" + noticeDis + "]";
	}
	
	
	


}
