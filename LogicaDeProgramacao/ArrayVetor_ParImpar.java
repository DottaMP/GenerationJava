package LogicaDeProgramacao;
import java.util.*;
public class ArrayVetor_ParImpar {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N, somaPares=0, ttlImpar=0;
		System.out.print("Quantos numeros voce vai digitar? ");
		N = sc.nextInt();
		int[] vet = new int[N];
		for (int i = 0; i<vet.length;i++) 
		{
			System.out.print("Digite os números: ");
			vet[i] = sc.nextInt();
			if(vet[i]%2==0)
			{
				somaPares = somaPares+vet[i];
			}
			else
			{
				ttlImpar++;
			}
		}
		System.out.print("\nNúmeros pares digitados: ");		
		for (int i : vet) 
		{
			if (i % 2 == 0) 
			{
					System.out.print("\n"+i);
			}
		}
		System.out.print("\nSoma pares: "+somaPares);
		
		System.out.printf("\nNúmeros ímpares digitados: ");		
		for (int i : vet) 
		{
			if (i % 2 != 0) 
			{
					System.out.print("\n"+i);
			}
		}
		System.out.println("\nQuantidade de números ímpares digitados: "+ttlImpar);
	}
}
