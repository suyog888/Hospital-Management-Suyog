package MyPack.FinalHospitalManagement.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MyPack.FinalHospitalManagement.Dto.NoticeDto;
import MyPack.FinalHospitalManagement.Dto.NoticeSaveDto;
import MyPack.FinalHospitalManagement.Dto.NoticeUpdateDto;
import MyPack.FinalHospitalManagement.Model.Notice;
import MyPack.FinalHospitalManagement.Repo.NoticeRepo;
import MyPack.FinalHospitalManagement.Service.NoticeService;
@Service
public class noticeServiceImpl implements NoticeService{
	@Autowired
	private NoticeRepo noticeRepo;

	@Override
	public String addNotice(NoticeDto noticeDto) {
		// TODO Auto-generated method stub
		Notice notice=new Notice(
				noticeDto.getNoticeId(),
				noticeDto.getNoticeTitle(),
				noticeDto.getNoticeDis()
				
				);
		noticeRepo.save(notice);
		return notice.getNoticeTitle();
	}

	@Override
	public String addNotice(NoticeSaveDto noticeSaveDto) {
		// TODO Auto-generated method stub
		Notice notice=new Notice(
				noticeSaveDto.getNoticeTitle(),
				noticeSaveDto.getNoticeDis()
				);
		noticeRepo.save(notice);
		return notice.getNoticeTitle();
	}

	@Override
	public List<NoticeDto> getAllNotice() {
		// TODO Auto-generated method stub
		List<Notice>getNotices=noticeRepo.findAll();
		List<NoticeDto>noticeDtoList=new ArrayList<>();
		for(Notice a:getNotices) {
			NoticeDto noticeDto=new NoticeDto(
			a.getNoticeId(),
			a.getNoticeTitle(),
			a.getNoticeDis()
			);
			noticeDtoList.add(noticeDto);
		}
		return noticeDtoList;
	}

	@Override
	public String updateNotice(NoticeUpdateDto noticeUpdateDto) {
		// TODO Auto-generated method stub
		if(noticeRepo.existsById(noticeUpdateDto.getNoticeId())) {
			Notice notice=noticeRepo.getById(noticeUpdateDto.getNoticeId());
			notice.setNoticeTitle(noticeUpdateDto.getNoticeTitle());
			notice.setNoticeDis(noticeUpdateDto.getNoticeDis());
			noticeRepo.save(notice);
		}
		else {
			System.out.println("Notice not exist");
		}
		return null;
	}

	@Override
	public boolean deleteNotice(int id) {
		// TODO Auto-generated method stub
		if(noticeRepo.existsById(id)) {
			noticeRepo.deleteById(id);
		}
		else {
			System.out.println("notice not found");
		}
		return true;
	}

	@Override
	public Notice getNotice(int noticeId) {
		// TODO Auto-generated method stub
		System.out.println(noticeId);
		return this.noticeRepo.findById(noticeId);
	}
	
	

}
