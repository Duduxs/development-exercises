package Java.Introduction;

import java.util.Locale;
import java.util.Scanner;

public class ch003 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);
		
		Integer i  = keyboard.nextInt();
		Double d = keyboard.nextDouble();
		keyboard.nextLine();
		String s = keyboard.nextLine();
				
		keyboard.close();
		
		System.out.print("String: " + s);
		System.out.print("\nDouble: " + d);
		System.out.print("\nInt: " + i);
		
		;
		
	}
}
