
public class MobilePhone extends Product{
	
	private int camera;
	private double chargeCapacity;
	private String color;
	
	
	public MobilePhone(int id, String name, double price, Brand brand, int memory, double screenSize, int ram, int camera, double chargeCapacity, String color) {
		super(id, name, price, brand, memory, screenSize, ram);
		this.camera = camera;
		this.chargeCapacity = chargeCapacity;
		this.color = color;
	}
	
	public int getCamera() {
		return camera;
	}
	public void setCamera(int camera) {
		this.camera = camera;
	}
	public double getChargeCapacity() {
		return chargeCapacity;
	}
	public void setChargeCapacity(double chargeCapacity) {
		this.chargeCapacity = chargeCapacity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}