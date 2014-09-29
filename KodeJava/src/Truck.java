
public class Truck extends Car{
	private int loadCapacity;

	public Truck(String type, String brand, String model) {
		super(type, brand, model);
	}
	public int getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}
	
	@Override
	public String getCarInfo() {
		return "Type: "+ getType()+"; Brand: "+getBrand()+ "; Model: "
				+getModel()+ "; LoadCapacity: "+getLoadCapacity(); 
	}
	
	
}
