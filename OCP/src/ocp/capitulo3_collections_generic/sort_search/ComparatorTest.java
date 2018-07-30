package ocp.capitulo3_collections_generic.sort_search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ocp.capitulo3_collections_generic.Comparable.Car;

public class ComparatorTest {
	public static void main(String[] args) {
		List<Car> list = new ArrayList<>();
		Car car1 = new Car("hb20", "hatch", "white");
		Car car2 = new Car("vectra", "hatch", "black");
		Car car3 = new Car("voyage", "sedan", "blue");
		Car car4 = new Car("beatle", "hatch", "white");
		list.add(car1);
		list.add(car2);
		list.add(car3);
		list.add(car4);
		Comparator<Car> comparatorByColor = (c1, c2) -> c1.getColor().compareTo(c2.getColor());
		Collections.sort(list, comparatorByColor);
		System.out.println(Collections.indexedBinarySearch(list, "white",comparatorByColor));
		System.out.println(list);
	}
}
