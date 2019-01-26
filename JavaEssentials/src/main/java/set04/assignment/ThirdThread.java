package set04.assignment;

public class ThirdThread extends Thread {
	public void run()
	{
		int counter = 1;
		while(counter <= 20)
		{
			try
			{
				Thread.sleep(20);
			}
			catch(Exception ex)
			{
				System.out.println("An exception has occurred in " + getClass().getName() + " thread");
			}
			System.out.println(counter + " * 5 = " + counter++ * 5);
		};
	}
}
