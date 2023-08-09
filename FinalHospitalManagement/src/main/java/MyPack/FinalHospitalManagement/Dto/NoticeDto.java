package MyPack.FinalHospitalManagement.Dto;

public class NoticeDto {
	private int noticeId;
	private String noticeTitle;
	private String noticeDis;
	public NoticeDto() {
		// TODO Auto-generated constructor stub
	}
	public int getNoticeId() {
		return noticeId;
	}
	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
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
	public NoticeDto(int noticeId, String noticeTitle, String noticeDis) {
		super();
		this.noticeId = noticeId;
		this.noticeTitle = noticeTitle;
		this.noticeDis = noticeDis;
	}
	@Override
	public String toString() {
		return "NoticeDto [noticeId=" + noticeId + ", noticeTitle=" + noticeTitle + ", noticeDis=" + noticeDis + "]";
	}
	
	
}
