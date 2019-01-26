package set03;

public final class SbiBank extends Bank {
	
	SbiBank()
	{
		super(4);
	}
	
	@Override
	public void RateOfInterest()
	{
		System.out.println("Rate Of Interest is " + rateOfInterest);
	}
}
