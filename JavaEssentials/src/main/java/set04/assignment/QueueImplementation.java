package set04.assignment;

public class QueueImplementation implements Queue {	
	private int[] arr = new int[5];
	private byte rear = 0;
	public void insert(int num)
	{
		try
		{
			if(rear < 5)
			{
				arr[rear++] = num;
			}
			else
			{
				rear = 4;
				System.out.println("Queue is full");
				throw new QueueFullException();
			}
		}
		catch(Exception ex)
		{
			System.out.println("An exception has occurred while inserting an item");
		}
	}
	public void delete()
	{
		try
		{
			if(rear >= 0)
			{
				arr[rear--] = 0;
			}
			else
			{
				System.out.println("Queue is empty");
				throw new QueueEmptyException();
			}
		}
		catch(Exception ex)
		{
			System.out.println("An exception has occurred while deleting an item");
		}
	}
	public int getElementAtFront()
	{
		return arr[0];
	}
}
