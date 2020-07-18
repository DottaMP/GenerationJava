package POO;

public class Animal1Ave extends Animal1 {
	public String corPena;
	
	@Override //Sobrepondo os métodos de Animal para Aves
	public void locomover() {
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo frutas");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de ave");
	}
	public void fazerNinho(){
		System.out.println("Construindo ninho");
	}

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	
}
