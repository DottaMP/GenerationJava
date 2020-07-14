package LogicaDeProgramacao;
import java.text.DecimalFormat;
import java.util.Scanner;
public class ProgramaçãoSequencial_MathPowMathSqrt {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		int x1, x2, y1, y2;
		double p1, p2,d;
		System.out.println("Escreva o valor de x1: ");
		x1=ler.nextInt();
		System.out.println("Escreva o valor de y1: ");
		y1=ler.nextInt();
		System.out.println("Escreva o valor de x2: ");
		x2=ler.nextInt();
		System.out.println("Escreva o valor de y2: ");
		y2=ler.nextInt();
		p1 = Math.pow((x2-x1),2);
		p2 = Math.pow((y2-y1),2);
		d = Math.sqrt(p1+p2);
		System.out.println("O Cálculo é: " + df.format(d));
	}
}
