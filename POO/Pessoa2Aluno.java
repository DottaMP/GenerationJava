package POO;

public class Pessoa2Aluno extends Pessoa2 {
	//Aluno � uma especializa��o de Pessoa2 e 
	//Pessoa2 � uma generaliza��o de Aluno.
	private int matricula;
	private String curso;
	
	public void pagarMensalidade(){
		System.out.println("Pagando mensalidade do(a) aluno(a) "+this.getNome());
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
