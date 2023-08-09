package MyPack.FinalHospitalManagement.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import MyPack.FinalHospitalManagement.Model.Doctor;

@EnableJpaRepositories
@Repository
public interface DoctorRepo extends JpaRepository<Doctor, Long> {
	Optional<Doctor>findOneByUsernameAndPassword(String username, String password);
	Doctor findByUsername(String username);
	
	

}
