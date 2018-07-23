package Bounds;

import java.util.List;
import java.util.ArrayList;

public class Wildcards {
	public static void main(String[] args) {
		List<? extends Exception> listString = new ArrayList<RuntimeException>();
		// because the list above is immutable. you cant use the lines below. 
		// listString.add(new RuntimeException("teste"));
		//listString.add(new Exception("teste"));

		List <? super Exception> listObject = new ArrayList<Object>();
		List<?> list = new ArrayList<String>();
		System.out.println(listString);
		
		List<Integer> listInteger = new ArrayList<Integer>();
		listInteger.add(1);
		//List<Object> listObject1 =listInteger; can t convert to List<Object>
		
		List<?> listAnyThing = listInteger;
		System.out.println(listAnyThing.toString());
		// You cant you because its immutable.
	//	listAnyThing.add(new Object());
		
	}
}
