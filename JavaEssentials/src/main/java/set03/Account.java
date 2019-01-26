package set03;

public abstract class Account
{
	Account()
	{
		minimumBalance = 50000;
	}
	
	Account(String at, double mb)
	{
		accountType = at;
		minimumBalance = mb;
	}
	
	Account(String at, long an, String nm, double mb, double b)
	{
		accountType = at;
		accountNumber = an;
		name = nm;
		minimumBalance = mb;
		balance = b;
	}
	
	public long accountNumber;
	public String name;
	public double balance;
	public String accountType;
	public final double minimumBalance;
	
	public boolean deposit(double amt)
	{
		System.out.println("Deposing " + amt + " using Base Account");
		boolean result = false;
		if(amt > 0)
		{
			balance += amt;
			result = true;
			System.out.println("Depositing amount succeeded");
			printBalance();
		}		
		return result;
	}
	
	public boolean withdraw(double amt)
	{
		System.out.println("Withdrawing " + amt + " using Base Account");
		boolean result = false;
		if(amt > 0 && balance > amt)
		{
			balance -= amt;
			result = true;
			System.out.println("Withdrawing amount succeeded");
			printBalance();
		}
		return result;
	}
	
	protected void printBalance()
	{
		System.out.println("The balance in account is " + balance);
	}
}