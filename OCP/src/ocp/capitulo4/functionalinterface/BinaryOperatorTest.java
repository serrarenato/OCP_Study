package ocp.capitulo4.functionalinterface;

import java.util.function.BinaryOperator;

public class BinaryOperatorTest {
	public static void main(String[] args) {
		BinaryOperator<String> binary = (t1, t2) -> t1+" - "+t2;
		System.out.println(binary.apply("Renato", "Sebastiao"));
	}
}
