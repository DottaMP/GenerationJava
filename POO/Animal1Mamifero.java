package POO;

public class Animal1Mamifero extends Animal1{
	
	private String CorPelo;

	@Override //Sobrepondo os m�todos de Animal para Mam�fero
	public void locomover() {
		System.out.println("Correndo");
	}

	@Override
	public void alimentar() {
		System.out.println("Mamando");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de mam�fero");
	}

	public String getCorPelo() {
		return CorPelo;
	}

	public void setCorPelo(String corPelo) {
		CorPelo = corPelo;
	}
	
}
