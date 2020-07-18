package POO;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class CollectionsMap_Aluno {
	public static void main (String args[]){
		Map<String,CollectionsSet_Aluno> mapa = new TreeMap<String,CollectionsSet_Aluno>();
		
		CollectionsSet_Aluno a = new CollectionsSet_Aluno("João da Silva", "Java", 6.8);
		CollectionsSet_Aluno b = new CollectionsSet_Aluno("Maria Silva", "Linux", 7.8);
		CollectionsSet_Aluno c = new CollectionsSet_Aluno("Renata Almeida", "SO", 8.8);
		CollectionsSet_Aluno d = new CollectionsSet_Aluno("José Nascimento", "Internet", 5.5);
		
		mapa.put("João da Silva", a);
		mapa.put("Maria Silva", b);
		mapa.put("Renata Almeida", b);
		mapa.put("José Nascimento", d);
		
		System.out.println(mapa);
		System.out.println(mapa.get("Renata Almeida"));
		
		Collection<CollectionsSet_Aluno> alunos = mapa.values();
		for(CollectionsSet_Aluno e: alunos){
			System.out.println(e);
		}
		
	}
}
