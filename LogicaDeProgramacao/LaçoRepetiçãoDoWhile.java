package LogicaDeProgramacao;

import java.util.Scanner;

public class LaçoRepetiçãoDoWhile {
	public static void main (String args[])
	{	
		Scanner ler = new Scanner (System.in);
		int idade,maior=0,menor=0;
		System.out.println("Entre com a sua idade: ");
		idade=ler.nextInt();
		
		do
		{
			if(idade>=18)
			{
				maior++;
			}
			else
			{
				menor++;
			}
			System.out.printf("\nIdade que digitei: %d\n",idade);
			System.out.println("Entre com a sua idade: ");
			idade=ler.nextInt();
		}while(idade!=0);
		
		System.out.println("Temos: "+maior+" pessoa(s) maior de idade");
		System.out.println("Temos: "+menor+" pessoa(s) menor de idade");
	}
}
