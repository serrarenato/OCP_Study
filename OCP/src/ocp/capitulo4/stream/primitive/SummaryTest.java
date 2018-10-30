package ocp.capitulo4.stream.primitive;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class SummaryTest {
	public static void main(String[] args) {
		IntStream numbers = IntStream.range(1, 10);
		IntSummaryStatistics result = numbers.summaryStatistics();

		System.out.println("MAX: " + result.getMax() + " SUM: " + result.getSum());
	}
}
