package ocp.capitulo3_collections_generic.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTest {
	public static void main(String[] args) {
		//ArrayList is good when you have more seek than add
		List<String> list = new ArrayList<>();
		list.add("renato");
		list.add("joao");
		list.add(1, "cabeçudo");
		list.add("sergio");
		list.add("caio");
		list.add("renato");
		list.add("renato2");
		System.out.println("ArrayList:"+list);
		System.out.println("last: " + list.lastIndexOf("renato"));
		System.out.println("index: " + list.indexOf("renato"));
		System.out.println(list);
		list.remove("renato");
		System.out.println(list);
		String old = list.set(2, "cabra");
		System.out.println(list + " objeto retirado: " + old);
		//Vector equals Arraylist but is threadSafe, it's a old version.
		List<String> vector = new Vector<>();
		vector.add("renato");
		vector.add("joao");
		vector.add("sergio");
		vector.add("caio");
		vector.add("renato");
		vector.add("renato2");
		System.out.println("vector: " + vector.lastIndexOf("renato"));
		System.out.println(vector);
		
		//LinkedList is more perform in add and remove than seek
		// its a double linked list - lista duplamente linkada
		
		List<String> linkedList = new LinkedList<>();
		linkedList.add("renato");
		linkedList.add("joao");
		linkedList.set(1, "cabeçudo");
		linkedList.add("sergio");
		linkedList.add("caio");
		linkedList.add("renato");
		linkedList.add("renato2");
		
		System.out.println("linkedList: " + linkedList.lastIndexOf("renato"));
		System.out.println(linkedList);
		
		// Iterator
		Iterator iterator = list.iterator();
		System.out.println("Iterator:");
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+ " ");
		}
		
		
	}
}
