package ocp.capitulo4.functionalinterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorTest {
	public static void main(String[] args) {
		UnaryOperator<String> unary = t-> t.concat("-teste");
		System.out.println(unary.apply("Joao"));
	}
}
