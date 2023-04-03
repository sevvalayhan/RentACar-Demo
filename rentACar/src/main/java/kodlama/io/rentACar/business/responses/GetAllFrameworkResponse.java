package kodlama.io.rentACar.business.responses;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data

@Getter
@Setter
public class GetAllFrameworkResponse {
	public int id;
	private String name;

	public GetAllFrameworkResponse(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public GetAllFrameworkResponse() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
