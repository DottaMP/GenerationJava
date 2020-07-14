package LogicaDeProgramacao;
import java.util.Scanner;
public class LaçoCondicional_OrdemCrescente_ComIfElse {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int a,b,c;
		System.out.println("Digite 3 números: ");
		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();
		//"%d, %d, %d ",a,b,c
		 if (a<b && b<c)
		 {
		 	System.out.printf("%d, %d, %d", a, b, c);
		 }
		 else if(a<c && c<b)
		 	{
		 		System.out.printf("%d, %d, %d ", a, c, b);
		 	}
		 	else if(b<a && a<c)
		 		{
		 			System.out.printf("%d, %d, %d ", b, a, c);
		 		}
		 		else if(b<c && c<a)
		 			{
		 				System.out.printf("%d, %d, %d ", b, c, a);
		 			}
		 			else if(c<a && a<b)
		 				{
		 					System.out.printf("%d, %d, %d ", c, a, b);
		 				}
		 				else
		 				{
		 					System.out.printf("%d, %d, %d ", c, b, a);
		 				}
	}
}

