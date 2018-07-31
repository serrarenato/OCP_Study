package ocp.capitulo3_collections_generic.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {
	public static void main(String[] args) {
		List<Car> arrayList = new ArrayList<>();
		Car car1 = new Car("hb20", "hatch", "orange");
		Car car2 = new Car("vectra", "hatch", "black");
		Car car3 = new Car("voyage", "sedan", "blue");
		Car car4 = new Car("beatle", "hatch", "white");
		arrayList.add(car1);
		arrayList.add(car2);
		arrayList.add(car3);
		arrayList.add(car4);
		System.out.println(arrayList);
		Comparator<Car> comparatorByColor = new Comparator<Car>() {
			@Override
			public int compare(Car car1, Car car2) {
				return car1.color.compareTo(car2.color);
			}
		};
		Collections.sort(arrayList, comparatorByColor);
		System.out.println("Sorted:" + arrayList);

	}
}
