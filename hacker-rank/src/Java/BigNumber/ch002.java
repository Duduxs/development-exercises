package Java.BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class ch002 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		BigInteger value = keyboard.nextBigInteger();
		keyboard.close();

		System.out.println(value.isProbablePrime(1)? "prime" : "not prime");
	
	}
}
