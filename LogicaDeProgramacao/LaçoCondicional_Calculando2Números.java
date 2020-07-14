package LogicaDeProgramacao;

import java.util.Scanner;

public class LaçoCondicional_Calculando2Números {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		float num1,num2,resultado;
		int opção;
		System.out.println("Entre com o primeiro número: ");
		num1=ler.nextFloat();
		System.out.println("Entre com o segundo número: ");
		num2=ler.nextFloat();
		System.out.println("\nEscolha umas das opções para resolver: 1-Soma 2-Diferença 3-Multiplicação 4-Divisão\n");
		opção=ler.nextInt();
		switch(opção)
		{
			case 1:
				resultado=num1+num2;
				System.out.println("A soma foi de: "+resultado);
				break;
			case 2:
				resultado=num1-num2;
				System.out.println("A diferença foi de: "+resultado);
				break;
			case 3:
				resultado=num1*num2;
				System.out.println("A multiplicação foi de: "+resultado);
				break;
			case 4:
				if(num2==0)
				{
					System.out.println("Não existe divisão por zero!");
				}
				else
				{
					resultado=num1/num2;
					System.out.println("A divisão foi de: "+resultado);
				}
				break;
			default:
				System.out.println("Opção Inválida");
		}
	}
}
