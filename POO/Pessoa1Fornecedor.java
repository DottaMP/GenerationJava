package POO;

public class Pessoa1Fornecedor extends Pessoa1{
	private float valorCredito;
	private float valorDivida;
	
	public float obterSaldo(){
		float saldo = this.getValorCredito()-this.getValorDivida();
		return saldo;
	}
	public float getValorCredito() {
		return this.valorCredito;
	}
	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}
	public float getValorDivida() {
		return this.valorDivida;
	}
	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}
}
