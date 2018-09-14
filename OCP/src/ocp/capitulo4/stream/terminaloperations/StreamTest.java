package ocp.capitulo4.stream.terminaloperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		Stream<String> empty = Stream.empty();
		Stream<String> streamTest = Stream.of("teste", "teste2", "teste3");
		List<String> list = new ArrayList<String>() {
			{
				add("t3ste");
				add("esdasd");
			}
		};
		Stream<String> fromList = list.stream();
		Stream<String> fromListParallel = list.parallelStream();

		fromList.forEach(System.out::println);
		System.out.println("--------------------------");
		streamTest.forEach(System.out::println);
		////////////////// count the values
		streamTest = Stream.of("teste", "teste2", "teste31");
		System.out.println("Count: " + streamTest.count());
		///////////////////// get the minimun
		streamTest = Stream.of("teste", "teste2", "teste31");
		System.out.println("Min value: " + streamTest.min((s1, s2) -> s1.length() - s2.length()).get()); // min return a
																											// Optional
		///// findAny
		streamTest = Stream.of("teste", "teste2", "teste31");
		System.out.println("FindAny:" + streamTest.findAny());
		/// Stream streamTest2 = Stream.generate(() -> "joao"); // infinite stream
		// streamTest2.forEach(System.out::print);

		// AnyMatch AllMatch NoneMatch
		List<String> list1 = Arrays.asList("teste", "2", "teste3");
		Predicate<String> predicate = l -> Character.isLetter(l.charAt(0));
		System.out.println("AllMatch: " + list1.stream().allMatch(predicate));
		System.out.println("AnyMatch: " + list1.stream().anyMatch(predicate));
		System.out.println("NoneMatch: " + list1.stream().noneMatch(predicate));

		// Reduce
		Stream<String> stream = Stream.of("w", "o", "l", "f");
		BinaryOperator<String> binaryConcat = (l, v) -> l.concat(v);
		Optional<String> word = stream.reduce(binaryConcat);
		System.out.println("reduce: " + word);
		stream = Stream.of("w", "o", "l", "f");
		String word2 = stream.reduce("", (a, b) -> a.concat(b));
		System.out.println("reduce2: " + word2);

		List<Integer> numbers = Arrays.asList(10, 2, 4, 5);
		System.out.println(numbers.stream().reduce(1, (a, b) -> a * b));
		System.out.println(numbers.stream().reduce(1, (a, b) -> a * b, (a, b) -> a * b)); // Its a parallel Stream
	}
}
