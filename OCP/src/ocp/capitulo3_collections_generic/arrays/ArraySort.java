package ocp.capitulo3_collections_generic.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		int[] numeros = { 6, 9, 1, 7 };
		Arrays.sort(numeros);
		System.out.println(Arrays.binarySearch(numeros, 6));
		System.out.println(Arrays.toString(numeros));
	}
}
