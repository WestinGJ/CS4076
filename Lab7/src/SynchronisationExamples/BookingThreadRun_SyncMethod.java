package SynchronisationExamples;

/**
 *
 * @author razi
 */
public class BookingThreadRun_SyncMethod implements Runnable {
    int total_tickets = 3;
    static int ticketsNo1 = 1, ticketsNo2 = 2, ticketsNo3 = 3;
    synchronized void bookticket (String name, int wantedtickets)
    {
        if (wantedtickets <= total_tickets)
        {
         System.out.println (wantedtickets + " tickets booked to " + name);
         total_tickets = total_tickets - wantedtickets;
        }
        else
        {
         System.out.println ("No tickets to book for "+ name);
        }
    }
    public void run ()
    {
        String name = Thread.currentThread().getName ();
        if (name.equals ("Thread1"))
        {
         bookticket (name, ticketsNo1);
        }
        else if (name.equals ("Thread2"))
        {
         bookticket (name, ticketsNo2);
        }
        else
        {
         bookticket (name, ticketsNo3);
        }
    }
}