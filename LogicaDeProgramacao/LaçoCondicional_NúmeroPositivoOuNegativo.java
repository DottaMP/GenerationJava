package LogicaDeProgramacao;
import java.util.Scanner;
public class La�oCondicional_N�meroPositivoOuNegativo {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int num;
		System.out.println("Entre com um n�mero: ");
		num = ler.nextInt();
		if(num>0)
		{
			System.out.println("N�mero positivo!");
		}
		else if(num<0)
			{
				System.out.println("N�mero negativo!");
			}
		else 
			{
				System.out.println("� zero!");
			}
	}
}
