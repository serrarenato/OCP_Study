package ocp.capitulo3_collections_generic.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestComparable {
	public static void main(String[] args) {
		Set<Car> treeSet = new TreeSet<>();
		Car car1 = new Car("hb20", "hatch", "white");
		Car car2 = new Car("vectra", "hatch", "black");
		Car car3 = new Car("voyage", "sedan", "blue");
		Car car4 = new Car("beatle", "hatch", "white");
		treeSet.add(car1);
		treeSet.add(car2);
		treeSet.add(car3);
		treeSet.add(car4);
		System.out.println("Treeset: "+treeSet);
		List<Car> listCar = new ArrayList<>();
		listCar.add(car1);
		listCar.add(car2);
		listCar.add(car3);
		listCar.add(car4);
		System.out.println("ArrayList: "+ listCar);
		Collections.sort(listCar);
		System.out.println("ArrayList Sorted: "+ listCar);
	
		// without Comparabel throw ClassCastException
		Set<CarWithoutComparable> treeSet1 = new TreeSet<>();
		CarWithoutComparable carWithoutComparable1 = new CarWithoutComparable("hb20", "hatch", "white");
		CarWithoutComparable carWithoutComparable2 = new CarWithoutComparable("vectra", "hatch", "black");
		CarWithoutComparable carWithoutComparable3 = new CarWithoutComparable("voyage", "sedan", "blue");
		CarWithoutComparable carWithoutComparable4 = new CarWithoutComparable("beatle", "hatch", "white");
		
//		treeSet1.add(carWithoutComparable1);
//		treeSet1.add(carWithoutComparable2);
//		treeSet1.add(carWithoutComparable3);
//		treeSet1.add(carWithoutComparable4);
//		System.out.println(treeSet1);
		
		// Try use Collections.sort without comparable cause a compile error
		List<CarWithoutComparable> listCar1 = new ArrayList<>();

		listCar1.add(carWithoutComparable1);
		listCar1.add(carWithoutComparable2);
		listCar1.add(carWithoutComparable3);
		listCar1.add(carWithoutComparable4);
		treeSet1.add(carWithoutComparable4);
		System.out.println("ArrayList without comparable: "+ listCar1);
		//Collections.sort(listCar1); 
		System.out.println("ArrayList without comparable Sorted: "+ listCar1);

	}
}
