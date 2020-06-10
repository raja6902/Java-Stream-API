package searchAndReplace;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Different_sort_of_Map {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String> ();
		Map<Integer, String> linkedhashMap = new LinkedHashMap<Integer, String> ();
		Map<Integer, String> treeMap = new TreeMap<Integer, String> ();
       testMap(hashMap);
	}
public static void testMap(Map<Integer, String> map) {
	map.put(9,  "fox");
	map.put(4,  "dog");
	map.put(8,  "cat");
	map.put(1,  "giraffe");
	map.put(15,  "bear");
	map.put(6,  "snake");
	map.put(5,  "rabbit");
	for(Integer key : map.keySet()) {
		String value = map.get(key);
		System.out.println(key + ": " + value);
	}
	
}
}
