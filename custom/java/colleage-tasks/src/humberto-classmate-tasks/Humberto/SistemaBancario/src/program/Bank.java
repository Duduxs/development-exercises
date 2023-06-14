package program;

import model.entities.Account;

public class Bank {

	public static void main(String[] args) {

		Account c1 = new Account(1111, "CC", "Eduardo");
		Account c2 = new Account(2222, "CP", "Humberto");
		
	
		System.out.println();
		System.out.println(c1);
		System.out.println(c2);
		
		c1.transfer(c2, 50.0);
		
		System.out.println();
		System.out.println(c1);
		System.out.println(c2);
		
		
		

	}

}