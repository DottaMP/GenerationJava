package POO;

public class Lutador_Main {
	public static void main (String args[]){
		Lutador l[] = new Lutador [6];
		
		l[0] = new Lutador("Dominic", "Fran�a", 31, 1.75f, 68.9f, 11, 2, 1);
		l[1] = new Lutador("Jo�o", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
		l[2] = new Lutador("Brian", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
		l[3] = new Lutador("Jack", "Austr�lia", 28, 1.93f, 81.6f, 13, 0, 2);
		l[4] = new Lutador("Manuel", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
		l[5] = new Lutador("Jay", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
		
		l[3].status();
	}
}
