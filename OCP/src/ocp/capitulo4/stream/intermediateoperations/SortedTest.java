package ocp.capitulo4.stream.intermediateoperations;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedTest {
	public static void main(String[] args) {
		List<List<String>> listaDaListaDeString = Arrays.asList(Arrays.asList("renato", "maria"),
				Arrays.asList("jose", "joao"));
		;

		System.out.println("Original:" + listaDaListaDeString);
		List<String> listaString = listaDaListaDeString.stream().flatMap(Collection::stream)
				.collect(Collectors.toList());
		// Sorted in original order
		System.out.println("Sorted:"); 
		listaString.stream().sorted().forEach(System.out::println);
		
		// Sorted in reverse order with Comparator
		System.out.println("Sorted Reverse:"); 
		listaString.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		//listaString.stream().sorted(Comparator::reverseOrder).forEach(System.out::println); //dont work because need two args
	}
}
