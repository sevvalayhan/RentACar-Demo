package kodlama.io.rentACar.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.consretes.Framework;

public interface FrameworkRepository extends JpaRepository<Framework,Integer>{
	List<Framework> getAll();

}
