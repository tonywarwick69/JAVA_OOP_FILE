package bai6;

public class Account {
	private long accountNumber ;
	private String name;
	private double balance;
	public Account(long accountNumber, String name) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
	}
	public Account(long accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	private final double RATE=0.035;
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getRATE() {
		return RATE;
	}
	public boolean deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
			return true;
		} else {
			return false;
		}
		
	}
	public boolean withdraw(double amount,double fee) {
		if(amount>0 && (amount+fee)<=balance) {
			balance=balance-(amount+fee);
			return true;
		} else {
			return false;
		}
		
	}
	public void addInterest() {
		 balance=balance+balance*RATE;
	}
	public boolean transfer(Account acc2,double amount) {
		if(amount>0 && balance>0 && amount<=balance) {
			acc2.balance=acc2.balance+amount;
			return true;
		} else {
			return false;
		}
	}
	
}
