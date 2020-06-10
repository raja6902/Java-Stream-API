package comparator_in_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person(1, "Joe"));
		people.add(new Person(3, "David"));
		people.add(new Person(4, "Bob"));
		people.add(new Person(2, "Clare"));
		
        Collections.sort(people , new Comparator<Person>() {

			
			public int compare(Person p1, Person p2) {
				
				if(p1.getId()>p2.getId()) {
					return 1;
				}
				else if(p1.getId()<p2.getId()) {
					return -1;
				}
				
				return 0;
			}
        	
        });
        
        for(Person person:people) {
        	System.out.println(person);
        }
	}

}
