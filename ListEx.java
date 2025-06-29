package collection_Concepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		//create a list
		
//		List<String> list = new ArrayList<String>();
//		ArrayList<String> list = new ArrayList<String>();
		HashSet<String> list = new HashSet<String>();
		
		//add elements
		list.add("Yamaha");
		list.add("Honda");
		list.add("TVS");
		list.add("Jawa");
		list.add("RE");
		
		//Display the list of elements
		System.out.println("Original list: "+list);
		
//		//Add a specific index-->used for ArrayList not for HashSet
//		list.add(2, "Hero");
//		System.out.println("\n After adding Hero: "+list);
		
		//Update an element-->used for ArrayList not for HashSet
//		list.set(1, "BMW");
//		System.out.println("\n After updating Honda to BMW: "+list);
		
		//Remove by value
		list.remove("TVS");
		System.out.println("\n After removing TVS: "+list);
		
		//Check if list contains an element
		System.out.println("\n Contains Yamaha? "+list.contains("Yamaha"));
		
		//Get the size of the list
		System.out.println("\n Size of list: "+list.size());
		
		System.out.println("\n After iterating the data: ");
		for(String s: list) {
			System.out.println(s);
		}
	}
}
