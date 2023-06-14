package Java.Strings;

import java.util.Scanner;

public class ch006 {

	private static String remove(String s) {
		 int i;
	        for (i = 0; i < s.length(); i++) {
	            if (Character.isLetter(s.charAt(i))) 
	                break;
	        }
	        return s.substring(i);
	}
	
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		String s = keyboard.nextLine();
		s = remove(s);
		
		
		String split[] = s.split("[^a-zA-Z]+");
		
		System.out.println(split.length);
		for(String x : split) 
			System.out.println(x);
		
	
		keyboard.close();
	}
}
