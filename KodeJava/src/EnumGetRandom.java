import java.util.*;
import java.lang.*;

public class EnumGetRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<3;i++) {
			System.out.printf("color[%d] = %s%n", i, BaseColor.getRandomColor());
		}

	}
	
	private enum BaseColor {
		Green, Red, Blue;
		
		public static BaseColor getRandomColor() {
			Random rand= new Random();
			return values()[rand.nextInt(values().length)];
		}
	}

	
}
