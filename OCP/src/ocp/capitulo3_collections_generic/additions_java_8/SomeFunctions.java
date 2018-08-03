package ocp.capitulo3_collections_generic.additions_java_8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class SomeFunctions {
	public static void main(String[] args) {
		List<Integer> listInteger = new ArrayList<>();
		listInteger.add(10);
		listInteger.add(2);
		listInteger.add(90);
		Consumer<List<Integer>> consumer = System.out::println;
		consumer.accept(listInteger);
		listInteger.replaceAll(l -> l + 100);
		consumer.accept(listInteger);
		// for each
		System.out.println("Com for each");
		listInteger.forEach(System.out::println); // Receive a Consumer
	}
}
