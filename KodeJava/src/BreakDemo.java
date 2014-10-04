
public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {3,4,5,6,213,42,35,63,3};
		int length = numbers.length;
		boolean found = false;
	
	here: //will terminate from here (the while loop) after using "break here"
		while(true) {
			for (int i = 0; i<10; i++) {
				System.out.println("i is equal to "+i);
				if (i==5) {
					break here;
				}
			}
		}

	}

}
