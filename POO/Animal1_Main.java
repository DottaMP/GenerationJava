package POO;

public class Animal1_Main {
	public static void main (String args[]){
		//Animal1 n = new Animal1(); Dá erro pois Animal1 é uma classe abstrata e não pode ser instanciada.
	
		Animal1Mamifero m = new Animal1Mamifero();
		Animal1Reptil r = new Animal1Reptil();
		Animal1Peixe p = new Animal1Peixe();
		Animal1Ave a = new Animal1Ave();
	
		m.setPeso(35.3f);
		m.setCorPelo("Marrom");
		m.alimentar();
		m.locomover();
		m.emitirSom();
		
		r.setPeso(35.3f);
		r.setCorEscama("Verde");
		r.alimentar();
		r.locomover();
		r.emitirSom();
		
		p.setPeso(35.3f);
		p.setCorEscama("Vermelho");
		p.alimentar();
		p.locomover();
		p.emitirSom();
		
		a.setPeso(35.3f);
		a.setCorPena("Azul");
		a.alimentar();
		a.locomover();
		a.emitirSom();
	}
}
