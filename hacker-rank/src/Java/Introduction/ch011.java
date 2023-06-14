package Java.Introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ch011 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);
		Double payment = scanner.nextDouble();
		scanner.close();

		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("US: " + nf.format(payment));
		
		nf = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
		System.out.println("India: " + nf.format(payment));
		
		nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println("China: " + nf.format(payment));

		nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println("France: " + nf.format(payment));
	}
}
