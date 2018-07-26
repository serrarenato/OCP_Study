package ocp.capitulo3_collections_generic.generics.bound;

import java.util.ArrayList;
import java.util.List;

public class UpperBound {
	public static void main(String[] args) {
		List<Flyer> flyerList = new ArrayList<>();
		List<Hawk> hankList = new ArrayList<>();
		List<Dove> doveList = new ArrayList<>();
		seeList(flyerList);
		seeList1(flyerList);
		seeList(hankList);
		// seeList1(hankList); //Compile error
		
	}
	public static void seeList(List<? extends Flyer> list) {
		//list.add(new Hawk()); its not possible Upper Bound are immutable
	}
	public static void seeList1(List<Flyer> list) {
		list.add(new Hawk());
	}
	
}
interface Flyer{
	void fly();
}
class Hawk implements Flyer{

	@Override
	public void fly() {	}
	
}
class Dove implements Flyer{

	@Override
	public void fly() {	}
	
}
