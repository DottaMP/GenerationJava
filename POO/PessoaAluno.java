package POO;

public class PessoaAluno extends Pessoa{
	private int mat;
	private String curso;
	
	public void cancelarMatr(){
		System.out.println("Matricula será cancelada");
	}

	public int getMat() {
		return this.mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public String getCurso() {
		return this.curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
