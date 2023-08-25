package springcorexmlbased;

public class Television {
	private String model;

	public Television(String model) {
		super();
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Television [model=" + model + "]";
	}
	
}
