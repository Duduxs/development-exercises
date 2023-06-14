package Java.Introduction;

import java.util.Scanner;

public class ch008 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String str;
		Integer i = 0;
		while(keyboard.hasNext()) {
			i++;
			str = keyboard.nextLine();
			
			System.out.println(i +" "+ str);
		}
		keyboard.close();
		
	}
}
