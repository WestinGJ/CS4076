package SynchronisationExamples;
/**
*
* @author Westin Gjervold
*/
public class Task1Thread implements Runnable{
	int total_tickets = 3;
	static int ticketsNo1 = 1, ticketsNo2 = 2, ticketsNo3 = 3;

	public void bookticket(String name, int wantedtickets) {
		if (wantedtickets <= total_tickets) {
			synchronized (this) {
				System.out.println(wantedtickets + " tickets booked to " + name);
				total_tickets = total_tickets - wantedtickets;
			}
		} else {
			System.out.println("No tickets to book" + name);
		}

	}

	public void run() {
		String name = Thread.currentThread().getName();
		if (name.equals("Thread1")) {
			bookticket(name, ticketsNo1);
		} else if (name.equals("Thread2")) {
			bookticket(name, ticketsNo2);
		} else {
			bookticket(name, ticketsNo3);
		}
	}
}
