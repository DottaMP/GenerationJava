package LogicaDeProgramacao;
import java.util.*;
public class Calcule_SwitchCase {
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		double valor;
		System.out.print("Digite um valor: ");
		valor = ler.nextDouble();
		
		System.out.println("Escolha a forma de pagamento: ");
		System.out.println("[1] - Para pagamento à vista em dinheiro ou cheque: ");//20% de desconto 
		System.out.println("[2] - Para pagamento à vista no cartão de crédito: ");//15% de desconto 
		System.out.println("[3] - Para pagamento parcelado em 2x: ");//normal
		System.out.println("[4] - Para pagamento parcelado em 3x: ");//juros de 10%
		System.out.print("Digite a opção desejada: ");
		int opcao = ler.nextInt();
		
		switch (opcao){
		
		case 1:
			double desconto1=0;
			desconto1 = 0.20*valor;
			valor=valor-desconto1;
			System.out.printf("\nVocê recebeu R$ "+String.format("%.2f",desconto1)+" de desconto. E vai pagar R$ "
			+String.format("%.2f",valor)+".");
			break;
			
		case 2:
			double desconto2=0;
			desconto2 = 0.15*valor;
			valor=valor-desconto2;
			System.out.printf("\nVocê recebeu R$ "+String.format("%.2f",desconto2)+" de desconto. E vai pagar R$ "
			+String.format("%.2f",valor)+".");
			break;
			
		case 3:
			double parcela1=0;
			parcela1=valor/2;
			System.out.printf("\nVocê vai pagar 2 parcelas de R$ "+String.format("%.2f",parcela1)+". Totalizando R$ "
					+String.format("%.2f",valor)+".");
			break;
			
		case 4:
			double juros=0,parcela2;
			juros=(valor*0.10);
			valor=valor+juros;
			parcela2=valor/3;
			System.out.printf("\nVocê vai pagar 3 parcelas de R$ "+String.format("%.2f",parcela2)+". Totalizando R$ "
					+String.format("%.2f",valor)+".");
			break;
			
		default:
			System.out.printf("Você digitou uma opção inválida, por gentileza, tente novamente!");
		}
	}
}
