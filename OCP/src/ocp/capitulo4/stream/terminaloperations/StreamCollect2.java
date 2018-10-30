package ocp.capitulo4.stream.terminaloperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect2 {
	// Function.identity() is the same thing of l->l
	public static void main(String... strings) {
		// List to String
		List<String> list1 = Arrays.asList("teste", "sebastiao", "maria", "carla", "joao");
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

		// List to Map if duplicate key
		// Map<Integer, String> map2 = list1.stream().collect(Collectors.toMap(l ->
		// l.length(), l -> l)); // IllegalStateException

		Map<Integer, String> map2 = list1.stream()
				.collect(Collectors.toMap(l -> l.length(), l -> l, (s1, s2) -> s1 + "+" + s2)); //
		System.out.println(map2);

		Map<Integer, List<String>> mapList = list1.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(mapList);

		Map<Integer, Set<String>> mapSet = list1.stream()
				.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
		System.out.println(mapSet);

		Map<Boolean, List<String>> partition = list1.stream().collect(Collectors.partitioningBy(s -> s.length() <= 5));
		System.out.println(partition);

		Map<Integer, Long> mapCount = list1.stream()
				.collect(Collectors.groupingBy(String::length, Collectors.counting()));
		System.out.println(mapCount);

		Map<Integer, Optional<Character>> firstLetter = list1.stream().collect(Collectors.groupingBy(String::length,
				Collectors.mapping(s -> s.charAt(0), Collectors.minBy(Comparator.naturalOrder()))));
		System.out.println(firstLetter);

		Optional<String> o = list1.stream().collect(Collectors.minBy(Comparator.reverseOrder()));
		System.out.println(o);
	}
}
