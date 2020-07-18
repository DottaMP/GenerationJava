package POO;

public class Animal1Reptil extends Animal1 {
	private String corEscama;
	
	@Override //Sobrepondo os m�todos de Animal para R�ptil
	public void locomover() {
		System.out.println("Rastejando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de r�ptil");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
}
