package ocp.capitulo4.functionalinterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		// Dont get Anything only return a generic
		// Supplier generally used like factory
		
		Supplier<LocalDate> date = LocalDate::now;
		LocalDate d1 = date.get();
		System.out.println(d1);
		
		Supplier<ArrayList<String>> listSupplier = ArrayList<String>::new;
		System.out.println(listSupplier);
		List<String> list = listSupplier.get();
		list.add("renato");
		System.out.println(list);
	}
}
