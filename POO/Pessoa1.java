package POO;

public class Pessoa1 {
	private String nome;
	private String endereco;
	private String telefone;
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return this.endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return this.telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Pessoa1(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	public Pessoa1(String nome) {
		this.nome = nome;
	}
	public Pessoa1() {
	}
	
	@Override
	public String toString() {
		return "Pessoa1 [nome=" + nome + ", endereco=" + endereco
				+ ", telefone=" + telefone + "]";
	}
	
}

