package Arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
	public static void main(String[] args) {
		String[] array = { "renato", "maria" };
		System.out.println("Before array: " + Arrays.toString(array));
		List<String> list = Arrays.asList(array); // return a fixed sized
		list.set(1, "sergio");
		array[0] = "Fernando";
		array[2] = "joao";
		System.out.println("Collection: " + list);
		System.out.println("After array: " + Arrays.toString(array));
	//	list.remove(0); // UnsupportedOperationException because it's a fixed list
	}

}
