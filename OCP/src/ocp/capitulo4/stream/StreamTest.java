package ocp.capitulo4.stream;

import java.util.ArrayList;
import java.util.List;
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
		System.out.println("Min value: " + streamTest.min((s1, s2) -> s1.length() - s2.length()).get()); // min return a Optional
	}
}
