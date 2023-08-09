package MyPack.FinalHospitalManagement.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import MyPack.FinalHospitalManagement.Dto.PatientDto;
import MyPack.FinalHospitalManagement.Model.Patient;

@EnableJpaRepositories
@Repository
public interface PatientRepo extends JpaRepository<Patient, Integer>{
	Optional<Patient>findOneByUsernameAndPassword(String username, String password);
	Patient findByUsername(String username);

}
