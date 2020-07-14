package LogicaDeProgramacao;
import java.util.*;
public class LaçoRepetiçãoDoWhile_Soma {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num, soma = 0;
		
		do 
		{
			System.out.printf("Digite um número: ");
			num = ler.nextInt();
			soma = soma + num;
		} while (num != 0);

		System.out.println("A soma dos números digitados é: " + soma);
		
	}

}
