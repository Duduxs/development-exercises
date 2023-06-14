package Java.Introduction;

import java.util.Scanner;

public class ch007 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int rep = keyboard.nextInt();

		Long a = 0L;
		
		for(int i = 0 ; i < rep ; i++) {
			
			try {
			 a = keyboard.nextLong();
			String format = "%d can be fitted in:%n";
			
			if(a >= Short.MIN_VALUE && a <= Short.MAX_VALUE) 
				format+=" * short%n";
			if(a >= Integer.MIN_VALUE && a <= Integer.MAX_VALUE)
					format+=" * int%n";
			if(a >= Long.MIN_VALUE && a <= Long.MAX_VALUE)
						format+=" * long%n";
			
			System.out.printf(format,a);
			}
			catch(Exception e) {
				System.out.println(keyboard.next()+" can't be fitted anywhere.");
			}
			
			
	
			
		}
		
		
		
		
		
		keyboard.close();
	}
}
