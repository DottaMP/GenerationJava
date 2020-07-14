package LogicaDeProgramacao;

import java.util.Scanner;

public class La�oCondicional_Calculando2N�meros {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		float num1,num2,resultado;
		int op��o;
		System.out.println("Entre com o primeiro n�mero: ");
		num1=ler.nextFloat();
		System.out.println("Entre com o segundo n�mero: ");
		num2=ler.nextFloat();
		System.out.println("\nEscolha umas das op��es para resolver: 1-Soma 2-Diferen�a 3-Multiplica��o 4-Divis�o\n");
		op��o=ler.nextInt();
		switch(op��o)
		{
			case 1:
				resultado=num1+num2;
				System.out.println("A soma foi de: "+resultado);
				break;
			case 2:
				resultado=num1-num2;
				System.out.println("A diferen�a foi de: "+resultado);
				break;
			case 3:
				resultado=num1*num2;
				System.out.println("A multiplica��o foi de: "+resultado);
				break;
			case 4:
				if(num2==0)
				{
					System.out.println("N�o existe divis�o por zero!");
				}
				else
				{
					resultado=num1/num2;
					System.out.println("A divis�o foi de: "+resultado);
				}
				break;
			default:
				System.out.println("Op��o Inv�lida");
		}
	}
}
