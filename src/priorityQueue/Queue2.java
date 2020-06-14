package priorityQueue;

import java.util.PriorityQueue;
import java.util.PriorityQueue;

public class Queue2 {

	public static void main(String[] args) {
PriorityQueue<String> pQueue = new PriorityQueue<String>();
pQueue.add("F");
pQueue.offer("c");
pQueue.add("A");
pQueue.offer("G");
pQueue.add("Z");
pQueue.offer("O");
pQueue.add("B");
pQueue.offer("Q");
System.out.println("Head:: " + pQueue.peek());
System.out.println("Head:: " + pQueue.element()+ "\n");

while(!pQueue.isEmpty()) {
	System.out.print(pQueue.poll()+ " ");
}
System.out.println("\n");


pQueue.add("F");
pQueue.offer("C");
pQueue.add("A");
pQueue.offer("G");
pQueue.add("Z");
pQueue.offer("O");
pQueue.add("B");
pQueue.offer("Q");

while(!pQueue.isEmpty()) {
System.out.println("Removed::" + pQueue.remove());
System.out.println(pQueue);
System.out.println();
}

}
}
