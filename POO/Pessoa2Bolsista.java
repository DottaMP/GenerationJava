package POO;

public class Pessoa2Bolsista extends Pessoa2Aluno {
	private float bolsa;
	
	public void renovarBolsa(){
		System.out.println("Renovando bolsa do(a) aluno(a) ");
	}
	
	@Override
	public void pagarMensalidade(){
		System.out.println(this.getNome()+" é bolsista! Pagamento facilitado!");
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
}
