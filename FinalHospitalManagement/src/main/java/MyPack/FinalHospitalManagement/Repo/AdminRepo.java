package MyPack.FinalHospitalManagement.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import MyPack.FinalHospitalManagement.Model.Admin;



@EnableJpaRepositories
@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer>{
	 Optional<Admin> findOneByUsernameAndPassword(String username, String password);
	    Admin findByUsername(String username);


}
