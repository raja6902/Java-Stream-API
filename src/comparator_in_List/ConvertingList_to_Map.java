package comparator_in_List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertingList_to_Map {
 
		public static void main(String[] args) {
			List<Person> people = new ArrayList<Person>();
			people.add(new Person(1, "Joe"));
			people.add(new Person(3, "David"));
			people.add(new Person(4, "Bob"));
			people.add(new Person(2, "Clare"));
			
			people.forEach(item->System.out.println(item));
			
      Map<Object, Object> map = new HashMap<>();
      map = people.stream().collect(Collectors.toMap(item->item.getId(), item->item));
      map.forEach((k,v)->System.out.println(k + " : "+ v));
      
	}

}
