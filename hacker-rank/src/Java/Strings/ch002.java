package Java.Strings;

import java.util.Scanner;

public class ch002 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String message = keyboard.next();
		Integer start = keyboard.nextInt();
		Integer end  = keyboard.nextInt();
		
		System.out.println(message.substring(start,end));

		keyboard.close();
	}
}
