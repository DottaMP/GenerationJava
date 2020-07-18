package POO;

public class Animal1Reptil extends Animal1 {
	private String corEscama;
	
	@Override //Sobrepondo os métodos de Animal para Réptil
	public void locomover() {
		System.out.println("Rastejando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de réptil");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
}
