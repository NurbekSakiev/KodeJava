
public class Car {
	private String type;
	private String brand;
	private String model;
	private int numberOfSeats;
	public String getType() {
		return type;
	}
	
	public Car() {
		
	}
	
	public Car(String type, String brand, String model) {
		this.type = type;
		this.brand = brand;
		this.model = model;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
	public String getCarInfo() {
		return "Type: "+ type+"; Brand: "+brand+ "; Model: "+model;
	}
	
}
