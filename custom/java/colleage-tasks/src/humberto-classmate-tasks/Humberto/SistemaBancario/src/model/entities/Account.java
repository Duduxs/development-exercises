package model.entities;

public class Account {

	private Integer accountNumber;
	private String type;
	private Double amount;
	private String name;

	public Account(Integer accountNumber, String type, String name) {
		this.accountNumber = accountNumber;
		this.type = type;
		this.name = name;
		openAccount();
	}

	public void openAccount() {
		amount = type.equals("CC") ? 50.0 : 150.0;
	}

	public String closeAccount() {
		if (amount != 0)
			return amount > 0 ? "Positive balance, impossible to close" : "Negative balance, impossible to close";
		return "Account closed!";
	}

	public void withdraw(Double value) {
		if ((value <= amount && !closeAccount().equals("Account closed!")))
			amount -= value;
		else
			System.out.println("\nYour account is closed OR you do not have enough amount, cannot withdraw anything.");
	}

	public void deposit(Double value) {
		if (!(closeAccount().equals("Account closed!")))
			amount += value;
		else
			System.out.println("\nYour account is closed, cannot deposit anything.");
	}

	public Double payMonthly() {
		if (type.equals("CC"))
			return amount += 12.0;
		else
			return amount += 20.0;
	}

	public void transfer(Account c, Double amount) {
		if (amount <= this.amount) {
			
			c.amount += amount;
			this.amount -= amount;
			
		} else
			throw new IllegalAccessError("Impossible to transfer, verify your amount");

	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", type=" + type + ", amount=" + amount + ", name=" + name
				+ "]";
	}

}