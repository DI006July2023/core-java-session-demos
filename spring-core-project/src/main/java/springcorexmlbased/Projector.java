package springcorexmlbased;

public class Projector {
	private String model;
	private String color;
	
	public Projector(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Projector [model=" + model + ", color=" + color + "]";
	}

}
