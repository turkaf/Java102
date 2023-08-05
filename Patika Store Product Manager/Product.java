import java.util.Objects;

public class Product implements Comparable<Product>{
	private int id;
	private String name;
	private double price;
	private Brand brand;
	private int memory;
	private double screenSize;
	private int ram;
	
	
	// constructor
	public Product(int id, String name, double price, Brand brand, int memory, double screenSize, int ram) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.memory = memory;
		this.screenSize = screenSize;
		this.ram = ram;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}


	@Override
	public int compareTo(Product o) {
		return Integer.compare(this.id, o.id);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }


	/*@Override
	public boolean equals(Object obj) {
		Product newProduct = (Product)obj;
		return newProduct.getId() == this.getId();
	}*/
}