
public class InstanceOfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Body body = new Body();
		Hand hand = new Hand();
		Nail nail = new Nail();
		
		if (body instanceof Man) {
			System.out.println("Body is a Man");
		}
		
		if (hand instanceof Man) {
			System.out.print("hand is a man too");
		}
	}

}

interface Man {
	
}

class Body implements Man {
	
}

class Hand extends Body {
	
}

class Nail extends Hand {
	
}