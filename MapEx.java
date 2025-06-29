package collection_Concepts;

import java.util.HashMap;

public class MapEx {

	public static void main(String[] args) {
		
		//create a map
		HashMap<Integer, String> countryCodes = new HashMap<Integer, String>();
		
		//Adding elements
		countryCodes.put(1, "USA");
		countryCodes.put(91, "India");
		countryCodes.put(44, "UK");
		
		//Display the elements
		System.out.println("\n Original Map: "+countryCodes);
		
		//Update a value 
		countryCodes.put(91, "Bharat");
		System.out.println("\n After updating India to Bharat: "+countryCodes);
		
		//Check if map contains a key
		System.out.println("\n Contains key 91? "+countryCodes.containsKey(91));
		
		//Display all keys
		System.out.println("\n Keys: "+countryCodes.keySet());
		
		//Display all values
		System.out.println("\n Values: "+countryCodes.values());
		
		countryCodes.remove(1);
		System.out.println("After removing USA: "+countryCodes);
	}
}
