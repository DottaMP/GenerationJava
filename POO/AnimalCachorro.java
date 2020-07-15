package POO;

public class AnimalCachorro extends Animal {
	
	public AnimalCachorro (String nome, int idade) {
		super(nome, idade);
	}
	
	public void emitirSom() {
		System.out.println("Auau au auau!");
	}
	
	public void acao() {
		System.out.println("Correndo!");
	}

}
