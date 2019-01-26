package set01;

public class TheatreTicketBookingApplication {

	public static void main(String[] args) {
		int numberOfTickets = 5;
		int goldenTicketCost = 200;
		int silverTicketCost = 150;
		String ticketCategory = "Golden";
		long totalCost = 0;
		if(ticketCategory == "Golden")
		{
			totalCost = numberOfTickets * goldenTicketCost;
		}
		else
		{
			totalCost = numberOfTickets * silverTicketCost;
		}
		System.out.println("The total ticket cost is " + totalCost);
	}
}
