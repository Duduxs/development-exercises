package Java.dataStructure;

import java.util.Scanner;

public class ch001 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		Integer arr[] = new Integer[keyboard.nextInt()];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = keyboard.nextInt();
			System.out.println(arr[i]);
		}
	
		keyboard.close();
	}
}
