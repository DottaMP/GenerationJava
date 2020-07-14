package LogicaDeProgramacao;
import java.util.*;
public class LaçoRepetiçãoWhile_Média {
	public static void main (String args[])
	{//media de valores lidos de 50 até 100
		
		Scanner ler = new Scanner (System.in);
		int valor=50,somaValor=0,cont=0,valor1,somaValor1=0;
		float media,media1;
		
		while(valor<=100)
		{
			System.out.println("Entre com um valor: ");
			valor1=ler.nextInt();
			somaValor1=somaValor1+valor1;
			somaValor=somaValor+valor;
			valor++;
			cont++;
		}
		media=somaValor/cont;
		media1=somaValor1/cont;
		
		System.out.println("Média de valores lidos: "+media);
		System.out.println("Média de valores lidos: "+media1);
	}
}
