package set04.assignment;

public class ThreadExample {
	public static void main(String[] args) {
		Thread t = new ThirdThread();
		t.start();
		int counter = 0;
		while(counter <= 20)
		{
			try
			{
				Thread.sleep(25);
				System.out.println(2 * counter++);
			}
			catch(Exception ex)
			{
				System.out.println("An exception has occurred in main thread");
			}			
		};
	}
}
