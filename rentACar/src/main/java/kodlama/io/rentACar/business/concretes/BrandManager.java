package kodlama.io.rentACar.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandServices;
import kodlama.io.rentACar.business.requests.Brands.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.Brands.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandsResponse;
import kodlama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.consretes.Brand;

@Service // bu sınıf bir business nesnesidir
public class BrandManager implements BrandServices {
	private BrandRepository brandRepository;
	private ModelMapperService modelMapperService;

	@Autowired
	public BrandManager(BrandRepository brandRepository) {

		this.brandRepository = brandRepository;
	}

	@Override
	public List<GetAllBrandsResponse> getAll() {
		// bir kişinin markaları listeleyebilmesi için iş kuralları
		List<Brand> brands = brandRepository.findAll(); // VERİ TABANINDAN BRANDLAR GELDİ

		List<GetAllBrandsResponse> brandsResponse = brands.stream()
				.map(brand -> this.modelMapperService.forResponse().map(brand, GetAllBrandsResponse.class))
				.collect(Collectors.toList());

		return brandsResponse;
	}

	@Override
	public void add(CreateBrandRequest createBrandRequest) {

//		Brand brand = new Brand();
//		brand.setName(createBrandRequest.getName());
//		

		Brand brand = this.modelMapperService.forRequest().map(createBrandRequest, Brand.class);
		this.brandRepository.save(brand);

	}

	@Override
	public void update(UpdateBrandRequest updateBrandRequest) {

		Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest, Brand.class);
		this.brandRepository.save(brand);
		
	}

	@Override
	public void delete(int id) {

		this.brandRepository.deleteById(id);
	}

	@Override
	public GetByIdBrandsResponse getById(int id) {
		Brand brand = this.brandRepository.findById(id).orElseThrow();

		GetByIdBrandsResponse response = this.modelMapperService.forResponse().map(brand, GetByIdBrandsResponse.class);
		return response;
	}

}
