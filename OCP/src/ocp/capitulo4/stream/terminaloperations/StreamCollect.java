package ocp.capitulo4.stream.terminaloperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamCollect {
	// Function.identity() is the same thing of l->l
	public static void main(String... strings) {
		// List to StringBuilder
		List<String> list1 = Arrays.asList("teste", "sebastiao", "maria", "Carla");
		StringBuilder x = list1.stream().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
		System.out.println(x);
		
		StringBuilder x1 = list1.stream().collect(()-> new StringBuilder(), (l,v)-> l.append("-"+v), (l,v)-> l.append("_"+v));
		System.out.println(x1);
		
		// List to Set		
		Set<String> set = list1.stream().collect(Collectors.toSet());
		System.out.println(set);
		
		Set<String> set2 = list1.stream().collect(HashSet::new, HashSet::add,  HashSet::addAll);
		System.out.println(set2);
		
		// List to Map
		Map map = list1.stream().collect(Collectors.toMap(Function.identity(), l -> l));
		System.out.println(map);

		List<Person> persons = new ArrayList<>();
		persons.add(new Person(100, "Mohan"));
		persons.add(new Person(200, "Sohan"));
		persons.add(new Person(300, "Mahesh"));

		// Map mapPersons = persons.stream().collect(Collectors.toMap(Person::getId, Person::getName));
		//same thing of:
		Map mapPersons = persons.stream().collect(Collectors.toMap((Person l) -> l.getId(), l -> l.getName()));
		System.out.println(mapPersons);

	}
}

class Person {
	private Integer id;
	private String name;

	public Person(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
