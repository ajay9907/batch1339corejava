package scenerioPracticeQuestions;
//• 5. Movie Ticket – Child=100, Adult=200, Senior=150.

public class MovieTicket {
	public void movieTicket(String category) {
		if (category == "Child") {
			System.out.println("Ticket Price is =100 ");
		} else if (category == "Adult") {
			System.out.println("Ticket Price is =200");

		} else if (category == "Senior") {
			System.out.println("Ticket Price is =150");
		} else {
			System.err.println("----------");
		}

	}

	public static void main(String[] args) {
		MovieTicket mt = new MovieTicket();
		mt.movieTicket("Child");
	}
}
