package Java.BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class ch003 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		BigInteger a = keyboard.nextBigInteger();
		BigInteger b = keyboard.nextBigInteger();
		
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
		
		keyboard.close();
	}
}
