package priorityQueue;

import java.util.PriorityQueue;

public class PQueue {

	public static void main(String[] args) {
		
		
		
		Student jim = new Student(1, "Jim", 11,4.5);
	Student sally = new Student(2, "Sally", 9,5.5);
	Student bob = new Student(3, "Bob", 10,2.5);
	PriorityQueue<Student> pQueue = new PriorityQueue<Student>();
	pQueue.add(bob);
	pQueue.add(sally);
	pQueue.add(jim);
	int count = 1;
	 while(!pQueue.isEmpty()){
		 System.out.println("DQueued" + count+ "-->"  + pQueue.remove());
			count++;
				
		 
		 
	 }
	 System.out.println();

	}

}
