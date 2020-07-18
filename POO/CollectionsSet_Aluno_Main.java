package POO;

import java.util.HashSet;
import java.util.Set;

public class CollectionsSet_Aluno_Main {
	//Set não permite elementos duplicados
	
	public static void main (String args[]){
		Set<CollectionsSet_Aluno> conjunto = new HashSet<CollectionsSet_Aluno>();
		CollectionsSet_Aluno a = new CollectionsSet_Aluno("João da Silva", "Java", 6.8);
		CollectionsSet_Aluno b = new CollectionsSet_Aluno("Maria Silva", "Linux", 7.8);
		CollectionsSet_Aluno c = new CollectionsSet_Aluno("Renata Almeida", "SO", 8.8);
		CollectionsSet_Aluno d = new CollectionsSet_Aluno("José Nascimento", "Internet", 5.5);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		System.out.println(conjunto);
	}
}
