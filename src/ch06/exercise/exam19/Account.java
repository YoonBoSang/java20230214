package ch06.exercise.exam19;

public class Account {
	private int balance;
	static final int MAX_BALANCE = 1000000; 
	static final int MIN_BALANCE = 0; 

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance > MAX_BALANCE) {
		this.balance = this.balance;
		} else if(balance > 0) {
		this.balance = balance;
		} else if (balance < MIN_BALANCE){
		this.balance = this.balance;
		}
	}
	
}
