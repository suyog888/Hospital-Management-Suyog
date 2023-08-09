package MyPack.FinalHospitalManagement.Service;

import java.util.List;

import MyPack.FinalHospitalManagement.Dto.NoticeDto;
import MyPack.FinalHospitalManagement.Dto.NoticeSaveDto;
import MyPack.FinalHospitalManagement.Dto.NoticeUpdateDto;
import MyPack.FinalHospitalManagement.Model.Notice;

public interface NoticeService {
	String addNotice(NoticeDto noticeDto);
	String addNotice(NoticeSaveDto noticeSaveDto);
	
	List<NoticeDto>getAllNotice();
	String updateNotice(NoticeUpdateDto noticeUpdateDto);
	boolean deleteNotice(int id);
	
	public Notice getNotice (int noticeId);

}
