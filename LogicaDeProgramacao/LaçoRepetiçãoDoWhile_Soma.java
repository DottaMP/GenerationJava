package LogicaDeProgramacao;
import java.util.*;
public class La�oRepeti��oDoWhile_Soma {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num, soma = 0;
		
		do 
		{
			System.out.printf("Digite um n�mero: ");
			num = ler.nextInt();
			soma = soma + num;
		} while (num != 0);

		System.out.println("A soma dos n�meros digitados �: " + soma);
		
	}

}
