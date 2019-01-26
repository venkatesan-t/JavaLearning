package set01;

public class SumOfDigitsInaNumber {

	public static void main(String[] args) {
		int num = 56789;
		int sum = 0;
		do
		{
			sum += num%10;
			num /= 10;
		}while(num > 0);
		System.out.println("The sum of digits is " + sum);
	}
}
