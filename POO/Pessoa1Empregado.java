package POO;

public class Pessoa1Empregado extends Pessoa1{
	private int codSetor;
	private float salarioBase;
	private float imposto;
	
	public float obterSalario(){
		float salario = this.getSalarioBase()-(this.getImposto()*this.getSalarioBase()/100);
		return salario;
	}
	public int getCodSetor() {
		return this.codSetor;
	}
	public void setCodSetor(int codSetor) {
		this.codSetor = codSetor;
	}
	public float getSalarioBase() {
		return this.salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getImposto() {
		return this.imposto;
	}
	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
}
