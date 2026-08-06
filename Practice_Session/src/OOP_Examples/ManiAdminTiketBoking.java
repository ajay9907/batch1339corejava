package OOP_Examples;

public class ManiAdminTiketBoking {

	public static void main(String[] args) {
	
		User u=new Customer();
		u.ticketDetails.setTicketId(101);
		u.ticketDetails.setTicketName("Don");
		u.onLineTicket();
		
		System.out.println("-------------");
		User a=new Admin();
		a.ticketDetails.setTicketId(102);
		a.ticketDetails.setTicketName("Raj mama ji");
		a.offLineTicket();

	}

}
