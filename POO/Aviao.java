package POO;

public class Aviao 
{

	private String cia;
	private String escalaVoo;
	private boolean statusVoo;

	public Aviao(String ciaAerea, String escala, boolean status) 
	{
		cia = ciaAerea;
		escalaVoo = escala;
		statusVoo = status;
	}
	public String dadosVoo() 
	{
		String dados = "Companhia Aérea:" + cia + "Possui escala?:" + escalaVoo;
		return dados;
	}

	public String Status() 
	{
		String Status;
		if (statusVoo == true) {
			Status = "Decolagem realizada";
		} else {
			Status = "Aguardando decolagem";
		}
		return Status;
	}
}