package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.requests.Frameworks.CreateFrameworkRequest;
import kodlama.io.rentACar.business.requests.Frameworks.DeleteFrameworkRequest;
import kodlama.io.rentACar.business.requests.Frameworks.UpdateFrameworkRequest;
import kodlama.io.rentACar.business.responses.GetAllFrameworkResponse;

public interface FrameworkServices {
	List<GetAllFrameworkResponse> getAll();

	void add(CreateFrameworkRequest createFrameworkRequest);

	void update(UpdateFrameworkRequest updateFrameworkRequest);

	void delete(DeleteFrameworkRequest deleteFrameworkRequest);

}
