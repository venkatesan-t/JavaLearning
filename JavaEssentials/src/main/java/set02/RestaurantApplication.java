package set02;

public class RestaurantApplication {

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.display();
		Order order = new Order();
		MenuItem item1 = menu.getItemByName("Pomegranate Juice");
		order.addMenuItemCost(item1, 3);
		MenuItem item2 = menu.getItemByName("Coke");
		order.addMenuItemCost(item2, 5);
		System.out.println("The total bill amount is " + order.getTotalCost());
	}
}