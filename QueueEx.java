package collection_Concepts;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
//		Queue<String> queue = new LinkedList<String>();
		PriorityQueue<String> queue = new PriorityQueue<String>();
		
		/**
		 * Queue does not alphabetical order
		 * priority Queue maintains sorting order based on size
		 * priority queue removes the smallest size data 
		 */
		
		//Enqueue-->Entering queue
		queue.add("Java");
		queue.add("Servlet");
		queue.add("Spring");
		queue.add("SpringBoot");
		queue.add("Microservices");
		queue.add("Restful api");
		
		//Display
		System.out.println("\n Queue: "+queue);
		
		//Dequeue-->Deleting queue
		System.out.println("\n Removed: "+queue.poll());
		
		//peek
		System.out.println("\n Front: "+queue.peek());
		System.out.println("\n Update queue: "+queue);
		
	}
}
