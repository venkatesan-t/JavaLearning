package set04.assignment;

public class ExceptionExample {
	
	private static int[] arr = {2, 6, 9, 15, 17};
	
	public static void main(String[] args) {
		try
		{
			System.out.println("Element at 3 " + arr[2]);
			System.out.println("Element at 6 " + arr[5]);
			System.out.println("Element at -4 " + arr[-4]);
		}
		catch(Exception ex)
		{
			System.out.println("An exception occurred while accessing elements in array");
		}
	}

	public static int getElement(int index)
	{
		if(index < 0 || index > 4)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		else
		{
			return arr[index];
		}
	}
}
