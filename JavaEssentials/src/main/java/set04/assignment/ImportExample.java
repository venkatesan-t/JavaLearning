package set04.assignment;

import set04.math.MathUtility;;

public class ImportExample {

	public static void main(String[] args) {
		System.out.println("3 + 7 = " + MathUtility.add(3, 7));
		System.out.println("15 - 8 = " + MathUtility.difference(15, 8));
		System.out.println("12 * 5 = " + MathUtility.multiply(12, 5));
		System.out.println("56 / 4 = " + MathUtility.divide(56, 4));
		System.out.println("Factorial of 5 is " + MathUtility.factorial(5));
		System.out.println("Reverse of 56789 is " + MathUtility.reverse(56789));
	}

}
