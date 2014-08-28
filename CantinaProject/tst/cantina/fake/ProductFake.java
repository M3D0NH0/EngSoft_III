package cantina.fake;

/**
 * @author Gelatti , M3D0NH0
 */

public class ProductFake {
	private String name;
	private String type;

	public ProductFake() {	}

	public ProductFake(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
