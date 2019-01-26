package set01;

public class PrintTenOddEvenNumbers {

	public static void main(String[] args) {
		//print ten even numbers
		System.out.println("First ten even numbers:");
		int counter = 0;
		do
		{
			System.out.println(2 * counter);
		}while(++counter < 10);
		System.out.println("First ten odd numbers:");
		counter = 0;
		do
		{
			System.out.println(2 * counter + 1);
		}while(++counter < 10);
	}
}
