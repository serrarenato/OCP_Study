package ocp.capitulo7_concurrency.ciclicbarrier;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Problem: you have 4 workers to clean a pen of lions, without a manager.
 * 
 */
public class CleanPenLion {
	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(4);
		CleanPenLion manager = new CleanPenLion();
		try {
			for (int x = 0; x < 4; x++)
				service.submit(() -> manager.performTask());
		} finally {
			if (service != null)
				service.shutdown();
		}

	}

	private void removeAnimals() {
		System.out.println("Removing animals");
	}

	private void cleanPen() {
		System.out.println("Cleaning the pen");
	}

	private void addAnimals() {
		System.out.println("Adding animals");
	}

	public void performTask() {
		removeAnimals();
		cleanPen();
		addAnimals();
	}

}
