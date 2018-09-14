package ocp.capitulo4.stream.intermediateoperations;

import java.util.stream.Stream;

public class LimitSkip {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.iterate(1, n->n+1);
		stream.limit(10).forEach(System.out::println);
		System.out.println("-----------------------------Limit & Skip");
		stream = Stream.iterate(1, n->n+1);
		stream.skip(40).limit(7).forEach(System.out::println);
	}
}
