package mode.util;

import model.entities.Product;
import model.entities.Provider;

public interface Methods {

	void insertProduct(Product p);
	void removeProduct(Product p);
	void updateProduct(Product p, Integer cod, String name, Float value, Provider pr);
	void updatePriceProduct(Product p, Float value);
	void show();
	
}
