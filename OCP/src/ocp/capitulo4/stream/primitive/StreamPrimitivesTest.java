package ocp.capitulo4.stream.primitive;

import java.util.stream.DoubleStream;

public class StreamPrimitivesTest {
	public static void main(String[] args) {
		//IntStream for int, short, byte, char
		//LongStream for long
		//DoubleStream for double, float
		DoubleStream doubleSt = DoubleStream.empty();
		DoubleStream doubleSt1 = DoubleStream.of(3.14);
		doubleSt1.forEach(System.out::println);
		doubleSt.forEach(System.out::println);
	}
}
