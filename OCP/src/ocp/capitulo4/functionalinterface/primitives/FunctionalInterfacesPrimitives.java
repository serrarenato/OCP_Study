package ocp.capitulo4.functionalinterface.primitives;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.function.ToIntFunction;

public class FunctionalInterfacesPrimitives {
	public static void main(String[] args) {
		BooleanSupplier bs = () -> true;
		BooleanSupplier bs1 = () -> {
			System.out.println("teste");
			return true;
		};
		System.out.println(bs.getAsBoolean());
		bs1.getAsBoolean();

		ToIntFunction<Double> convert = l -> l.intValue();
		int number = convert.applyAsInt(10d);
		System.out.println(number);

		DoubleToIntFunction df = x -> ((Double) x).intValue();
		System.out.println(df.applyAsInt(4.0));
	}
}
