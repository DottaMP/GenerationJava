package POO;

public class Produto {

	private String nomeProduto;
	private double valorProduto;

	public Produto(String nomeP, double valorP) 
	{
		nomeProduto = nomeP;
		valorProduto = valorP;
	}

	public String mostrarDados() {

		String info = nomeProduto + " " + valorProduto;
		return info;
	}

}