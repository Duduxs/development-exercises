package Java.Introduction;

import java.util.Scanner;

public class ch005 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int n = keyboard.nextInt();
		keyboard.close();
		
		for(int i = 1 ; i < 11 ; i++)
			System.out.printf("%d x %d = %d%n",n,i,n*i);
		
		
	}
}
