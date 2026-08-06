package OOP_Examples;

public class Admin extends User {
	public void onLineTicket() {
		System.out
				.println("Movie Name:" + ticketDetails.getTicketName() + " \nMovie Id: " + ticketDetails.getTicketId());
		System.out.println("Congratulations Admin Your Online Movie Ticket Booking Successfully. ");
	}

	@Override
	public void offLineTicket() {
		System.out.println(
				"Movie Name:" + ticketDetails.getTicketName() + " \nMovie Id: " + ticketDetails.getTicketId());
		System.out.println("Congratulations Admin Your Offline Movie Ticket Booking Successfully. ");

	}

}
