package POO;

public class Pessoa1_Main {
	public static void main (String args[]){
		/*Dados Fornecedor
		Pessoa1Fornecedor f = new Pessoa1Fornecedor();
		f.setNome("Maria");
		System.out.println(f.getNome());
		f.setEndereco("Av dos Estados,1300");
		System.out.println(f.getEndereco());
		f.setTelefone("2222-2444");
		System.out.println("Telefone: "+f.getTelefone());
		System.out.println(f.toString());
		f.setValorCredito(1500);
		f.setValorDivida(1000);
		System.out.println("O saldo atual é: "+f.obterSaldo());*/
		
		//*Dados Empregado
		Pessoa1Empregado e = new Pessoa1Empregado();
		e.setNome("José");
		System.out.println(e.getNome());
		e.setEndereco("Av dos Estados,1500");
		System.out.println(e.getEndereco());
		e.setTelefone("3333-2488");
		System.out.println("Telefone: "+e.getTelefone());
		System.out.println(e.toString());
		e.setCodSetor(1234);
		e.setSalarioBase(1000);
		e.setImposto(10);
		System.out.println("O Salário líquido é: R$ "+String.format("%.2f",e.obterSalario()));
	}
}