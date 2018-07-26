package ocp.capitulo3_collections_generic.generics.bound;

import java.util.ArrayList;
import java.util.List;

public class LowerBounded {
	public static void main(String[] args) {
		// LowerBounded you can only instate class above or equal never below
		// But when you do a add must be equal or bellow the super.
		List<? super String> listString = new ArrayList<Object>();
		listString.add("teste");
		List<? super String> listObject = new ArrayList<Object>();
		listObject.add("teste");
		addList(listObject);
		addList(listString);

		List<? super Integer> cj = new ArrayList<Number>();
		cj.add(new Integer(1));
		// Only Integers are permitted
		//cj.add(new Long(1)); 
		//cj.add("dd");
		List<? super Number> cj1 = new ArrayList<Object>();
		cj1.add(new Integer(1));	
		cj1.add(new Long(1)); 
		// Only Number are permitted
		//cj.add("dd");
		List<? super Object> cj2 = new ArrayList<Object>();
		cj2.add(new Integer(1));	
		cj2.add(new Long(1));
		cj2.add("dd");
	}
	public static void addList(List<? super String> list) {
		list.add("mais um teste");
		System.out.println(list);
	}
}
