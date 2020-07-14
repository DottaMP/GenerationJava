package LogicaDeProgramacao;
import java.util.Scanner;
public class ProgramaçãoSequencial_IdadeEmDias {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int idade, mes, dias, diasTotal, mesTotal, diasRestante, total;
		System.out.println("Digite a sua idade em anos: ");
		idade = ler.nextInt();
		System.out.println("Digite seus meses: ");
		mes = ler.nextInt();
		System.out.println("Digite seus dias: ");
		dias = ler.nextInt();
		diasTotal=idade*365;
		mesTotal=mes*30;
		diasRestante = mesTotal + dias;
		total = diasTotal + diasRestante;
		System.out.print("A minha idade em dias é: ");
		System.out.println(total);
	}
}
