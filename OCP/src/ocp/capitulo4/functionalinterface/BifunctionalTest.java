package ocp.capitulo4.functionalinterface;

import java.util.function.BiFunction;

public class BifunctionalTest {
	public static void main(String[] args) {
		BiFunction<String, String, Integer> biFunctional = (u,v)-> u.concat(v).length();
		System.out.println(biFunctional.apply("Renato", "Maria"));
	}
}
