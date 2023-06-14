package Java.Introduction;

import java.util.Scanner;

public class ch006 {

	public static void main(String[] oi) {
		Scanner keyboard = new Scanner(System.in);
		
		int rep = keyboard.nextInt();
		
		int value = 0;
	
		for(int i = 0 ; i < rep; i++) {
			
			int a = keyboard.nextInt();
			int b = keyboard.nextInt();
			int n = keyboard.nextInt();
			value = a;
			for(int j = 0 ; j < n ; j++) {
				value+=b*(int) Math.pow(2, j);
				System.out.print(value+" ");
			}
			System.out.println();
			
		}

		keyboard.close();
	}
}
