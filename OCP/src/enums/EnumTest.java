package enums;

public class EnumTest {
	public static void main(String[] args) {
		double x = Operation.Plus.apply(10, 20);
		System.out.println(x);
		System.out.println(Operation.Minus.apply(15, 60));
		System.out.println(OperationNew.Minus.apply(10, 7));
		System.out.println(Operation.Plus);
	}
}

enum Operation {
	Plus("+"), Minus("-");
	private String value;
	private Operation(String value) {
		this.value=value;
	}
	public double apply(double x, double y) {
		switch (this) {
		case Plus:
			return x + y;
		case Minus:
			return x - y;
		}
		throw new AssertionError("Unknown op: " + this);
	}
	@Override
	public String toString() {
		return value;
	}
}
enum OperationNew {
	Plus{public double apply(double x, double y) {return x+y;}},
	Minus{public double apply(double x, double y) {return x-y;}};
	public abstract double apply(double x, double y); 
}
