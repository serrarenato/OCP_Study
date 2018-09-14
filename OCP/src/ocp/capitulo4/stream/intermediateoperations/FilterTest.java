package ocp.capitulo4.stream.intermediateoperations;

import java.util.Arrays;
import java.util.List;

public class FilterTest {
	public static void main(String[] args) {
		List<String> animals = Arrays.asList("monkey", "cat", "dog", "gorilla");
		animals.stream().filter(l -> l.length() > 3).forEach(System.out::println);
	}
}
