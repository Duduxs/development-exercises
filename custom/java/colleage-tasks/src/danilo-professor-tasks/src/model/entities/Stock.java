package model.entities;

import java.util.LinkedHashSet;
import java.util.Set;

import mode.util.Methods;
import mode.util.ProductException;

public class Stock implements Methods {

	private Set<Product> product = new LinkedHashSet<>();
	private final Boolean CRITERIA = product.size() > 0;

	@Override
	public void insertProduct(Product p) {
		if (product.size() <= 100)
			product.add(p);
		else
			throw new ProductException("Your product stock is full or this product code alredy contains in stock.");
	}

	@Override
	public void removeProduct(Product p) {
		if (!CRITERIA)
			product.remove(p);
		else
			throw new ProductException("You do not have any product in stock for remove.");
	}

	@Override
	public void updateProduct(Product p, Integer cod, String name, Float value, Provider pr) {
		if (!CRITERIA)
			p.setAll(cod, name, value, pr);
		else
			throw new ProductException("You do not have any product in stock for update.");
	}

	@Override
	public void updatePriceProduct(Product p, Float value) {
		if (!CRITERIA)
			p.setValue(value);
		else
			throw new ProductException("You do not have any product in stock for update price.");
	}

	@Override
	public void show() {

		for (Product x : product) {
			System.out.println(x);
		}
		System.out.println();

	}
}
