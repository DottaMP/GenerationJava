package LogicaDeProgramacao;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Programa��oSequencial_M�diaNotas {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		double nota1, nota2, nota3, media, ponderada1, ponderada2, ponderada3;
		System.out.println("Digite a 1� nota: ");
		nota1=ler.nextDouble();
		System.out.println("Digite a 2� nota: ");
		nota2=ler.nextDouble();
		System.out.println("Digite a 3� nota: ");
		nota3=ler.nextDouble();
		ponderada1 = nota1*2;
		ponderada2 = nota2*3;
		ponderada3 = nota3*5;
		media=((ponderada1 + ponderada2 + ponderada3) / 10);
		System.out.println("A m�dia �: " + df.format(media));
	}
}
