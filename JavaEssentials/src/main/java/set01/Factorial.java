package set01;

public class Factorial {

	public static void main(String[] args) {
		int num = 5;
		int fact = 1;
		int counter = num;
		do
		{
			fact *= counter;
		}while(--counter > 0);
		System.out.println("The factorial of " + num + " is " + fact);
	}
}
