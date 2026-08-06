package OOP_Examples;

public class Customer extends User {

	@Override
	public void onLineTicket() {
		System.out.println("Movie Name:"+ticketDetails.getTicketName()+" \nMovie Id: "+ticketDetails.getTicketId());
		System.out.println("Congratulations Customer Your Online Movie Ticket Booking Successfully. ");
	}

	@Override
	public void offLineTicket() {
		System.out.println("Movie Name:"+ticketDetails.getTicketName()+" \n Movie Id: "+ticketDetails.getTicketId());
		System.out.println("Congratulations Customer Your Offline Movie Ticket Booking Successfully. ");

	}

}
