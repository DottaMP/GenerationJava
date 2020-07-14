package LogicaDeProgramacao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProgramaçãoSequencial_imposto {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		double fabrica, custoConsumidor, distribuidor, imposto;
		System.out.println("Digite o valor do carro referente ao custo de fábrica: ");
		fabrica=ler.nextDouble();
		distribuidor = fabrica * 0.28;
		imposto = fabrica * 0.45;
		custoConsumidor = fabrica + distribuidor + imposto;
		System.out.println("O valor do carro para o consumidor é: R$ " + df.format(custoConsumidor));
	}
}
