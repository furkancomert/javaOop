package javaOop;

public class CustomerManager {
	private Customer customer;
	private ICreditManager creditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) {
		this.customer = customer;
		this.creditManager = creditManager;
	}

	public void Save() {
		System.out.println("Müşteri kaydedildi : ");
	}

	public void Delete() {
		System.out.println("Müşteri silindi : ");
	}

	public void giveCredit() {
		creditManager.calculate();
		System.out.println("Kredi verildi");
	}
}
