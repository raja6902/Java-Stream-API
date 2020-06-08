package streamcollect;

public class BankAccount {

	private int accountNumber;
	private String accountType;
	private double accountBalance;

	public BankAccount(int accountNumber, String accountType, double accountBalance) {
		
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public double increasebalance(double amt) {
		return accountBalance += amt;
	}

}
