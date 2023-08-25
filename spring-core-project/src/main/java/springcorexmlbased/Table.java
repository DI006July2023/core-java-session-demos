package springcorexmlbased;

public class Table {
	private int length;
	private int width;
	private int height;
	private String color;
	
	public Table(int length, int width, int height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Table [length=" + length + ", width=" + width + ", height=" + height + ", color=" + color + "]";
	}
	
	
	
	
}
