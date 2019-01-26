package set01;

public class AmusementParkBillingCounter {

	public static void main(String[] args) {
		int numberOfTickets = 15;
		int ticketCost = 400;
		float discountPercent = 10f;
		double discount = 0;
		double totalTicketCost = numberOfTickets * ticketCost;
		if(numberOfTickets > 10)
		{
			discount = totalTicketCost * discountPercent/100;
			totalTicketCost -= discount;
		}
		System.out.println("The total ticket cost is " + totalTicketCost);
	}

}
