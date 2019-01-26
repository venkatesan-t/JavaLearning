package set01;

public class ReverseDigitsOfNumber {

	public static void main(String[] args) {
		int num = 1234;
		int length = Integer.toString(num).length();
		int result = 0;
		double decimalPos = 1;
		int counter = 0;
		do
		{
			decimalPos = Math.pow(10, (length - counter++ - 1));
			result += num % 10 * decimalPos;
			num /= 10;
		}while(num > 0);
		System.out.println("The reversed number is " + result);
	}
}
