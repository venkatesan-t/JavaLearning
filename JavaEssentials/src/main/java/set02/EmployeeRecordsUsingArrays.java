package set02;

public class EmployeeRecordsUsingArrays {

	public static void main(String[] args) {
		int[] ids = { 1, 2, 3, 4, 5 };
		String[] names = { "John", "Clark", "Nancy", "Joe", "Mary" };
		double[] salaries = { 600000, 550000, 500000, 500000, 300000 };
		display(ids, names, salaries);
		System.out.println();
		display(ids, names);
		System.out.println();
		String userName = "Clark"; 
		display(userName, ids, names, salaries);
	}
	
	private static int getMaxWidth(String[] names)
	{
		int nameMaxWidth = 0;	
		for(int i = 0; i < names.length; i++)
		{
			if(names[i].length() > nameMaxWidth)
			{
				nameMaxWidth = names[i].length();
			}
		}
		return nameMaxWidth;
	}
	
	private static String[] padGetStrings(String[] arr)
	{
		int nameMaxWidth = getMaxWidth(arr);
		String[] newArr = new String[arr.length];
		for(int i = 0; i < arr.length; i++)
		{
			int paddingCount = 0;
			String paddedString = arr[i];
			while(paddingCount < nameMaxWidth - arr[i].length())
			{
				paddingCount++;
				paddedString += " ";
			}
			newArr[i] = paddedString;
		}	
		return newArr;
	}
	
	private static void display(int[] ids, String[] names, double[] salaries)
	{
		String[] paddedNames = padGetStrings(names);
		System.out.println("------------------------");
		System.out.print("| ID  | ");
		System.out.print("Name  | ");
		System.out.print("Salary |");
		System.out.println();
		System.out.println("------------------------");
		for(int i = 0; i < ids.length; i++)
		{
			System.out.print(String.format("| %03d", ids[i]) + " | ");
			System.out.print(paddedNames[i]);
			System.out.print(" | ");
			System.out.print(((int)salaries[i]) + " |");
			System.out.println();
		}
		System.out.println("------------------------");
	}
	
	private static void display(int[] ids, String[] names)
	{
		String[] paddedNames = padGetStrings(names);
		System.out.println("---------------");
		System.out.print("| ID  | ");
		System.out.print("Name  |");
		System.out.println();
		System.out.println("---------------");
		for(int i = 0; i < ids.length; i++)
		{
			System.out.print(String.format("| %03d", ids[i]) + " | ");
			System.out.print(paddedNames[i]);
			System.out.print(" |");
			System.out.println();
		}
		System.out.println("---------------");
	}
	
	private static void display(String name, int[] ids, String[] names, double[] salaries)
	{
		String[] paddedNames = padGetStrings(names);
		System.out.println("------------------------");
		System.out.print("| ID  | ");
		System.out.print("Name  | ");
		System.out.print("Salary |");
		System.out.println();
		System.out.println("------------------------");
		for(int i = 0; i < ids.length; i++)
		{
			if(names[i] == name)
			{
				System.out.print(String.format("| %03d", ids[i]) + " | ");
				System.out.print(paddedNames[i]);
				System.out.print(" | ");
				System.out.print(((int)salaries[i]) + " |");
				System.out.println();
				break;
			}
		}
		System.out.println("------------------------");
	}
}
