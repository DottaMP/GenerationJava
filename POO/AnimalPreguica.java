package POO;

public class AnimalPreguica extends Animal {
	
	public AnimalPreguica (String nome, int idade) {
		super(nome, idade);
	}
	
	public void emitirSom() {
		System.out.println("ZzzzzZzzzzZzzzzZ...");
	}
	
	public void acao() {
		System.out.println("Subindo árvores!");
	}

}