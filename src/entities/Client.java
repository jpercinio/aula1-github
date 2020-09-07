package entities;

public class Client {
	private int account_number;
	private String holder; //titular da conta
	private double balance; // saldo da conta
	
	public Client() {
	}

	public Client(int account_number, String holder, double initialDeposit) {
		this.account_number = account_number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public int getAccount_number() {
		return account_number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double value) {
		balance += value;
	}

	public void withDraw(double value) {
		balance -= value + 5; //taxa de saque 5.00
	}
	
	public String toString() {
		return "Acount " + account_number
		+ ", Holder: " + holder
		+ ", Balance: $" + String.format("%.2f", balance);
	}	
}