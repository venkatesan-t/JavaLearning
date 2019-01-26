package set05;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListPractice2 {

	public static void main(String[] args) {
		List<String> countries = new ArrayList<String>();
		//insert names of eight countries
		countries.add("India");
		countries.add("France");
		countries.add("Malaysia");
		countries.add("The United States");
		countries.add("The United Kingdom");
		countries.add("Italy");
		countries.add("Brazil");
		countries.add("Portugal");
		
		for(String cty: countries)
		{
			System.out.println(cty);
		}
		System.out.println("-------------------------------------");
		Collections.sort(countries, new Comparator<String>()
		{
			public int compare(String s1, String s2)
			{
				return s1.compareTo(s2);
			}
		});
		
		for(String cty: countries)
		{
			System.out.println(cty);
		}
	}
}
