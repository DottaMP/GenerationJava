package LogicaDeProgramacao;
import java.util.Scanner;
public class LaçoRepetiçãoWhile_Idade {
	//Solicitar a idade de várias pessoas e imprimir: 
	//Total de pessoas com menos de 21 anos. Total de 
	//pessoas com mais de 50 anos. O programa termina quando idade for =-99
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int idade=1,idade21=0,idade50=0;
	    while(idade !=- 99)
	    {
	    	System.out.print("Entre com a idade: ");
		    idade = ler.nextInt();
		    if(idade>0)
		    {
		    	if(idade<21)
		    	{
		    		idade21++;
		    	}
		    	else if(idade>50)
		    	{
		    		idade50++;
		    	}
		    }
	    }
		System.out.println("Temos: "+idade21+" pessoas com menos de 21 anos");
		System.out.println("Temos: "+idade50+" pessoas com com de 50 anos");
	}
}
