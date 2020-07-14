package LogicaDeProgramacao;
import java.util.*;
public class ArrayMatriz_Maior {
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		int maior = 0;
		Scanner sc = new Scanner(System.in);
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.printf("Digite o valor da posição [%d][%d]: ",  l, c);
				matriz[l][c] = sc.nextInt();
				if (matriz[l][c] > 10) {
					maior++;
				}
			}
		}
		System.out.printf("A quantidade de elementaos maiores que 10 que a Matriz possui são: %d", maior);	
	}
}
