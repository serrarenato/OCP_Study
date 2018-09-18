package ocp.capitulo4.stream.intermediateoperations;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class PeekTest {
	// Peek dont change the stream
	public static void main(String[] args) {
		Stream<String> names = Arrays.asList("Jailton", "Sergio", "Marcio", "abc", "Joao").stream();
		// Long count = names.filter(l -> l.startsWith("J")).count(); its change the
		// stream
		StringBuilder sb = new StringBuilder();

		names.peek(l -> sb.append(l)).forEach(System.out::println);
		System.out.println("String Builder: " + sb);
		names = Arrays.asList("Jailton", "Sergio", "Marcio", "abc", "Joao").stream();
		Long count = names.filter(l -> l.startsWith("J")).peek(System.out::println).count();
		System.out.println(count);

	}
}
