package ocp.capitulo7_concurrency.ciclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Problem: you have 4 workers to clean a pen of lions, with a manager.
 * Now use the patter CyclicBarrier that wait until all workers finish some part of task. 
 */
public class CleanPenLionWithManager {
	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(4);
		CleanPenLionWithManager manager = new CleanPenLionWithManager();
		CyclicBarrier c1 = new CyclicBarrier(4);
		CyclicBarrier c2 = new CyclicBarrier(4, () -> System.out.println("*** Pen Cleaned!"));
		try {
			for (int x = 0; x < 4; x++)
				service.submit(() -> manager.performTask(c1, c2));
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

	public void performTask(CyclicBarrier c1, CyclicBarrier c2) {
		removeAnimals();
		try {
			c1.await();
			cleanPen();
			c2.await();
			addAnimals();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
