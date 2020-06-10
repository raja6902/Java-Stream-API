package searchAndReplace;

import java.util.HashMap;
import java.util.Map;

public class UnderStanding_HashMap {

	public static void main(String[] args) {
		HashMap<Integer , String> map = new HashMap<Integer, String>();
		map.put(1,"One");
		map.put(4, "Four");
		map.put(8, "Eight");
		map.put(10,  "Ten");
		map.put(3, "Three");
		
		//traversing and displaying the Hashmap.
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key +  ":" + value);
		}

	}

}
