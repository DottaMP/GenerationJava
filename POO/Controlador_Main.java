package POO;

public class Controlador_Main {
	public static void main (String args []){
	ControladorRemoto c = new ControladorRemoto();
	c.ligar();
	c.maisVolume();
	c.ligarMudo();
	c.abrirMenu();
	c.fecharMenu();
	
	}
}
