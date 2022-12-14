package java_oop_encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank_account metrobank = new Bank_account();
		metrobank.setName("Dustin Hendearson");
		metrobank.setAccount_num("12345678900099");
		metrobank.setEmail("dhyahoo.com");
		metrobank.setPhone("09122345678");
		metrobank.setBalance(2000000);
		
		metrobank.accountDets();
		
		int balance = metrobank.getBalance();
		System.out.println("Initial Balance: " + balance);
		
		balance = metrobank.deposit(1000000, balance);
		System.out.println("Your current balance is: " + balance);
		
		balance = metrobank.wihdraw(1000000, balance);
		System.out.println("Your current balance is: " + balance);
		
		balance = metrobank.wihdraw(1000000, balance);
		System.out.println("Your current balance is: " + balance);
		
		balance = metrobank.wihdraw(500000, balance);
		System.out.println("Your current balance is: " + balance);
		
		balance = metrobank.deposit(1500000, balance);
		System.out.println("Your current balance is: " + balance);

		balance = metrobank.wihdraw(2000000, balance);
		System.out.println("Your current balance is: " + balance);
				
		balance = metrobank.deposit(1000000, balance);
		System.out.println("Your current balance is: " + balance);
		
		balance = metrobank.wihdraw(1500000, balance);
		System.out.println("Your current balance is: " + balance);
	}

}
