package Lesson_6;

public class Bank_account {

	private String name;
	private String account_num;
	private String email;
	private String phone;
	private int balance;
	
	//setters and getters for private fields
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setAccount_num(String account_num) {
		this.account_num = account_num;
	}
	public String getAccount_num() {
		return this.account_num;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return this.phone;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getBalance() {
		return this.balance;
	}
	////
	
	public void accountDets() {
		System.out.println("NAME: " + this.name);
		System.out.println("ACCOUNT #: " + this.account_num);
		System.out.println("EMAIL: " + this.email);
		System.out.println("PHONE: " + this.phone);
	}
	
	public int deposit(int cash_dep, int prev_bal) {
		System.out.println("DEP:" + cash_dep);
		int newBalance = prev_bal + cash_dep;
		return newBalance;
	}
	
	public int wihdraw(int cash_wtd, int prev_bal) {
		System.out.println("WT:" + cash_wtd);
		int newBalance = prev_bal - cash_wtd;
		if(newBalance < 0) {
			System.out.println("Insufficient balance for this transaction!");
			return prev_bal;
		}
		return newBalance;
	}
}
