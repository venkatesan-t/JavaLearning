package set05;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<Byte> list = new ArrayList<Byte>();
		for(byte i = 1; i <= 10; i++)
		{
			list.add(i);
		}
		for(Byte b: list)
		{
			System.out.println(b);
		}
	}

}
