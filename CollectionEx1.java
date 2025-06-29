package collection_Concepts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionEx1 {

	public static void main(String[] args) {
		
		Collection<String> str1 = new ArrayList<>();
		
		//Adding elements
		str1.add("Zain");
		str1.add("Bala");
		str1.add("Mohan");
		str1.add("Lokesh");
		str1.add("Dinesh");
		
		//Display original names
		System.out.println("Original Collection:");
		for(String name: str1) {
			System.out.println(name);
		}
		
		//Sort the names(Collections utility class-requires a list)
		ArrayList<String> sortedlist = new ArrayList<>(str1);
		Collections.sort(sortedlist);
		System.out.println("\n Sorted Collection:");
		for(String name: sortedlist) {
			System.out.println(name);
		}
				
		//Reverse the sorted list
		Collections.reverse(sortedlist);
		System.out.println("\n Reversed Collection:");
		for(String name: sortedlist) {
			System.out.println(name);
		}
		
		//Find max and min 
		System.out.println("\n Max and Min Collection:");
		String maxName = Collections.max(sortedlist);
		String minName = Collections.min(sortedlist);
		
		System.out.println("Max Alphabet: "+maxName);
		System.out.println("Min Alphabet: "+minName);
				
	}
}
