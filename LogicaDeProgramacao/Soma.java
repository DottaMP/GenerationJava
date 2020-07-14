package LogicaDeProgramacao;
import java.util.*;
public class Soma {
	public static void main(String args[]){

		float x=1, y=1, soma=0;
		
		while(x <= 99 && y <= 50)
		{
			soma+=x/y;
			x+=2;
			y++;
		}
		System.out.print("Resultado soma: "+soma);
	}
}
