package beans;

public class Estoque extends Bolo{

	public Estoque(Cliente c, Bolo b) {

	}
	
	int nEncomendas;
	int nBolos;
	
	protected boolean verficaEstoque(Bolo b) {
		
		return true;
	}
	
	public void pararProducao(Bolo b) {
		
	}
}
