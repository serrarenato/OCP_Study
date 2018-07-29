package ocp.capitulo3_collections_generic.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		//Queue first In first out -> FIFO
		//LinkedList -> List + Queue 
		//ArrayDeque -> more efficient than LinkedList
		ArrayDeque<String> arrayDeque = new ArrayDeque<>();
		arrayDeque.add("Renato");
		arrayDeque.add("Sergio");
		arrayDeque.offer("caique");// equals to add, yet dont throw exception
		System.out.println(arrayDeque);
		System.out.println(arrayDeque.element());//get the first element of the queue but dont remove - exception if queue is empty
		System.out.println(arrayDeque.remove()); // remove and return the next element of queue
		arrayDeque.push("top"); // only the ArrayDeck dont have in Queue, put the element in the first.
		System.out.println(arrayDeque.poll());// remove and return the next element - null if the queue is empty
		System.out.println(arrayDeque.peek()); // return the next element without remove it or null if empty queue
		System.out.println(arrayDeque.pop());// return and remove the next element or exception if empty.
		System.out.println(arrayDeque);
		
		// FIFO -> offer->poll->peek
		// LIFO -> push->poll->peek
	}
}
