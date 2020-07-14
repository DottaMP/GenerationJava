package LogicaDeProgramacao;
import java.util.*;
public class LaçoCondicional_MaiorNúmero {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Informe o 1º número: ");
		num1 = ler.nextInt();
		System.out.println("Informe o 2º número: ");
		num2 = ler.nextInt();
		System.out.println("Informe o 3º número: ");
		num3 = ler.nextInt();
		if (num1>num2 && num1>num3)
		{
			System.out.println("O maior número digitado foi: "+num1);
		}
		else if (num2>num1 && num2>num3)
		{
			System.out.println("O maior número digitado foi: "+num2);
		}
		else
		{
			System.out.println("O maior número digitado foi: "+num3);
		}
	}
}
