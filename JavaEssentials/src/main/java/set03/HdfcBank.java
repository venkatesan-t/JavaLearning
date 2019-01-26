package set03;

public final class HdfcBank extends Bank {
	
	HdfcBank()
	{
		super(3.5f);
	}
	
	@Override
	public void RateOfInterest()
	{
		System.out.println("Rate Of Interest is " + rateOfInterest);
	}
}
