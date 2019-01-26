package set04.threading;

public class SecondThread extends Thread {
	public void run()
	{
		for(int i = 101; i <= 110; i++)
		{
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception ex)
			{
				System.out.println("Some exception occured in " + getClass().getName());
			}
			System.out.println(i);
		}
	}
}
