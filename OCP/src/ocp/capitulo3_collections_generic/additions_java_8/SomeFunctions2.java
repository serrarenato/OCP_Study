package ocp.capitulo3_collections_generic.additions_java_8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class SomeFunctions2 {
	public static void main(String[] args) {
		Map<String, String> fruits = new HashMap<>();
		fruits.put("banana", "10.22");
		fruits.put("coconut", "15.22");
		fruits.put("orange", "20.22");
		fruits.put("crawberry", null);
		fruits.forEach((l, k) -> System.out.println("key " + l + " value " + k));
		System.out.println("------------changing-------------");
		fruits.putIfAbsent("banana", "22"); // dont change
		fruits.putIfAbsent("cherry", "12"); // dont chang
		fruits.putIfAbsent("crawberry", "12");
		fruits.forEach((l, k) -> System.out.println("key " + l + " value " + k));
		BiFunction<String, String, String> mapper = (l, k) -> new Double(l) > new Double(k) ? l : k;
		
		// merge add or change the value of Map, if the condicional is true;
		fruits.put("orange", null); // dont call the mapper function only change the value
		fruits.merge("banana", "11.20", mapper);
		fruits.merge("banana", "9.0", mapper);
		fruits.merge("bean", "1.20", mapper);
		fruits.merge("orange", "1.20", mapper); // dont call the mapper function only change the value
		System.out.println("Depois do Merge: " + fruits);
		
		BiFunction<String, String, String> mapper1 = (k, v) -> v + 1;
		fruits.computeIfAbsent("kafta", mapper1);
		
		System.out.println("Depois do Merge: " + fruits);

	}
}
