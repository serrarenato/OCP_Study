package ocp.capitulo3_collections_generic.generics;

public class Carro<T> {
	private T content;

	public Carro(T content) {
		this.content = content;
	}

	public void printMarcaCarro() {
		System.out.println(content);
	}
	public T retornaMarcaCarro() {
		return content;
	}
}
