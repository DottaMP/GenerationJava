package LogicaDeProgramacao;
import java.util.*;
public class La�oRepeti��oFor_SomaParesImpares {
	public static void main (String args[])
	{//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
		Scanner ler = new Scanner (System.in);
		int num,x,somaPar=0,somaImpar=0;
		for(x=1;x<=10;x++)
		{
			System.out.printf("Entre com um n�mero: ");
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
		System.out.println("Temos: "+somaPar+" n�mero(s) par(es)");
		System.out.println("Temos: "+somaImpar+" n�mero(s) impar(es)");
	}
}
