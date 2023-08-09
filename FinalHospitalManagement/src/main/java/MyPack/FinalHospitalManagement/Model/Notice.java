package MyPack.FinalHospitalManagement.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="notice")
public class Notice {
	@Id
	@Column(name="noticeId",length=45)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int noticeId;
	
	@Column(name="noticetitle",length=500)
	private String noticeTitle;
	
	
	@Column(name="noticeDis",length=2000)
	private String noticeDis;
	public Notice() {
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
	public Notice(int noticeId, String noticeTitle, String noticeDis) {
		super();
		this.noticeId = noticeId;
		this.noticeTitle = noticeTitle;
		this.noticeDis = noticeDis;
	}
	@Override
	public String toString() {
		return "Notice [noticeId=" + noticeId + ", noticeTitle=" + noticeTitle + ", noticeDis=" + noticeDis + "]";
	}
	public Notice(String noticeTitle, String noticeDis) {
		super();
		this.noticeTitle = noticeTitle;
		this.noticeDis = noticeDis;
	}
	
	
	
	
	

}
