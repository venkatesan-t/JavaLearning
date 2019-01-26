package set02;

public class Order {
	
	private double _totalCost;
	
	public void addMenuItemCost(MenuItem item, int quantity)
	{
		_totalCost += item.cost * quantity;
	}
	
	public double getTotalCost()
	{
		return _totalCost;
	}
}
