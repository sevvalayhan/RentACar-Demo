package kodlama.io.rentACar.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.consretes.Brand;

public interface BrandRepository extends JpaRepository<Brand,Integer>{
	List<Brand> getAll(); //getAll'ı çağıran birisi markaları listeler
	

}
