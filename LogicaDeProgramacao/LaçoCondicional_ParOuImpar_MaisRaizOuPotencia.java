package LogicaDeProgramacao;
import java.text.DecimalFormat;
import java.util.*;
public class La�oCondicional_ParOuImpar_MaisRaizOuPotencia {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		double num;
		System.out.println("Digite um n�mero: ");
		num = ler.nextDouble();
		if(num%2==0)
		{
			System.out.println("Seu n�mero � par!");
			num=Math.sqrt(num);
			System.out.println("Sua raiz quadrada �: "+df.format(num));
		}
		else 
		{
			System.out.println("Seu n�mero � impar!");
			num=Math.pow(num, 2);
			System.out.println("Esse n�mero elevado ao quadrado �: "+df.format(num));
		}
	}
}

