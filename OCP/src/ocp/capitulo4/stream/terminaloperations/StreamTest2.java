package ocp.capitulo4.stream.terminaloperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest2 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Renato", "Amanda", "Gato");
		List<String> list2 = list.stream().sorted().collect(Collectors.toList());
		list2.forEach(System.out::println);

		Stream.iterate(1, x -> ++x).limit(5).map(x -> x).forEach(System.out::println);
		System.out.println(Stream.iterate(1, x -> ++x).limit(5).map(x -> "" + x).collect(Collectors.joining()));

		List<Integer> l1 = Arrays.asList(1, 2, 3);
		List<Integer> l2 = Arrays.asList(4, 5, 6);
		List<Integer> l3 = Arrays.asList();
		Stream.of(l1, l2, l3).flatMap(x -> x.stream()).map(x -> x + 1).forEach(System.out::print);

		Stream<Integer> s = Stream.of(1);
		IntStream is = s.mapToInt(x -> x);
		DoubleStream ds = s.mapToDouble(x -> x);
		Stream<Integer> s2 = ds.mapToInt(x ->(Integer) x);

	}
}
