package javaOop;

public class Main {

	public static void main(String[] args) {
		// IoC Container
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.giveCredit();

		/*
		 * CreditManager creditManager = new CreditManager(); creditManager.Hesapla();
		 * creditManager.Hesapla(); creditManager.Save();
		 * 
		 * Customer customer = new Customer(); // instance creation customer.id = 1;
		 * customer.city = "Ankara";
		 * 
		 * CustomerManager customerManager = new CustomerManager(customer);
		 * customerManager.Save(); customerManager.Delete();
		 * 
		 * Company company = new Company(); company.companyName = "kodlama.io";
		 * company.taxtNumber = "02355";
		 * 
		 * Person person = new Person(); person.firstName = "Furkan"; person.lastName =
		 * "Cömert"; person.nationalIdentity = "";
		 */

	}

}
