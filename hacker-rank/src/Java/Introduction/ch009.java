package Java.Introduction;

import java.util.Scanner;

public class ch009 {
	
	static Integer B, H;
	static Boolean flag = false;

	static {
		Scanner keyboard = new Scanner(System.in);
		B=keyboard.nextInt();
		H= keyboard.nextInt();
		
		if(B <= 0 || H <= 0) 
		System.out.println("java.lang.Exception: Breadth and height must be positive");
		
		else
			flag=true;
		keyboard.close();
	}


	
	

	public static void main(String[] args) throws Exception {
		
		if(flag) {
			int area=B*H;
			System.out.print(area);
		}
		
		
	
	}
}
