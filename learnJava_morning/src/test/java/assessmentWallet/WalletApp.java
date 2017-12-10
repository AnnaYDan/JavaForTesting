package assessmentWallet;

import java.util.Scanner;

public class WalletApp {

	public static void main(String[] args) {
		// taking info about wallet from console
		Scanner sc = new Scanner(System.in);

		System.out.println("With whose wallet would you like to work?\nPlease enter 1 for family wallet, 2 for husband wallet, 3 for wife wallet");
		int whoseWallet = sc.nextInt();

		if (whoseWallet == 1) {

			System.out.println("======================\nHow much money in family wallet?");
			int wholeFamilyWalletNumber = sc.nextInt();

			// count and print how many notes in family wallet
			int hundredFamily =  wholeFamilyWalletNumber / 100;
			System.out.println("Family have " + hundredFamily + " hundred notes.");
			int tensFamily =  wholeFamilyWalletNumber % 100 / 10;
			System.out.println("Family have " + tensFamily + " tens notes.");
			int onesFamily =  wholeFamilyWalletNumber % 100 % 10 / 1;
			System.out.println("Family have " + onesFamily + " tens notes.");

			// initializing new object for family wallet
			Wallet familyWallet = new Wallet(hundredFamily, tensFamily, onesFamily);
			// print balance in family wallet using getBalance from Wallet class
			System.out.println("Your family wallet balance is $" + familyWallet.getBalance());

			// adding paycheck in family wallet
			// taking paycheck sum from console
			System.out.println("Enter your family paycheck amount");
			int FamilyPaycheckNumber = sc.nextInt();
			int familyWalletWithPaycheck = familyWallet.addWallet(familyWallet.getBalance(), FamilyPaycheckNumber);
			// print balance in family wallet using addWallet from Wallet class		
			System.out.println("After paycheck your new family wallet balance is $" + familyWalletWithPaycheck);

			// withdrawing amount from family wallet without paycheck
			// taking withdraw amount from console
			System.out.println("Enter your family withdraw amount from family wallet without paycheck");
			int FamilyWithdrawNumber = sc.nextInt();
			// print balance in family wallet using addWallet from Wallet class		
			System.out.println("After withdraw your new family wallet balance is $" + familyWallet.withdrawWallet(familyWallet.getBalance(), FamilyWithdrawNumber));

			// withdrawing amount from family wallet without paycheck
			// taking withdraw amount from console
			System.out.println("Enter your family withdraw amount from family wallet with paycheck");
			int FamilyWithdrawNumber2 = sc.nextInt();
			// print balance in family wallet using addWallet from Wallet class		
			System.out.println("After withdraw your new family wallet balance is $" + familyWallet.withdrawWallet(familyWalletWithPaycheck, FamilyWithdrawNumber2));
			
		}else if (whoseWallet == 2){

			// taking husband wallet from console
			System.out.println("======================\nHow much money in husband wallet?");
			int wholeHusbadWalletNumber = sc.nextInt();

			// count and print how many notes in family wallet
			int hundredHusband =  wholeHusbadWalletNumber / 100;
			System.out.println("Husband has " + hundredHusband + " hundred notes.");
			int tensHusband =  wholeHusbadWalletNumber % 100 / 10;
			System.out.println("Husband has " + tensHusband + " tens notes.");
			int onesHusband =  wholeHusbadWalletNumber % 100 % 10 / 1;
			System.out.println("Husband has " + onesHusband + " tens notes.");

			// creating new object for husband wallet
			Wallet husbandWallet = new Wallet(hundredHusband, tensHusband, onesHusband);

			// get balance in husband wallet
			System.out.println(husbandWallet.getBalance());

		}else if (whoseWallet == 3){

			// taking wife wallet from console
			System.out.println("======================\nHow much money in wife wallet?");
			int wholeWifeWalletNumber = sc.nextInt();

			// count and print how many notes in family wallet
			int hundredWife =  wholeWifeWalletNumber / 100;
			System.out.println("Wife has " + hundredWife + " hundred notes.");
			int tensWife =  wholeWifeWalletNumber % 100 / 10;
			System.out.println("Wife has " + tensWife + " tens notes.");
			int onesWife =  wholeWifeWalletNumber % 100 % 10 / 1;
			System.out.println("Wife has " + onesWife + " tens notes.");

			// creating new object for wife wallet
			Wallet wifeWallet = new Wallet(hundredWife, tensWife, onesWife);
			// get balance in wife wallet
			System.out.println(wifeWallet.getBalance());

		}else {
			System.out.println("You enter invalid wallet number. Please run program again.");
		}

		if(sc != null) {
			sc.close();
		}

	}

}

