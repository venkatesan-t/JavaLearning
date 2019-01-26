package set02;

public class Menu {
	private MenuItem[] menuItemList = {
			new MenuItem(1, "Coke", 10),
			new MenuItem(2, "Pepsi", 10),
			new MenuItem(3, "Dew", 11),
			new MenuItem(4, "7up", 12),
			new MenuItem(5, "Sprite", 12),
			new MenuItem(6, "Appy", 15),
			new MenuItem(7, "Fresh Lime Juice", 15),
			new MenuItem(8, "Apple Juice", 25),
			new MenuItem(9, "Orange Juice", 20),
			new MenuItem(10, "Pomegranate Juice", 30)
	};
	
	private int getNameMaxWidth()
	{
		int nameMaxWidth = 0;	
		for(int i = 0; i < menuItemList.length; i++)
		{
			if(menuItemList[i].name.length() > nameMaxWidth)
			{
				nameMaxWidth = menuItemList[i].name.length();
			}
		}
		return nameMaxWidth;
	}
	
	private void padNames()
	{
		int nameMaxWidth = getNameMaxWidth();
		for(int i = 0; i < menuItemList.length; i++)
		{
			int paddingCount = 0;
			String paddedString = menuItemList[i].name;
			while(paddingCount < nameMaxWidth - menuItemList[i].name.length())
			{
				paddingCount++;
				paddedString += " ";
			}
			menuItemList[i].name = paddedString;
		}
	}
	
	public void display()
	{
		padNames();
		System.out.println("-------------------------------------");
		System.out.print("| Sl.No. | ");
		System.out.print("Name              | ");
		System.out.print("Cost |");
		System.out.println();
		System.out.println("-------------------------------------");
		for(int i = 0; i < menuItemList.length; i++)
		{
			System.out.print(String.format("| %03d", menuItemList[i].id) + "    | ");
			System.out.print(menuItemList[i].name);
			System.out.print(" | ");
			System.out.print(menuItemList[i].cost + " |");
			System.out.println();
		}
		System.out.println("-------------------------------------");
	}
	
	public MenuItem getItemByName(String name)
	{
		MenuItem item = new MenuItem();
		for(int i = 0; i < menuItemList.length; i++)
		{
			if(menuItemList[i].name.trim().equalsIgnoreCase(name.trim()))
			{
				item = menuItemList[i];
				break;
			}
		}
		return item;
	}
}