package LogicaDeProgramacao;
import java.util.*;
public class LerEmIntervalos {
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		int num,cont1=0, cont2=0, cont3=0, cont4=0;
		System.out.print("Digite um número: ");
		num = ler.nextInt();
		
		while(num>0){
			if(num>=0 &&num <=25){
				cont1++;
				System.out.print("Digite um número: ");
				num = ler.nextInt();
			}
			if(num>=26 &&num <=50){
				cont2++;
				System.out.print("Digite um número: ");
				num = ler.nextInt();
			}
			if(num>=51 &&num <=75){
				cont3++;
				System.out.print("Digite um número: ");
				num = ler.nextInt();
			}
			if(num>=76 &&num <=100){
				cont4++;
				System.out.print("Digite um número: ");
				num = ler.nextInt();
			}
			if(num>100){
				System.out.print("Digite um número: ");
				num = ler.nextInt();
			}
		}
		System.out.println("Quantidade de números no intervalo de [0-25]: "+cont1);
		System.out.println("Quantidade de números no intervalo de [26-50]: "+cont2);
		System.out.println("Quantidade de números no intervalo de [51-75]: "+cont3);
		System.out.println("Quantidade de números no intervalo de [76-100]: "+cont4);
	}
}
