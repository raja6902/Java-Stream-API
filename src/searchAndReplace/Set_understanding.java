package searchAndReplace;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_understanding {

	public static void main(String[] args) {
		// HashSet does not retain order.
		Set<String> set1 = new HashSet<String>();
		// LinkedHashset remembers order the order you added the items.
		// TreeSet follows natural orders.
		if (set1.isEmpty()) {
			System.out.println("set is empty");
		}
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");
		// Adding duplicate method does nothing.
		set1.add("mouse");
		if (set1.isEmpty()) {
			System.out.println("set is empty");
		}
		System.out.println(set1);
		//// Iteration//////

		// for(String element: set1 ) {
		// System.out.println(element);

		//// Does set contain particular items///

		if (set1.contains("aardvark")) {
			System.out.println("contains aardvark");
		}
		if (set1.contains("cat")) {
			System.out.println("contains cat");
		}
   
		Set<String> set2 = new TreeSet<String>();
		 ////set2 contains some element with set1 and some new.
		 
		set2.add("dog");
		set2.add("cat");
		set2.add("giraffe");
		set2.add("monkey");
		set2.add("ant");
		 //////intersection//////
		Set<String> intersection = new HashSet<String>(set1);
		
		intersection.retainAll(set2);
		System.out.println(intersection);
		//////Difference///////
		Set<String> difference = new HashSet<String>(set1);
		difference.removeAll(set2);
		System.out.println(difference);
	}

}
//}
