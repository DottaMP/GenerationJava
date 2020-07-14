package POO;

public class ControladorRemoto implements Controlador{
	//Atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//Métodos Especiais
	public ControladorRemoto(){
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	public int getVolume() {
		return this.volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean getLigado() {
		return this.ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean getTocando() {
		return this.tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	//Métodos Abstratos
	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado (false);
	}

	@Override
	public void abrirMenu() {
		System.out.println("Está ligado? "+this.getLigado());
		System.out.println("Está tocando? "+this.getTocando());
		System.out.print("Volume: "+this.getVolume());
		for (int i=0; i<=this.getVolume();i++){ //Utilizamos o for para mostrar os "pausinhos" do volume
			System.out.print("|");			  //aumentando ou diminuindo...
		}
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu.");	
	}

	@Override
	public void maisVolume() { //Para aumentar o volume primeiro precisa verificar se o aparelho está ligado...
		if (this.getLigado()){
			this.setVolume(this.getVolume()+1);
		}
	}

	@Override
	public void menosVolume() { //Para aumentar o volume primeiro precisa verificar se o aparelho está ligado...
		if (this.getLigado()){
			this.setVolume(this.getVolume()-1);
		}
	}

	@Override
	public void ligarMudo() { //Para colocar no mudo, precisa estar ligado e o volume acima do que 0.
		if (this.getLigado() && this.getVolume()>0){
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {//Para tirar no mudo, precisa estar ligado e o volume no 0.
		if (this.getLigado() && this.getVolume()==0){
			this.setVolume(50); //Volume vai para 50 depois de sair no mudo.
		}
	}

	@Override
	public void play() { //Para dar o play o aparelho precisa estar ligado e NÃO pode já estar tocando.
		if (this.getLigado() && ! (this.getTocando())){
			this.setTocando(true);
		}
	}

	@Override
	public void pause() { //Para dar pause o aparelho precisa estar ligado e tocando.
		if (this.getLigado() && this.getTocando()){
			this.setTocando(false);
		}
	}
}
