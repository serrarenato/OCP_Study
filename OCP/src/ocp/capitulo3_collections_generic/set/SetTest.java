package ocp.capitulo3_collections_generic.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
		//HashSet -> you lose the order but is very fast, stores the elements in a hashtable
		
		Set<String> hashSet= new HashSet<>();
		hashSet.add("renato");
		hashSet.add("joao");
		hashSet.add("sergio");
		hashSet.add("caio");
		hashSet.add("renato"); // dont accept elements duplicated.
		hashSet.add("renato2");
		System.out.println(hashSet);
		
		//TreeSet -> have order in elements
		// here you can see the natural sorted order of elements, because the interface Comparable
		Set<String> treeSet= new TreeSet<>();
		treeSet.add("renato");
		treeSet.add("joao");
		treeSet.add("sergio");
		treeSet.add("caio");
		treeSet.add("renato"); // dont accept elements duplicated.
		treeSet.add("renato2");
		System.out.println(treeSet);
		// some methods that only exist in TreeSet
		TreeSet<String> treeSet2= new TreeSet<>();
		treeSet2.add("renato");
		treeSet2.add("joao");
		treeSet2.add("sergio");
		treeSet2.add("caio");
		treeSet2.add("renato"); // dont accept elements duplicated.
		treeSet2.add("renato2");
		System.out.println(treeSet2);
		System.out.println(treeSet2.floor("sergio")); // the bigger element < or =
		System.out.println(treeSet2.floor("zzzz")); // the bigger element < or =
		System.out.println(treeSet2.floor("re")); // the bigger element < or =
		System.out.println(treeSet2.lower("sergio")); // the bigger element <
		System.out.println(treeSet2.ceiling("sergio")); // the bigger element > or =
		System.out.println(treeSet2.ceiling("zz")); // dont have element.	
		System.out.println(treeSet2.higher("sergio")); // the bigger element > 
		System.out.println(treeSet2.higher("renato")); // the bigger element > 
	}
}
