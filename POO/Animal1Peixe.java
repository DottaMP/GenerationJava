package POO;

public class Animal1Peixe extends Animal1{
	public String CorEscama;
	
	@Override //Sobrepondo os métodos de Animal para peixe.
	public void locomover() {
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo algas");
	}

	@Override
	public void emitirSom() {
		System.out.println("Não faz som");
	}
	
	public void soltarBolha(){
		System.out.println("Soltando bolha");
	}

	public String getCorEscama() {
		return CorEscama;
	}

	public void setCorEscama(String corEscama) {
		CorEscama = corEscama;
	}
	

}
