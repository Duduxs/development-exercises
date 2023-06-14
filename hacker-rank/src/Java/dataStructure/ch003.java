package Java.dataStructure;

import java.util.Scanner;

public class ch003 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int qtd = keyboard.nextInt();
		int arr[] = new int[qtd];
		int count = 0, sum=0;
		
		for(int i = 0 ; i < qtd ; i++) {
			arr[i] = keyboard.nextInt();
		}
		
		for(int i = 0 ; i < qtd ; i++) {		
			for(int j = i ; j < qtd ; j++) {
				sum += arr[j];
				if(sum < 0)
					count++;
			}
			sum = 0;
		}
		System.out.println(count);
		
		
		
		
		keyboard.close();
	}
}
