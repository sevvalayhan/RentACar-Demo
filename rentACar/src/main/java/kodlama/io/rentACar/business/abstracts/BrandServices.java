package kodlama.io.rentACar.business.abstracts;
import java.util.List;

import kodlama.io.rentACar.business.requests.Brands.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.Brands.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandsResponse;
public interface BrandServices {
	List<GetAllBrandsResponse> getAll();//markaları listelediğimiz 
	void add(CreateBrandRequest createBrandRequest);
	void update(UpdateBrandRequest updateBrandRequest);
	void delete(int id);	
	GetByIdBrandsResponse getById(int id);


}
