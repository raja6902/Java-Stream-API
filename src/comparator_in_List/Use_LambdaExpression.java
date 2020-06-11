package comparator_in_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Use_LambdaExpression {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person(1, "Joe"));
		people.add(new Person(3, "David"));
		people.add(new Person(4, "Bob"));
		people.add(new Person(3, "Clare"));
		
		//people.sort(Person::compareByNameThenId);
		//people.forEach(System.out::print);
		//people.sort((o1,o2)->o1.getId()-o2.getId());
		//people.stream().forEach(System.out::print);
    people.sort(Comparator.comparing(Person::getName).thenComparing(Person::getId));		
		//Comparator<Person> comp = (p1,p2)->p1.getName().compareTo(p2.getName());
   // people.sort(comp.reversed());
    people.forEach(System.out::print);
		//Collections.sort(people, Comparator.comparing(Person::getName));
     
	}

}
