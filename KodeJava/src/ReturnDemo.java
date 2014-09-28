
public class ReturnDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int z = ReturnDemo.calculate(2,3);
		System.out.print("z= "+z);
		
		Dog dog = new Dog("Spaniel","Doggie");
		System.out.println(dog.getDog());
	}
	
	public static int calculate(int x, int y) {
		return x+y;
	}

}

class Dog {
	private String breed;
	private String name;
	
	Dog(String breed, String name) {
		this.breed = breed;
		this.name = name;
	}
	
	public Dog getDog() {
		return this;
	}
	
	public String toString(){
		return " breed: "+breed.concat(" name: "+name);
	}
}