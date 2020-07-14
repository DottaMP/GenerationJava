package LogicaDeProgramacao;
import java.text.DecimalFormat;
import java.util.Scanner;
public class ProgramaçãoSequencial_MathPow {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		int A, B, C;
		double D, R, S;
		System.out.println("Informe o valor de A: ");
		A=ler.nextInt();
		System.out.println("Informe o valor de B: ");
		B=ler.nextInt();
		System.out.println("Informe o valor de C: ");
		C=ler.nextInt();
		R=Math.pow((A+B),2);
		S=Math.pow((B+C),2);
		D=(R+S)/2;
		System.out.println("O valor de D foi: " + df.format(D));
	}
}

