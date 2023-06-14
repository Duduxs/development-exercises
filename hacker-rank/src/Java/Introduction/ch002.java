package Java.Introduction;

import java.util.Scanner;

public class ch002 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		Integer input = keyboard.nextInt();
		
		if(input % 2 != 0)
			System.out.println("Weird");
		else if(input % 2 == 0 && input > 2 && input < 5)
			System.out.println("Not Weird");
		else if(input % 2 == 0 && input > 6 && input <= 20)
			System.out.println("Weird");
		else if(input % 2 == 0 && input > 20)
			System.out.println("Not Weird");
		
		keyboard.close();
		
	}
}
