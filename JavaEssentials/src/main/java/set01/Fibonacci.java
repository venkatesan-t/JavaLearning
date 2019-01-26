package set01;

public class Fibonacci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		System.out.println("First ten Fibonacci numbers");
		int counter = 0;
		do
		{
			System.out.println(a);
			int temp = a;
			a = b;
			b = temp + a;
		}while(++counter < 10);
	}
}
