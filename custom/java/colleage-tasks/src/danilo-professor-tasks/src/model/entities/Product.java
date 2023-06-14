package model.entities;

public class Product {

	private Integer cod;
	private String name;
	private Float value;

	private Provider pr;

	public Product() {

	}

	public Product(Integer cod, String name, Float value, Provider pr) {
		this.cod = cod;
		this.name = name;
		this.value = value;
		this.pr = pr;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getValue() {
		return value;
	}

	public void setValue(Float value) {
		this.value = value;
	}

	public Provider getP() {
		return pr;
	}

	public void setP(Provider pr) {
		this.pr = pr;
	}

	public void setAll(Integer cod, String name, Float value, Provider pr) {
		this.cod = cod;
		this.name = name;
		this.value = value;
		this.pr = pr;
	}

	public void updatePrice(Float value) {
		value = 1 + value / 100;
		this.value *= value;

	}

	@Override
	public String toString() {
		return "Product [ cod = " + cod + ", name = " + name + ", value = " + String.format("%.3f", value) + ", p = " + pr + " ] ";
	}

}
