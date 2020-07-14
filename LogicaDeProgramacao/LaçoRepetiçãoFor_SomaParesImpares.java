package LogicaDeProgramacao;
import java.util.*;
public class LaçoRepetiçãoFor_SomaParesImpares {
	public static void main (String args[])
	{//Ler 10 números e imprimir quantos são pares e quantos são ímpares.
		Scanner ler = new Scanner (System.in);
		int num,x,somaPar=0,somaImpar=0;
		for(x=1;x<=10;x++)
		{
			System.out.printf("Entre com um número: ");
			num=ler.nextInt();
			if(num%2==0)
			{
				somaPar++;
			}
			else
			{
				somaImpar++;
			}
		}
		System.out.println("Temos: "+somaPar+" número(s) par(es)");
		System.out.println("Temos: "+somaImpar+" número(s) impar(es)");
	}
}
