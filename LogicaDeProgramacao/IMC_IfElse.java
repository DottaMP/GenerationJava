package LogicaDeProgramacao;
import java.util.*;
import java.util.Scanner;
public class IMC_IfElse {
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		double peso, altura,imc;
		
		System.out.println("Digite seu peso: ");
		peso = ler.nextDouble();
		System.out.println("Digite sua altura: ");
		altura = ler.nextDouble();
		imc = peso/(Math.pow(altura,2));
		
		if(imc < 18.5)
		{
			System.out.printf("Seu IMC � de "+String.format("%.2f",imc)+". Voc� est� abaixo do peso.");
		}
		else if(imc > 18.5 && imc < 25)
		{
			System.out.println("Seu IMC � de "+String.format("%.2f",imc)+". Voc� est� com o peso normal.");
		}
		else if(imc >= 25 && imc < 30)
		{
			System.out.println("Seu IMC � de "+String.format("%.2f",imc)+". Voc� est� acima do peso.");
		}
		else
		{
			System.out.println("Seu IMC � de "+String.format("%.2f",imc)+". Voc� est� na faixa de obesidade.");
		}
	}
}
