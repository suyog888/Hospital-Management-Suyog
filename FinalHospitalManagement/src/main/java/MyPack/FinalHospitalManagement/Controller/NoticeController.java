package MyPack.FinalHospitalManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import MyPack.FinalHospitalManagement.Dto.NoticeDto;
import MyPack.FinalHospitalManagement.Dto.NoticeSaveDto;
import MyPack.FinalHospitalManagement.Dto.NoticeUpdateDto;
import MyPack.FinalHospitalManagement.Model.Notice;
import MyPack.FinalHospitalManagement.Service.NoticeService;

@RestController
@CrossOrigin("*")
@RequestMapping("api/v1/notice")

public class NoticeController {
	@Autowired
	private NoticeService noticeService;
	@PostMapping(path="/save")
	public String saveNotice(@RequestBody NoticeSaveDto noticeSaveDto) {
		String id=noticeService.addNotice(noticeSaveDto);
		return id;
	}
	
	@GetMapping(path="/getAllNotice")
	public List<NoticeDto>getAllNotice(){
		List<NoticeDto>allNotice=noticeService.getAllNotice();
		return allNotice;
	}
	@DeleteMapping(path="/deletenotice/{id}")
	public String deleteNotice(@PathVariable(value = "id")int id) {
		boolean deleteNotice=noticeService.deleteNotice(id);
		return "deleted";
	}
	@PutMapping("/update")
	public String updateNotice(@RequestBody NoticeUpdateDto noticeUpdateDto) {
		String id=noticeService.updateNotice(noticeUpdateDto);
		return id;
	}
	
	@GetMapping("/{noticeId}")
	public Notice getNotice(@PathVariable("noticeId")Integer noticeId) {
		return this.noticeService.getNotice(noticeId);
				
	}
	
	

}
