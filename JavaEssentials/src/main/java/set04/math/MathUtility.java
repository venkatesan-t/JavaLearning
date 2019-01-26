package set04.math;

public class MathUtility {
	public static int add(int a, int b)
	{
		return a + b;
	}
	public static int difference(int a, int b)
	{
		return a - b;
	}
	public static int multiply(int a, int b)
	{
		return a * b;
	}
	public static int divide(int a, int b)
	{
		return a / b;
	}
	public static long factorial(int n)
	{
		if(n < 0)
		{
			throw new IllegalStateException();
		}
		else if(n == 0)
		{
			return 1;
		}
		else
		{
			return n * factorial(n - 1);
		}		
	}
	public static int reverse(int n)
	{
		int length = Integer.toString(n).length();
		int result = 0;
		double decimalPos = 1;
		int counter = 0;
		while(n > 0)
		{
			decimalPos = Math.pow(10, (length - counter++ - 1));
			result += n % 10 * decimalPos;
			n /= 10;
		};
		return result;
	}
}
