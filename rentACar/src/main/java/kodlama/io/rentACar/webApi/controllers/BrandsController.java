package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandServices;
import kodlama.io.rentACar.business.requests.Brands.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.Brands.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandsResponse;

@RestController//annotation
@RequestMapping("/api/brands")

public class BrandsController {
		private BrandServices brandServices;

	
		public BrandsController(BrandServices brandServices) {
			
			this.brandServices = brandServices;
		}
		
		@GetMapping()
		public List<GetAllBrandsResponse> getAll(){
			return brandServices.getAll();
		}
		
		@GetMapping("/{id}")
		public GetByIdBrandsResponse getById(@PathVariable int id){
			return brandServices.getById(id);
		}
		
		
		
		@PostMapping()
		@ResponseStatus(code=HttpStatus.CREATED)
		public void add(@RequestBody() CreateBrandRequest createBrandsRequest) {
			this.brandServices.add(createBrandsRequest);
		}
			
		
		@PutMapping //güncelleme için kullanılır
		public void update(@RequestBody UpdateBrandRequest updateBrandRequest) {
			this.brandServices.update(updateBrandRequest);
		}
		
		@DeleteMapping ("/{id}")
		public void delete(@PathVariable int id) {
			this.brandServices.delete(id);
		}
		
		
		
		
		
		
		
}
