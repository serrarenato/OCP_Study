package ocp.capitulo4.stream.intermediateoperations;

import java.util.Arrays;
import java.util.List;

public class MapTest {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Jailton","Sergio","Marcio","abc");
		names.stream().map(l->l.length()).forEach(System.out::println);
	}
}
