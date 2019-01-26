package ocp.capitulo7_concurrency.fork_join;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.RecursiveAction;

public class WeightAnimalsAction extends RecursiveAction {

	private int start;
	private int end;
	private Map<String, Double> weights;

	public WeightAnimalsAction(Map<String, Double> weights, int start, int end) {
		this.start = start;
		this.end = end;
		this.weights = weights;
	}

	@Override
	protected void compute() {
		if (end - start <= 3)
			for (int i = start; i < end; i++) {
				double weight = (double) new Random().nextInt(100);
				int x=0;
				for(String name:weights.keySet()) {
					if (x==i) {
						weights.put(name, weight);
						break;
					}
					x++;
				}
				System.out.println("Animal Weighed: " + i);
			}
		else {
			int middle = start + ((end - start) / 2);
			System.out.println("[start=" + start + ",middle=" + middle + ",end=" + end + "]");
			invokeAll(new WeightAnimalsAction(weights, start, middle), new WeightAnimalsAction(weights, middle, end));
		}

	}

}
