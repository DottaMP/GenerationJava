package POO;

public class Caneta_Main {
	public static void main (String ar[])
	{
  //Abaixo estamos instanciando, criando um objeto (c1) a partir da classe criada (Caneta).
  //Classe objeto = new classe();
		Caneta c1 = new Caneta();
		
	//métodos Setters e Getters protegem o atributo, não realizando o acesso direto a eles.
		
		c1.setModelo("BIC");
		//Acima utiliza-se o método acessor (set), abaixo acessa-se diretamente o atributo. 
		//Pode-se usar das duas maneiras, porém utilizando o acesso direto, se o atributo 
		//for privado dará erro, sendo assim deverá ser utilizado o acessor.
		//c1.modelo = "BIC";
		
		c1.setPonta(0.5f);
		//Acima utiliza-se o método acessor (set), abaixo acessa-se diretamente o atributo. 
		//Pode-se usar das duas maneiras, porém utilizando o acesso direto, se o atributo 
		//for privado dará erro, sendo assim deverá ser utilizado o acessor.
		//c1.ponta = 0.05f;
		
		//c1.status(); Pode-se utilizar o status, ou da maneira abaixo 
		//utilizando o get para pegar as informações da classe Caneta.
		
		System.out.println("Tenho uma caneta "+c1.getModelo()+" de ponta "+c1.getPonta());
	
	}

}
