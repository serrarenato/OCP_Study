package ocp.capitulo3_collections_generic.additions_java_8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {
	// Supplier is a funcional Interface dont need any parameter and return any type
	// Used like constructor
	public static void main(String[] args) {
		Supplier<List<Integer>> supplier = () -> new ArrayList<Integer>();
		List<Integer> list = supplier.get();
		list.add(5);
		System.out.println(list);
		Supplier<List<Integer>> supplier2 = ArrayList<Integer>::new;
		list = supplier2.get();
		list.add(15);
		System.out.println(list);
	}
}
