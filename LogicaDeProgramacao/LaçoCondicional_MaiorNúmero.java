package LogicaDeProgramacao;
import java.util.*;
public class La�oCondicional_MaiorN�mero {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Informe o 1� n�mero: ");
		num1 = ler.nextInt();
		System.out.println("Informe o 2� n�mero: ");
		num2 = ler.nextInt();
		System.out.println("Informe o 3� n�mero: ");
		num3 = ler.nextInt();
		if (num1>num2 && num1>num3)
		{
			System.out.println("O maior n�mero digitado foi: "+num1);
		}
		else if (num2>num1 && num2>num3)
		{
			System.out.println("O maior n�mero digitado foi: "+num2);
		}
		else
		{
			System.out.println("O maior n�mero digitado foi: "+num3);
		}
	}
}
