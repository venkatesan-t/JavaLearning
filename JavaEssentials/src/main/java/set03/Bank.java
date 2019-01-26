package set03;

public abstract class Bank {
	
	Bank(float roi)
	{
		rateOfInterest = roi;
	}
	
	protected final float rateOfInterest;
	
	public abstract void RateOfInterest();
}
