package POO;

public class Aviao_Main {

	public static void main(String[] args) 
	{		
		Aviao aviao1 = new Aviao("TAM - "," Com escala",true);
		Aviao aviao2 = new Aviao("Gol - "," Não possui Escala",false);
		
		System.out.println(aviao1.dadosVoo());
		System.out.println(aviao1.Status());
		System.out.println();
		System.out.println(aviao2.dadosVoo());
		System.out.println(aviao2.Status());
	}
}
