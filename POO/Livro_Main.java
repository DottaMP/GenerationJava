package POO;

public class Livro_Main {
	public static void main (String args[]){
		LivroPessoa[] p = new LivroPessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new LivroPessoa("Pedro", 22, "M");
		p[1] = new LivroPessoa("Maria", 25, "F");
		
		l[0] = new Livro("Desconstruindo o JAVA", "Luis Guerrero", 300, p[0]);
		l[1] = new Livro("Afinal, POO é difícil?", "Luis Guerrero", 270, p[1]);
		l[2] = new Livro("Lógica de programação com JAVA", "Luis Guerrero", 550, p[0]);
		
		l[0].abrir();
		l[0].folhear(100);
		l[0].avancarPag();
		System.out.println(l[0].detalhes());
		
	}
}
