package LogicaDeProgramacao;
import java.util. *;
public class ArrayVetor_Modificando {
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] A = {1, 0, 5, -2, -5, 7};
		int soma=0, i=0;
		soma = A[0] + A[1] + A[5]; //1+0+7=8
		System.out.println("A soma entre os valores das posições A[0], A[1] e A[5] é: "+soma);
		for (i=0; i<A.length;i++)
		{
			A[4]=100;
		}
		System.out.println("Os valores de cada posição do vetor é:");
		System.out.println(A[0]);
		System.out.println(A[1]);
		System.out.println(A[2]);
		System.out.println(A[3]);
		System.out.println(A[4]);
		System.out.println(A[5]);
	}
}
