package POO;

public class ContaBanco_Main {
	public static void main (String args[]){
		ContaBanco p1 = new ContaBanco(); //Instanciando um novo objeto (p1) a partir da classe ContaBanco.
		p1.setNumConta(123456);
		p1.setDono("Maria");
		p1.abrirConta("CC");
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(789456);
		p2.setDono("José");
		p2.abrirConta("CP");
		
		p1.depositar(100);
		p2.depositar(500);
		p2.sacar(100);
		
		p1.sacar(150);
		p1.fecharConta();
		
		p1.estadoAtual();
		p2.estadoAtual();
	}
}
