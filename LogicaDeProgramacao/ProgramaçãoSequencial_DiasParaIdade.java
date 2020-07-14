package LogicaDeProgramacao;
import java.util.Scanner;
public class ProgramaçãoSequencial_DiasParaIdade {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int idade,anos,mes,dias,resto;
		System.out.println("Digite sua idade em quantidade de dias: ");
		idade = ler.nextInt();
		anos = idade / 365;
		resto = idade % 365;
		mes = resto / 30;
		dias = resto % 30;
		System.out.print(anos + " ano(s) " + mes + " mês(es) " + dias + " dia(s)");
	}
}


