
public class Brand implements Comparable<Brand>{
	private int id;
	private String name;
	
	// constructor
	public Brand(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	// getter setter
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


	@Override
	public int compareTo(Brand o) {
		return this.getName().compareTo(o.getName());
	}


	@Override
	public int hashCode() {
		return this.id + this.name.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		Brand brand = (Brand)obj;
		return brand.getId() == this.getId();
	}


	@Override
	public String toString() {
		return name;
	}
}