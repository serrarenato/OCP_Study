package ocp.capitulo4.stream.primitive;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class DoubleStreamPrimitivesTest {
	public static void main(String[] args) {
		//IntStream for int, short, byte, char
		//LongStream for long
		//DoubleStream for double, float
		DoubleStream doubleSt = DoubleStream.empty();
		DoubleStream doubleSt1 = DoubleStream.of(3.14);
		doubleSt1.forEach(System.out::println);
		doubleSt.forEach(System.out::println);
		doubleSt = DoubleStream.iterate(0,n->n+1);
		System.out.println("Iterate Stream Limit");
		doubleSt.limit(7).forEach(System.out::println);
		doubleSt = DoubleStream.generate(Math::random);
		System.out.println("Generate Stream Limit");
		doubleSt.limit(7).forEach(System.out::println);
		doubleSt = DoubleStream.iterate(0,n->n+1);
		System.out.println("Avarage Stream Limit:");
		doubleSt = DoubleStream.iterate(0, n->n+1).limit(10);	
		OptionalDouble optional = doubleSt.average();	
		System.out.print(optional.getAsDouble());
	}
}
