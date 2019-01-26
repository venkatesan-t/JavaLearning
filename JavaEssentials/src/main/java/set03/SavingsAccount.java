package set03;

public final class SavingsAccount extends Account
{
	SavingsAccount(float roi)
	{
		super("Savings", 10000);
		rateOfInterest = roi;
	}
	public final float rateOfInterest;
	
	@Override
	public boolean deposit(double amt)
	{
		System.out.println("Deposing " + amt + " using Savings Account");
		boolean result = false;
		if(amt > 0)
		{
			balance += amt;
			result = true;
			System.out.println("Depositing amount succeeded");
			super.printBalance();
		}		
		return result;
	}
	
	@Override
	public boolean withdraw(double amt)
	{
		System.out.println("Withdrawing " + amt + " using Savings Account");
		boolean result = false;
		if(amt > 0 && balance > amt)
		{
			balance -= amt;
			result = true;
			System.out.println("Withdrawing amount succeeded");
			super.printBalance();
		}
		return result;
	}
}

