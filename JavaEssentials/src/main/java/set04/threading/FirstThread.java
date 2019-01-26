package set04.threading;

public class FirstThread extends Thread {
	public void run()
	{
		for(int i = 0; i <= 10; i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception ex)
			{
				System.out.println("Some exception occured in " + getClass().getName());
			}
			System.out.println(i);
		}
	}
}
