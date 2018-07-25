package ocp.capitulo3_collections_generic.generics;

public class Generic1 {
	public static void main(String[] args) {
		Carro<String> carro = new Carro<>("fiat");
		carro.printMarcaCarro();
		System.out.println(carro.retornaMarcaCarro());

		Carro<Integer> carro2 = new Carro<>(2);
		carro2.printMarcaCarro();
		System.out.println(carro2.retornaMarcaCarro());
		Shippable<Robot> shipable = new ShippableRobotCrate();
		Robot robot = new Robot();

		robot.name = "C-3PO";
		shipable.ship(robot);
		Shippable.print(robot);
		Shippable.print();
		Shippable shipableCrate = new ShippableCrate();
		shipableCrate.ship("!");
	}

}

class Robot {
	public String name;
}

class ShippableRobotCrate implements Shippable<Robot> {

	public void ship(Robot t) {
		System.out.println("I am moving the:" + t.name);

	}
}

class ShippableCrate implements Shippable {

	@Override
	public void ship(Object t) {
		System.out.println("I am moving something");
	}

}
