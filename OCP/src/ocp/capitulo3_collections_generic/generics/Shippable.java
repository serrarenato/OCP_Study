package ocp.capitulo3_collections_generic.generics;

public interface Shippable<T> {
	void ship(T t);
	// The generic parameter must be with <T> in static method
	public static <T> void print(T t) { 
		System.out.println("this is interface Shippable");
	}
	public static  void print() {
		System.out.println("this is interface Shippable");
	}
}
