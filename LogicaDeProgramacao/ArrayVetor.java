package LogicaDeProgramacao;
import java.util.*;
public class ArrayVetor {
	public static void main(String args[]){
		Scanner ler = new Scanner (System.in);
		int opcao, c=1;
		float vet[] = new float[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("Entre com o %dº valor do vetor: ", c++);
			vet[i] = ler.nextFloat();
		}
		System.out.println("Digite as opções 0, 1 ou 2.");
		System.out.println("[0] Para finalizar o programa.");
		System.out.println("[1] Para mostrar o vetor na ordem direta.");
		System.out.println("[2] Para mostrar o vetor na ordem inversa.");
		System.out.print("Digite a opção desejada: ");
		opcao = ler.nextInt();
		
		if(opcao == 0)
			{
				System.out.print("Programa finalizado!");
			}
		else if(opcao == 1)
		{
			for (int i = 0; i<5;i++) 
			{
				System.out.printf(vet[i]+" ");
			}
		}
		else if(opcao == 2)
		{
			for (int i = 4; i>=0;i--) 
			{
				System.out.printf(vet[i]+" ");
			}
		}
		else
		{
			System.out.printf("Código inválido!");
		}
	}
}
