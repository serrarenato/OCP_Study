package ocp.capitulo4.stream.terminaloperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect2 {
	// Function.identity() is the same thing of l->l
	public static void main(String... strings) {
		// List to String
		List<String> list1 = Arrays.asList("teste", "sebastiao", "maria", "Carla");
		String x = list1.stream().collect(Collectors.joining(" # "));
		System.out.println(x);

		// Average
		Double average = list1.stream().collect(Collectors.averagingInt(String::length));
		System.out.println("average: " + average);
		Stream<Integer> stream1 = Stream.of(1, 5, 7, 9);
		System.out.println("average2: " + stream1.collect(Collectors.averagingInt(n -> n)));
		// List to Map
		Map<String, Integer> map = list1.stream().collect(Collectors.toMap(l -> l, l -> l.length()));
		System.out.println(map);

	}
}
