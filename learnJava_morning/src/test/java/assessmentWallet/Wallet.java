package assessmentWallet;

public class Wallet {
	// variables for Wallet dollars in hundred, tens, ones
	private int hundred, tens, ones;
	
	// constructor Wallet
	public Wallet(int hundred, int tens, int ones) {
		this.hundred = hundred;
		this.tens = tens;
		this.ones = ones;
	}
	
	// get balance in Wallet
	public int getBalance() {
		int total = 0;
		total += this.ones * 1;
		total += this.tens * 10;
		total += this.hundred * 100;
		return total;
	}
	
	// add money in Wallet
	public int addWallet(int currentTotal, int payCheck) {
		int newTotal = 0;
		newTotal = currentTotal + payCheck;
		return newTotal;
	}
	
	// withdraw money from Wallet
	public int withdrawWallet(int currentTotal, int useMoney) {
		int newTotal = 0;
		newTotal = currentTotal - useMoney;
		return newTotal;
	}
	
}
