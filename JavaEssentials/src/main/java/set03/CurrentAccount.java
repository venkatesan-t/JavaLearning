package set03;

public final class CurrentAccount extends Account
{
	CurrentAccount()
	{
		super("Current", 50000);
	}
	
	@Override
	public boolean deposit(double amt)
	{
		System.out.println("Deposing " + amt + " using Current Account");
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
		System.out.println("Withdrawing " + amt + " using Current Account");
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
