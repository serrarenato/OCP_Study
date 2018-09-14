package ocp.capitulo4.functionalinterface;

import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		Function<String, Integer> functional = t -> t.length();
		System.out.println(functional.apply("Renato"));
	}
}
