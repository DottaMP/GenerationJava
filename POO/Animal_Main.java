package POO;

public class Animal_Main {

	public static void main(String[] args) {
		AnimalCachorro cachorro = new AnimalCachorro("Fox", 14);
		AnimalCavalo cavalo = new AnimalCavalo("Zorro", 11);
		AnimalPreguica preguica = new AnimalPreguica("Fofinho",5);
		Animal animal = null;
		
		System.out.println("O nome do cachorro é "+cachorro.getNome());
		cachorro.emitirSom();
		cachorro.acao();
		System.out.println("");

		System.out.println("O nome do cavalo é "+cavalo.getNome());
		cavalo.emitirSom();
		cavalo.acao();
		System.out.println("");
		
		System.out.println("O nome da preguiça é "+preguica.getNome());
		preguica.emitirSom();
		preguica.acao();
		System.out.println("");
	}
}