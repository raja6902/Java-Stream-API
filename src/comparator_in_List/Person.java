package comparator_in_List;

public class Person {
private int id;
private String name;
public Person(int id, String name) {
	
	this.id = id;
	this.name = name;
}
public static int compareByNameThenId(Person p1,Person p2) {
	if(p1.getName().equals(p2.getName())) {
		return p1.id - p2.id;
	}
	else {
		return p1.getName().compareTo(p2.getName());
	}
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + "]";
}

}
