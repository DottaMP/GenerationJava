package POO;

public class Cliente {
	//Atributos = variáveis;
	private String nomeCliente;
	private int idadeCliente;
	private String cidadeCliente;
	private String ufCliente;
	
	public Cliente(String nomeC,int idadeC,String cidade, String uf) 
	{
		nomeCliente = nomeC;
		idadeCliente = idadeC;
		cidadeCliente = cidade;
		ufCliente = uf;
	}
	
	public String dadosCliente() 
	//método: são ações daquilo que a classe/objeto pode fazer
	{
		String dados = nomeCliente + " " + idadeCliente +" "+ cidadeCliente+" "+ufCliente; 
		return dados;
	}
}