package application;

import mode.util.ProductException;
import model.entities.Product;
import model.entities.Provider;
import model.entities.Stock;

public class Program {

	/**
	 * @author Eduardo José
	 * @see github -> Duduxs
	 */

	public static void main(String[] args) {

		try {
		Provider pr1 = new Provider("1234321", "2345-6789", "duduxss3@gmail.com", "Eduardo");
		Provider pr2 = new Provider("4671349", "4002-8922", "Maria123@bol.com", "Maria");

		Product p1 = new Product(1, "TV", 3.500f, pr1);
		Product p2 = new Product(2, "Computer", 1.400f, pr2);
		Product p3 = new Product(3, "Notebook", 900f, pr2);

		Stock st1 = new Stock();

		// Updating the product price without Stock methods.

		System.out.println(p1);
		p1.updatePrice(10f);
		System.out.println(p1 + "\n");

		// Updating the product price with Stock methods.

		// Insert, updatePrice and show!

		st1.insertProduct(p1);
		st1.insertProduct(p2);
		st1.insertProduct(p3);

		st1.updatePriceProduct(p1, 2.400f);
		st1.show();

		// Update product

		st1.updateProduct(p1, 4, "Cellphone", 2490f, pr1);
		st1.show();

		// Remove products

		st1.removeProduct(p1);
		st1.show();
		
		}
		catch(ProductException e) {
			System.out.println(e.getMessage());
		}

	}
}
