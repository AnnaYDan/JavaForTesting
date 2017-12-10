package walletWithDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class WalletWithDB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// register the driver
		Class.forName("com.mysql.jdbc.Driver");
		//connect to database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/walletdb", "root", "");
		//create statement object to run query

		// taking info about wallet from console
		Scanner sc = new Scanner(System.in);

		// User choose whose wallet 
		System.out.println("With whose wallet would you like to work?\nPlease enter 1 for family wallet, 2 for husband wallet, 3 for wife wallet");
		int whoseWallet = sc.nextInt();
		if (whoseWallet == 1) {
			// Actions with Family Wallet
			System.out.println("You work with family wallet.\nPlease enter 1 for get balance, 2 for add amount, 3 for withdraw amount, 4 for transfer amount");
			int whatAction = sc.nextInt();
			
			if (whatAction == 1) {
				// Get Balance for Family Wallet
				System.out.println("You would like to get balance for family wallet.");
				Statement stmt = con.createStatement();
				String query = "SELECT AmountFamilyWallet FROM familywallet where whoseWalletid = 1";
				ResultSet rs = 	stmt.executeQuery(query);
				while (rs.next()) {
					System.out.println("Family Wallet balance equals $" + rs.getInt(1));
				}
			
			}else if (whatAction == 2) {
				// Add amount for Family Wallet
				System.out.println("You would like to add amount for family wallet.\nPlease enter an amount which you would like to add.");
				// Should I add checking for negative amount which looks like withdraw action or leave as is
				int amountToAdd = sc.nextInt(); 
				Statement stmt = con.createStatement();
				String query = "SELECT AmountFamilyWallet FROM familywallet WHERE whoseWalletid = 1";
				ResultSet rs = 	stmt.executeQuery(query);
				while (rs.next()) {
					int newWalletBalance = rs.getInt(1) + amountToAdd;
					String queryAdd = "UPDATE familywallet SET AmountFamilyWallet = ? WHERE whoseWalletid = 1";
					PreparedStatement preparedStmt = con.prepareStatement(queryAdd);
					preparedStmt.setInt (1, newWalletBalance);
					preparedStmt.executeUpdate();
					// I printed balance info from variables not from DB. That's not good.
					System.out.println("You deposit $" + amountToAdd + ". Updated Family Wallet balance equals $" + newWalletBalance);
				}
				
				
			}else if (whatAction == 3) {
				// Withdraw amount for Family Wallet
				System.out.println("You would like to withdraw amount for family wallet.\nPlease enter an amount which you would like to withdraw.");
				// Should I add checking for negative amount which looks like withdraw action or leave as is
				int amountToWithdraw = sc.nextInt(); 
				Statement stmt = con.createStatement();
				String query = "SELECT AmountFamilyWallet FROM familywallet WHERE whoseWalletid = 1";
				ResultSet rs = 	stmt.executeQuery(query);
				while (rs.next()) {
					// Should I add checking does Family Wallet has enough balance?
					int newWalletBalance = rs.getInt(1) - amountToWithdraw;
					String queryAdd = "UPDATE familywallet SET AmountFamilyWallet = ? WHERE whoseWalletid = 1";
					PreparedStatement preparedStmt = con.prepareStatement(queryAdd);
					preparedStmt.setInt (1, newWalletBalance);
					preparedStmt.executeUpdate();
					// I printed balance info from variables not from DB. That's not good.
					System.out.println("You withdraw $" + amountToWithdraw + ". Updated Family Wallet balance equals $" + newWalletBalance);
				}

			}else if (whatAction == 4) {
				// Transfer amount from Family Wallet
				System.out.println("You would like to transfer amount for family wallet.\nPlease enter an amount which you would like to transfer.");
				// Should I add checking for negative amount which looks like withdraw action or leave as is
				int amountToTransfer = sc.nextInt(); 
				System.out.println("Please enter to whose wallet you would like to transfer.\nHusband Wallet press 1. Wife wallet press 2.");
				int toWhoseWalletTransfer = sc.nextInt();
				String queryGetBalanceInWhoseWallet = "SELECT AmountFamilyWallet FROM familywallet WHERE whoseWalletid = ?";
				PreparedStatement preparedStmt = con.prepareStatement(queryGetBalanceInWhoseWallet);
				preparedStmt.setInt (1, toWhoseWalletTransfer);
				ResultSet rsToWhoseWallet = preparedStmt.executeQuery();
				while (rsToWhoseWallet.next()) {
					int amountInWhoseWallet = rsToWhoseWallet.getInt(1);
					int newWhoseWalletBalance = amountInWhoseWallet + amountToTransfer;
					// Code to add amount in somebody's wallet
					String queryTrnsfTo = "UPDATE familywallet SET AmountFamilyWallet = ? WHERE whoseWalletid = ?";
					PreparedStatement preparedStmtTrnsfTo = con.prepareStatement(queryTrnsfTo);
					preparedStmtTrnsfTo.setInt (1, newWhoseWalletBalance);
					preparedStmtTrnsfTo.setInt (2, toWhoseWalletTransfer);
					preparedStmtTrnsfTo.executeUpdate();
					// I printed balance info from variables not from DB. That's not good.
					System.out.println("You transfer from Family Wallet $" + amountToTransfer + ". Somebody's updated Wallet balance equals $" + newWhoseWalletBalance);
					// Code to update amount in Family Wallet
					Statement stmt = con.createStatement();
					String query = "SELECT AmountFamilyWallet FROM familywallet WHERE whoseWalletid = 1";
					ResultSet rs = 	stmt.executeQuery(query);
					while (rs.next()) {
						// Should I add checking does Family Wallet has enough balance?
						int newWalletBalance = rs.getInt(1) - amountToTransfer;
						String queryTrnsf = "UPDATE familywallet SET AmountFamilyWallet = ? WHERE whoseWalletid = 1";
						PreparedStatement preparedStmtTrnsf = con.prepareStatement(queryTrnsf);
						preparedStmtTrnsf.setInt (1, newWalletBalance);
						preparedStmtTrnsf.executeUpdate();
						// I printed balance info from variables not from DB. That's not good.
						System.out.println("You transfer $" + amountToTransfer + ". Updated Family Wallet balance equals $" + newWalletBalance);
					}

				}
				
			}else {
				System.out.println("Invalid action identification code. Please try again.");
			}
	
			
			
			
		// NB!!! I need to understand how I can pass with whose wallet I work, because it is not good to have similar pieces of code.
		// ????!!!! USE CONSTRUCTORs ????!!!!
		}else if(whoseWallet == 2) {
			System.out.println("You work with husband wallet.\nPlease enter 1 for add amount, 2 for withdraw amount, 3 for transfer amount");
		}else if(whoseWallet == 3) {
			System.out.println("You work with wife wallet.\nPlease enter 1 for add amount, 2 for withdraw amount, 3 for transfer amount");
		}else {
			System.out.println("Invalid wallet identification code. Please try again.");
		}

		if (sc != null) {
			sc.close();
		}
		
	}

}
