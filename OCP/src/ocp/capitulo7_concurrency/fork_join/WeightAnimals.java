package ocp.capitulo7_concurrency.fork_join;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.Collectors;

public class WeightAnimals {
	public static void main(String[] args) {
		Map<String, Double> animalsWeight;
		List<String> animals = Arrays.asList("macaco", "leao", "veado", "rinoceronte", "ornitorrinco", "falcão",
				"lobo", "tigre", "tucano", "javali", "arara");
		 animalsWeight = animals.stream().collect(Collectors.toMap(l->l, l->0d));
		 ForkJoinTask<Void> task = new WeightAnimalsAction(animalsWeight, 0, animalsWeight.size());
		 ForkJoinPool pool = new ForkJoinPool();
		 pool.invoke(task);
		 System.out.println("Weight: " + animalsWeight);
	}
}
