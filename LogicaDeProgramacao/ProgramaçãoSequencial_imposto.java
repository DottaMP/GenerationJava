package LogicaDeProgramacao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Programa��oSequencial_imposto {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		double fabrica, custoConsumidor, distribuidor, imposto;
		System.out.println("Digite o valor do carro referente ao custo de f�brica: ");
		fabrica=ler.nextDouble();
		distribuidor = fabrica * 0.28;
		imposto = fabrica * 0.45;
		custoConsumidor = fabrica + distribuidor + imposto;
		System.out.println("O valor do carro para o consumidor �: R$ " + df.format(custoConsumidor));
	}
}
