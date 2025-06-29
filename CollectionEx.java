package collection_Concepts;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionEx {

	public static void main(String[] args) {
		Collection<Object> obj1 = new ArrayList<>();
		/**
		 * Adding and Accessing the elements
		 */
		obj1.add(54);
		obj1.add('M');
		obj1.add("Mugilan");
		obj1.add(4.5);
		obj1.add(true);
		
		//Display all elements
		System.out.println(obj1);
		
		//Display mixed list
		System.out.println("\n Mixed datatype in arraylist:");
		for(Object data: obj1) {
			System.out.println(data+ " (Type "+data.getClass().getName() +")");
		}
		
		//type-specific logic using instanceof(if needed)
		System.out.println("\n Integer only");
		for(Object data: obj1) {
			if(data instanceof Integer) {
				Integer num = (Integer) data;
				System.out.println("Integer value: "+num);
			}
		}
		
	}
}
