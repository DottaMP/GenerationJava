package POO;


public class Produto_Main {

	public static void main(String[] args) 
	{	
	Produto produto1 = new Produto("XBox One - R$ ",2000.00);
	Produto produto2 = new Produto("Smartphone LG - R$ ",800.00);
	System.out.println(produto1.mostrarDados());
	System.out.println();
	System.out.print(produto2.mostrarDados());
	}
}
