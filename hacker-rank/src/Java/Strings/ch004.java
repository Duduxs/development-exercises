package Java.Strings;

import java.util.Scanner;

public class ch004 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		String a = keyboard.next().toLowerCase();
		String invert = "";

		for (int i = a.length() - 1; i >= 0; i--)
			
			invert += a.charAt(i);
		
		if (invert.equals(a))
			System.out.println("Yes");
		else
			System.out.println("No");

		keyboard.close();
	}
}
