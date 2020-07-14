package LogicaDeProgramacao;
import java.util.Scanner;
public class LaçoCondicional_NúmeroPositivoOuNegativo {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int num;
		System.out.println("Entre com um número: ");
		num = ler.nextInt();
		if(num>0)
		{
			System.out.println("Número positivo!");
		}
		else if(num<0)
			{
				System.out.println("Número negativo!");
			}
		else 
			{
				System.out.println("É zero!");
			}
	}
}
