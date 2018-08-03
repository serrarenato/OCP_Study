package ocp.capitulo3_collections_generic.additions_java_8;

import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		Function<Integer, Integer> add1= x -> x++;
		System.out.println(add1.apply(3));
	}
}
