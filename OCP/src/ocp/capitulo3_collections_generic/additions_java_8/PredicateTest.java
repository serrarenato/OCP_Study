package ocp.capitulo3_collections_generic.additions_java_8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		// Predicate is a funcional Interface that get one parameter of any type and
		// return a boolean
		String string = "Renato Serra";
		Predicate<String> predicate1 = s -> string.startsWith(s);
		Predicate<String> predicate2 = string::startsWith;
		System.out.println(predicate1.test("R"));
		System.out.println(predicate1.test("E"));
		System.out.println(predicate2.test("R"));
		System.out.println(predicate2.test("E"));

		List<String> listString = new ArrayList<>();
		listString.add("10");
		listString.add("11");
		listString.add("90");
		listString.removeIf(l -> l.startsWith("1")); // removeIf get a Predicate

		System.out.println("RemoveIf ->" + listString);


	}

}
