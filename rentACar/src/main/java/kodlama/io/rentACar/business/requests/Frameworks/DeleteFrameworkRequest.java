package kodlama.io.rentACar.business.requests.Frameworks;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 

@Getter
@Setter
public class DeleteFrameworkRequest {
	private int id;



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DeleteFrameworkRequest(int id) {
		super();
		this.id = id;
	}
	
	

}
