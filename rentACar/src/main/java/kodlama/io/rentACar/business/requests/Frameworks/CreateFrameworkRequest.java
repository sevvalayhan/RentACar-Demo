package kodlama.io.rentACar.business.requests.Frameworks;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data

@Getter
@Setter
public class CreateFrameworkRequest {
	public String name;

	public CreateFrameworkRequest() {

	}

	public CreateFrameworkRequest(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
