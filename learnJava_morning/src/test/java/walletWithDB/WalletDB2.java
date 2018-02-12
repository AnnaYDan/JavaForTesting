package walletWithDB;

public class WalletDB2 {
	
	// variables for Wallet dollars in hundred, tens, ones
	private int hundred, tens, ones;
	int wallentNumber;
	
	// constructor Wallet
	public WalletDB2(int walletNumber) {
		this.wallentNumber = walletNumber;
		// open connection to transaction table of wallet database
		// collect all hundred, tens, and ones, transaction of the given Wallet Number
		// pass to your hundreds
	}
	
	// get balance in Wallet
	public int getBalance() {
		int total = this.ones * 1 + this.tens * 10 +  this.hundred * 100;
		return total;
	}
	
	// add money in Wallet
	public void  addWallet(String typeOfNote , int amount) {
		// write a code to add in to transaction table
	}
	
	// withdraw money from Wallet
	public void withdrawWallet(String typeOfNote, int amount) {
		// check total in the wallet 
		// add a -ve record in the transaction table
	}
	
	// transfer money between wallets
	//public int transferWallet(int fromWallet, int toWallet, int totalAmount) {
	//	;
	//}


}
