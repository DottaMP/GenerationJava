package POO;

public class Pessoa2_Main {
	public static void main (String args[]){
		Pessoa2Visitante v1 = new Pessoa2Visitante();
		v1.setNome("José");
		v1.setIdade(35);
		v1.setSexo("M");
		System.out.println(v1.toString());
		
		Pessoa2Aluno a1 = new Pessoa2Aluno();
		a1.setNome("Mayara");
		a1.setMatricula(1234);
		a1.setCurso("Desenvolvimento de Sistemas");
		a1.setIdade(28);
		a1.setSexo("F");
		a1.pagarMensalidade();
		
		Pessoa2Bolsista b1 = new Pessoa2Bolsista();
		b1.setMatricula(9874);
		b1.setNome("Maria");
		b1.setBolsa(12.5f);
		b1.setSexo("F");
		b1.pagarMensalidade();
	}
}
