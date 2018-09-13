package ocp.capitulo4.optional;

import java.util.Optional;

public class Average {
	public static Optional<Double> average(Double... values) {
		double x = 0d;
		if (values.length == 0) return Optional.empty();
		for (double d1 : values) {
			x += d1;
		}

		return Optional.of((double)x / values.length);
	}

	public static void main(String[] args) {
		Optional<Double> x = average(10d, 20d, 5d);
		System.out.println(x);
		System.out.println(x.get());
		System.out.println(average());
		Optional<Double> x1 = average();
		if (x1.isPresent())
			System.out.println(x1.get());
		String value = null;
		Optional o = Optional.ofNullable(value); // put Optional.empty if the variable is null
		System.out.println(o);
		x1.ifPresent(System.out::println);
		x.ifPresent(System.out::println);
		System.out.println(x1.orElse(0d)); // if empty put the value
		System.out.println(x1.orElseGet(()->Math.random())); // if empty get a function Supplier
		System.out.println(x1.orElseThrow(()->new ArithmeticException())); // throw exception if empty
		
		
	}
}
