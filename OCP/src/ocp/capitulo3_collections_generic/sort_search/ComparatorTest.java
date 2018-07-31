package ocp.capitulo3_collections_generic.sort_search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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

		System.out.println(list);
		System.out.println(Collections.binarySearch(list, car1)); // because dont have the order

		System.out.println(Collections.binarySearch(list, car3, comparatorByColor));
		// treeSet example
		Set<Car> treeSet = new TreeSet<>();
		treeSet.add(car1);
		treeSet.add(car2);
		treeSet.add(car3);
		treeSet.add(car4);
		System.out.println("TreeSet: " + treeSet);

		Set<Car> treeSet2 = new TreeSet<>(new Comparator<Car>() {
			@Override
			public int compare(Car car1, Car car2) {
				return car1.getColor().compareTo(car2.getColor());
			}

		});
		treeSet2.add(car1);
		treeSet2.add(car2);
		treeSet2.add(car3);
		treeSet2.add(car4);
		System.out.println("TreeSet2: " + treeSet2);

	}
}
