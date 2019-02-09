package ocp.capitulo8.streams;

public class TestConcrete extends TestAbstract {

	@Override
	public void teste2() {
		System.out.println("teste 2");

	}

	@Override
	public void teste(String name) {
		System.out.println("teste override " + name);

	}

	public static void main(String[] args) {
		TestAbstract test = new TestConcrete();
		test.teste();
		test.teste2();
	}

}
