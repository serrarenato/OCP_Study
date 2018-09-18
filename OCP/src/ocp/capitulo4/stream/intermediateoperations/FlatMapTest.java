package ocp.capitulo4.stream.intermediateoperations;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapTest {
	public static void main(String[] args) {
		List<List<String>> listaDaListaDeString = Arrays.asList(Arrays.asList("renato", "maria"),
				Arrays.asList("jose", "joao"));
		;
		// TODO

		System.out.println("Original:" + listaDaListaDeString);
		List<String> listaString = listaDaListaDeString.stream().flatMap(Collection::stream)
				.collect(Collectors.toList());
		System.out.println("List<String>: " + listaString);
		Stream<String> streamString = listaDaListaDeString.stream().flatMap(l -> l.stream());
		System.out.println("Stream<String>: ");
		streamString.forEach(System.out::print);
	}
}
