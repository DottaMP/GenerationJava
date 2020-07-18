package POO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Collections2 {
	public static void main (String args[]){
		
		Collection<String> nomes = new ArrayList(); //Instanciando uma coleção de nomes com o arraylist
		nomes.add("Mario");
		nomes.add("Maria");
		nomes.add("Juliana");
		nomes.add("Rafaela");
		
		for (String name : nomes){//Para mostrar nome por nome que está na lista.
			System.out.println("Lista de nomes: "+name);
		}
		
		/*Collection<String> nomes2 = Arrays.asList("João", "Joana");//Para adicionar mais dados a list.
		nomes.addAll(nomes2);//Adicionando toda lista de nomes2 na lista de nomes1.
		System.out.println("Lista de nomes: "+nomes);*/
		
		//System.out.println("Lista de nomes: "+nomes); Mostra a lista dos nomes
		
		/*if (nomes.isEmpty()){//Verifica se tem algum campo dentro do List vazio, dando retorno de true ou false
			System.out.println("Lista Vazia..."); //Se a lista estiver vazia irá retornar essa frase.
		}else{
			System.out.println("Lista de nome: "+nomes);
		}*/
		
		/*System.out.println("Lista de nomes: "+nomes);
		nomes.remove("Mario"); //Para remover algum nome dentro da list.
		System.out.println("Lista de nomes: "+nomes);*/
		
		/*System.out.println("Lista de nomes: "+nomes);
		nomes.clear(); //Para apagar os dados da List.
		System.out.println("Lista de nomes: "+nomes);*/
		
		/*System.out.println("Contém o nome Maria? "+nomes.contains("Maria")); //Para verificar se determinado dado contém na list.
		System.out.println("Lista "+nomes);*/
		
		
	}
}
