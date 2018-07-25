package ocp.capitulo3_collections_generic.generics.bound;

import java.util.ArrayList;
import java.util.List;

public class Unbounded {
	public static void test(List<Object> list) {
		for (Object object : list) {
			System.out.println(object);
		}
	}

	public static void main(String... args) {
		List<String> list = new ArrayList<String>(){{add("teste");add("teste2");}};
		//test(list); //doesnt compile --- you cant convert this
		// however the code bellow compile
		String[] strings = {"renato","joao"};
		Object[] objects = strings;
		objects[1]="sergio";
		//however the code bellow throws ArrayStoreException
		//objects[0]=1; //because int isnot a String
		
		// Now the solution how I can use a List<Object> with List<String>
		testCorrect(list);
	}
	public static void testCorrect(List<?> list) {
		for (Object object : list) {
			System.out.println(object);
		}		
	}
}

