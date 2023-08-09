package MyPack.FinalHospitalManagement.Repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import MyPack.FinalHospitalManagement.Model.Notice;

@EnableJpaRepositories
@Repository

public interface NoticeRepo extends JpaRepository<Notice, Integer> {
	Notice findById(int noticeId);
	

}
