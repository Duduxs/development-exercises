package Java.dataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ch005 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();
		Integer lenghtList = keyboard.nextInt();
		
		for (int i = 0; i < lenghtList; i++) {
			list.add(keyboard.nextInt());
		}

		Integer numberOfQueries = keyboard.nextInt();
		String insertOrDelete;

		for (int i = 0; i < numberOfQueries; i++) {
			insertOrDelete = keyboard.next();
			
			if (insertOrDelete.equals("Insert")) 
				list.add(keyboard.nextInt(), keyboard.nextInt());
			 else 
				list.remove(keyboard.nextInt());
			
		}
		
		keyboard.close();
		
		for (Integer x : list) System.out.print(x+" ");
	}
}
