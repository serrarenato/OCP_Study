package ocp.capitulo4.stream.primitive;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamPrimitivesTest {
	public static void main(String[] args) {
		//IntStream for int, short, byte, char
		//LongStream for long
		//DoubleStream for double, float
		IntStream intStream = IntStream.iterate(1,n->n+1).limit(5);
		intStream.forEach(System.out::print);
		intStream = IntStream.range(0, 6); //Inclusive, Exclusive
		System.out.println("------------------");
		intStream.forEach(System.out::print);
		intStream = IntStream.rangeClosed(0, 6); //Inclusive,Inclusive
		System.out.println("------------------");
		intStream.forEach(System.out::print);
		//Converting
		Stream<Integer> stream = Stream.iterate(0, n->n+1);
		intStream = stream.mapToInt(l->l);
		System.out.println("------------------");
		intStream.limit(7).forEach(System.out::print);
		Stream<String> streamString = Stream.of("renato","Sergio", "maria","Tais");
		intStream = streamString.mapToInt(l->l.length());
		System.out.println("------------------");
		intStream.limit(7).forEach(System.out::print);
	}
}
