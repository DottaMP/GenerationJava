package POO;

public class Caneta {
	public String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;
	
	public Caneta(){ // Este é o método construtor, leva o 
		//mesmo nome da classe. Pode-se colocar os atributos dentro do (). Porém esses mesmos atributos 
		//deverão ser declarados dentro dos () no instanciamento do objeto.
		this.tampar();
		this.cor = "Azul";
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public void tampar(){
		this.tampada = true;
	}
	
	public void destampar(){
		this.tampada = false;
	}
	
	public void status(){
		System.out.println("Sobre a caneta: ");
		
		//System.out.println("Modelo: "+this.modelo); 
		//pode-se usar tanto a forma acima quanto a debaixo. Utilizando o get, pode-se acessar o modelo privado.
		System.out.println("Modelo: "+this.getModelo());
		
		//System.out.println("Ponta: "+this.ponta);
		//pode-se usar tanto a forma acima quanto a debaixo. Utilizando o get, pode-se acessar a ponta privada.
		System.out.println("Ponta: "+this.getPonta());
		
		System.out.println("Cor: "+this.cor);
		System.out.println("Tampada: "+this.tampada);
	}
}
