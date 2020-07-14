package LogicaDeProgramacao;
import java.util.*;
public class Array_VetorMultiplicaMatriz {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] vet = new int[3];
		int[][] mat = new int[3][3];
		int x = 1;
		
		System.out.println("Digite os valores do vetor");
		for (int i = 0; i < 3; i++) 
		{
			System.out.printf("Entre com o valor da %dª posição: ", x++);
			vet[i] = ler.nextInt();			
		}
		
		System.out.println("\nDigite os valores da matriz");
		for (int l = 0; l < 3; l++) 
		{
			for (int c = 0; c < 3; c++) 
			{
				System.out.printf("Entre com o valor da posição [%d][%d]: ", l, c);
				mat[l][c] = ler.nextInt();		
			}
			System.out.println();
		}
		
		for (int l = 0; l < 3; l++) 
		{
			System.out.println("");
			for (int c = 0; c < 3; c++) 
			{
				System.out.print(mat[l][c] * vet[c] + "  ");
			}
		}
	}
}
