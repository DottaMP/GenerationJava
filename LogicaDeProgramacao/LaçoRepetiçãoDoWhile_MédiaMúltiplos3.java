package LogicaDeProgramacao;
import java.util.*;
import java.text.DecimalFormat;
public class La�oRepeti��oDoWhile_M�diaM�ltiplos3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		int num;
		float media;
		double soma = 0, total = 0;
		do 
		{
			System.out.printf("Digite um n�mero inteiro: ");
			num = ler.nextInt();
			if (num % 3 == 0 && num != 0) 
			{
				soma = soma + num;
				total++;
			}
		} while (num != 0);
		media = (float) (soma / total);
		System.out.printf("A m�dia dos n�meros digitados e m�ltiplos de 3 �: "+df.format(media));
	}
}
