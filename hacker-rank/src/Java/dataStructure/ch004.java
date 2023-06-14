package Java.dataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class ch004 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Integer qntd = keyboard.nextInt();
		
		ArrayList<Integer>[] list = new ArrayList[qntd];
		
		int qtdLine = 0, values = 0, qtdQuery = 0, a = 0 , b = 0;
		
		for(int i = 0 ; i < qntd ; i++) {
				qtdLine = keyboard.nextInt();
				list[i] = new ArrayList();
			for(int j = 0 ; j < qtdLine ; j++) {
				values = keyboard.nextInt();
				list[i].add(values);
			}
			
		}

		qtdQuery = keyboard.nextInt();
		
		
		for(int i = 0 ; i < qtdQuery ; i++) {
			a = keyboard.nextInt();
			b = keyboard.nextInt();
			
			try {
			System.out.println(list[a-1].get(b-1));
			}
			catch(RuntimeException exception) {
				System.out.println("ERROR!");
			}

		}
		keyboard.close();
		
		
	}
}
