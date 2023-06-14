package Java.Introduction;

import java.util.Scanner;

public class ch001 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		Integer a = keyboard.nextInt();
		Integer b = keyboard.nextInt();
		Integer c = keyboard.nextInt();
		
		System.out.println(a+"\n"+b+"\n"+c);
		
		keyboard.close();
	}
}
