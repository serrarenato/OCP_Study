package ocp.capitulo4.stream.intermediateoperations;

import java.util.Arrays;
import java.util.List;

public class DistinctTest {
	public static void main(String[] args) {
		List<String> animals = Arrays.asList("monkey", "cat", "dog", "gorilla", "dog");
		animals.stream().distinct().forEach(System.out::println);
	}
}
