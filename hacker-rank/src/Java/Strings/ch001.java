package Java.Strings;

import java.util.Scanner;

public class ch001 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String a = keyboard.next();
		String b = keyboard.next();
		
		a = a.replace(a.charAt(0), Character.toUpperCase(a.charAt(0)));		
		b = b.replace(b.charAt(0), Character.toUpperCase(b.charAt(0)));		

		System.out.println(a.length() + b.length());
		System.out.println(a.compareTo(b) > 0 ? "Yes" : "No");
		System.out.println(a +" "+ b);
		
		keyboard.close();
	}
}
