package POO;

public class AnimalCavalo extends Animal {
	
	public AnimalCavalo (String nome, int idade) {
		super(nome, idade);
	}
	
	public void emitirSom() {
		System.out.println("hinn in in");
	}
	
	public void acao() {
		System.out.println("Galopando");
	}
}