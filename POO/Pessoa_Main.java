package POO;

public class Pessoa_Main {
	public static void main (String args[]){
		//Programa Principal
		Pessoa p1 = new Pessoa();
		PessoaAluno p2 = new PessoaAluno();
		PessoaProfessor p3 = new PessoaProfessor();
		PessoaFuncionario p4 = new PessoaFuncionario();
		
		p1.setNome("João");
		p2.setNome("Maria");
		p3.setNome("Mariana");
		p4.setNome("Lucas");
		
		p1.setSexo("M");
		p3.setSexo("F");
		p2.setIdade(18);
		
		p2.setCurso("Informática");
		p3.setSalario(300.00f);
		p4.setSetor("Estoque");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}
}
