package ocp.capitulo3_collections_generic.Comparable;

public class CarWithoutComparable{
	String name;
	String type;
	String color;

	@Override
	public String toString() {
		return "Car [name=" + name + ", type=" + type + ", color=" + color + "]";
	}

	public CarWithoutComparable(String name, String type, String color) {
		super();
		this.name = name;
		this.type = type;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
