package ocp.capitulo3_collections_generic.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	// pay attention: dont have a method contains in Map only collections
	// Collections that are sorted couldnt contains null, like TreeMap and TreeSet
	// ArrayDeque couldnt contains null, because some methods return null like poll().
	// HashTable couldnt contains null, because is so old.
	
	public static void main(String[] args) {
		// HashMap -> very fast but you lose the order
		Map<String, String> hashMap = new HashMap<>();
		hashMap.put("koala", "bamboo");
		hashMap.put("lion", "meat");
		hashMap.put("giraffe", "leaf");
		System.out.println("HashMap:"+hashMap);
		if (hashMap.containsKey("koala"))
			System.out.println(hashMap.get("koala"));
		hashMap.remove("lion");
		System.out.println("value:" + hashMap.containsValue("bamboo"));
		System.out.println("value:" + hashMap.containsValue("meat"));
		System.out.println("value set:" + hashMap.keySet());
		System.out.println("all values:" + hashMap.values());

		// LinkedHashMap -> dont lose the order

		Map<String, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("koala", "bamboo");
		linkedHashMap.put("lion", "meat");
		linkedHashMap.put("giraffe", "leaf");
		System.out.println("LinkedHashMap:" + linkedHashMap);

		// TreeMap -> always in a sorted order -> more slow for add
		Map<String, String> treeMap = new TreeMap<>();
		treeMap.put("koala", "bamboo");
		treeMap.put("lion", "meat");
		treeMap.put("giraffe", "leaf");
		System.out.println("TreeMap:" + treeMap);

		// HashTable -> is older, a only difference to HashMap that is thread safe.
	}
}
