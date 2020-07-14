package POO;

public class Caneta_Main {
	public static void main (String ar[])
	{
  //Abaixo estamos instanciando, criando um objeto (c1) a partir da classe criada (Caneta).
  //Classe objeto = new classe();
		Caneta c1 = new Caneta();
		
	//m�todos Setters e Getters protegem o atributo, n�o realizando o acesso direto a eles.
		
		c1.setModelo("BIC");
		//Acima utiliza-se o m�todo acessor (set), abaixo acessa-se diretamente o atributo. 
		//Pode-se usar das duas maneiras, por�m utilizando o acesso direto, se o atributo 
		//for privado dar� erro, sendo assim dever� ser utilizado o acessor.
		//c1.modelo = "BIC";
		
		c1.setPonta(0.5f);
		//Acima utiliza-se o m�todo acessor (set), abaixo acessa-se diretamente o atributo. 
		//Pode-se usar das duas maneiras, por�m utilizando o acesso direto, se o atributo 
		//for privado dar� erro, sendo assim dever� ser utilizado o acessor.
		//c1.ponta = 0.05f;
		
		//c1.status(); Pode-se utilizar o status, ou da maneira abaixo 
		//utilizando o get para pegar as informa��es da classe Caneta.
		
		System.out.println("Tenho uma caneta "+c1.getModelo()+" de ponta "+c1.getPonta());
	
	}

}
