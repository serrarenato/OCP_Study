package ocp.capitulo3_collections_generic.additions_java_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {

		// Consumer functional interface get one parameter and dont return
		// anything(void)
		Consumer<List<Integer>> consumer1 = list -> Collections.sort(list, Collections.reverseOrder());
		List<Integer> listInteger = new ArrayList<>();
		listInteger.add(10);
		listInteger.add(2);
		listInteger.add(90);
		System.out.println("Original " + listInteger);
		consumer1.accept(listInteger);
		System.out.println("Consumer 1 :" + listInteger);
		// method reference
		Consumer<List<Integer>> consumer2 = Collections::sort;
		consumer2.accept(listInteger);
		System.out.println("Consumer 2: " + listInteger);
		Consumer<Integer> i = System.out::println;
		printList(listInteger, i);
		Consumer<Integer> i2 = i.andThen(l -> System.out.print("- AndThen ="+l +" "));
		printList(listInteger, i2);
	}
	public static void printList(List<Integer> list, Consumer<Integer> i) {
		System.out.println("Dentro do metodo:");
		for (Integer integer : list) {
			i.accept(integer);	
		}
		
	}

}
