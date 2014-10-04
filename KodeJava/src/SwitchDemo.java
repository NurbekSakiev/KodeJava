import java.lang.*;
import java.util.*;
import java.io.*;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The Planets");
		System.out.println("===================");
		System.out.println("1. Mercury");
		System.out.println("2. Venus");
		System.out.println("3. Earth");
		System.out.println("4. Mars");
		
		System.out.println("Please choose your destination: ");
		
		int destination = 0;
		try {
			destination = Integer.valueOf(System.console().readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		System.out.println("Welcome to ");
		switch (destination){
			case 1:
				System.out.println("Mercury");break;
			case 2: 
				System.out.println("Venus"); break;
			case 3: 
				System.out.println("The Earth");break;
			case 4:
				System.out.println("Mars"); break;
			default: 
				System.out.println("Invalid Destination");
			
		}
	}

}
