package collection_Concepts;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class DequeEx {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();
		
		//Add to both ends
		deque.add("Java");
		deque.add("Python");
		deque.add("Nodejs");
		
		//Display
		System.out.println("Deque: "+deque);
		
		//Adding data at first and display data 
		deque.addFirst("JSP");
		System.out.println("\n After adding in first: "+deque);
		
		//Adding data at last and display data 
		deque.addLast("Angular");
		System.out.println("\n After adding in last: "+deque);
		
		//Removing data at first and display data 
		deque.removeFirst();
		System.out.println("\n After removing first: "+deque);
		
		//Removing data at last and display data 
		deque.removeLast();
		System.out.println("\n After removing last: "+deque);
		
		
	}	
}
