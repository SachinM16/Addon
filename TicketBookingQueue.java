package collection_Concepts;

import java.util.LinkedList;
import java.util.Queue;

public class TicketBookingQueue {

	public static void main(String[] args) {
		Queue<String> bookingQueue = new LinkedList<>();
		
		bookingQueue.add("Santhosh");
		bookingQueue.add("Deva");
		bookingQueue.add("Kevin");
		bookingQueue.add("Charles");
		
		System.out.println("People waiting for tickets: "+bookingQueue );
		
		while(!bookingQueue.isEmpty()) {
			String customer = bookingQueue.poll();
			System.out.println("\n Ticket booked for: "+customer);
			System.out.println("\n Remaining in queue: "+bookingQueue);
		}
		System.out.println("\n All Customers Served....");
	}
}
