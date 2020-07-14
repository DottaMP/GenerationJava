package LogicaDeProgramacao;
import java.util.*;
public class LaçoRepetiçãoWhile_CaracteriscasPsico {
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int i = 0, idade, opcao, sexo, totalCalmos = 0, homensAgressivos = 0, mulheresNervosas = 0, nervososMais40 = 0, calmosMenos18 = 0;
		while (i < 150) 
		{
			i++;
			System.out.printf("Entre com sua idade: ");
			idade = ler.nextInt();
			System.out.printf("\nDigite 1 para feminino ou 2 para masculino: ");
			sexo = ler.nextInt();
			System.out.println("\nEntre com sua característica");
			System.out.println("1 para calmo/a");
			System.out.println("2 para nervoso/a");
			System.out.println("3 para agressivo/a");
			opcao = ler.nextInt();
			
			if (opcao == 1) 
			{
				totalCalmos++;	
			};
			if(idade < 18) 
			{
				calmosMenos18++;
			}
			if (sexo == 1 && opcao == 2) 
			{
				mulheresNervosas++;
			}
			if (sexo == 2 && opcao == 3) 
			{
				homensAgressivos++;
			} 
			 if (opcao == 2 && idade > 40) 
			{
				nervososMais40++;
			}			
		}
		System.out.println("\nResultado da pesquisa \n");
		System.out.println("Total de pessoas calmas: " + totalCalmos);
		System.out.println("Total de mulheres nervosas: " + mulheresNervosas);
		System.out.println("Total de homens agressivos: " + homensAgressivos);
		System.out.println("Total de pessoas nervosas com mais de 40 anos: " + nervososMais40);
		System.out.println("Total de pessoas calmas com menos de 18 anos: " + calmosMenos18);
	}
}
