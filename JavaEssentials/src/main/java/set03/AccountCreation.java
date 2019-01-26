package set03;

import java.util.Scanner;

public class AccountCreation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Please enter the type of account to be created and press Enter key");
		System.out.println("Type SB for Saving Account and CR for Current Account");
		System.out.print("Account Type: ");
		String accountType =  sc.nextLine();
		sc.close();
		Account acc;
		if(accountType.trim().equalsIgnoreCase("CR"))
		{
			acc = new CurrentAccount();
		}
		else
		{
			acc = new SavingsAccount(4f);			
		}
		acc.accountNumber = 1234567890;
		acc.name = "Chris";
		System.out.println("The account type is " + acc.accountType);		
		acc.deposit(100000);
		acc.withdraw(25000);
		System.out.println();
		System.out.println("Account Summary");
		System.out.println("Account No - " + acc.accountNumber);
		System.out.println("Account Type - " + acc.accountType);
		System.out.println("Account Holder Name - " + acc.name);
		System.out.println("Minimum Account Balance required - " + acc.minimumBalance);
		System.out.println("Account Balance - " + acc.balance);
		if(acc.accountType.trim().equalsIgnoreCase("SAVINGS"))
		{
			System.out.println("The ROI on the Savings account is " + ((SavingsAccount)acc).rateOfInterest);
		}
	}
}
