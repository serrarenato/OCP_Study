package enums;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Plant {
	enum LifeCycle {
		ANNUAL, PERENNIAL, BIENNIAL
	}

	final String name;
	final LifeCycle lifeCycle;

	Plant(String name, LifeCycle lifeCycle) {
		this.name = name;
		this.lifeCycle = lifeCycle;
	}

	@Override
	public String toString() {
		return name;
	}

	public static void main(String[] args) {
		Set<Plant> garden = new HashSet<>();
		garden.add(new Plant("margarida", LifeCycle.PERENNIAL));
		garden.add(new Plant("girasol", LifeCycle.PERENNIAL));
		garden.add(new Plant("orquidea", LifeCycle.ANNUAL));

		Set<Plant>[] plantsByLifeCycle = new Set[Plant.LifeCycle.values().length];
		for (int i = 0; i < plantsByLifeCycle.length; i++)
			plantsByLifeCycle[i] = new HashSet<>();
		for (Plant p : garden)
			plantsByLifeCycle[p.lifeCycle.ordinal()].add(p);
		// Print the results
		for (int i = 0; i < plantsByLifeCycle.length; i++) {
			System.out.println(Plant.LifeCycle.values()[i] + ":" + plantsByLifeCycle[i]);
		}
		System.out.println("--------------------");
		Map<Plant.LifeCycle, Set<Plant>> plantsByLifeCycle1 = new EnumMap<>(Plant.LifeCycle.class);
		for (Plant.LifeCycle lc : Plant.LifeCycle.values())
			plantsByLifeCycle1.put(lc, new HashSet<>());
		for (Plant p : garden)
			plantsByLifeCycle1.get(p.lifeCycle).add(p);
		System.out.println(plantsByLifeCycle1);
	}
}
