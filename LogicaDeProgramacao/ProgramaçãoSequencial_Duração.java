package LogicaDeProgramacao;
import java.util.Scanner;
public class Programa��oSequencial_Dura��o {
	public static void main(String args[])
	{
		Scanner ler = new Scanner (System.in);
		int duracao, horas, resto, minutos, segundos;
		System.out.println("Digite a dura��o em segundos: ");
		duracao = ler.nextInt();
		horas = duracao / 3600;
		resto = duracao % 3600;
		minutos = resto / 60;
		segundos = resto % 60;
		System.out.print(horas + " hora(s) " + minutos + " minuto(s) " + segundos + " segundo(s)");
		System.out.println("\nou");
		System.out.print(horas + ":" + minutos + ":" + segundos);
	}
}
