package LogicaDeProgramacao;
import java.text.DecimalFormat;
import java.util.*;
public class LaçoCondicional_ParOuImpar_MaisRaizOuPotencia {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		double num;
		System.out.println("Digite um número: ");
		num = ler.nextDouble();
		if(num%2==0)
		{
			System.out.println("Seu número é par!");
			num=Math.sqrt(num);
			System.out.println("Sua raiz quadrada é: "+df.format(num));
		}
		else 
		{
			System.out.println("Seu número é impar!");
			num=Math.pow(num, 2);
			System.out.println("Esse número elevado ao quadrado é: "+df.format(num));
		}
	}
}

