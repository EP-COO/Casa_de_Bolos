
package beans;

import java.util.Date;

public class Pedido extends Bolo {
    
    //Atributos da classe
    private Cliente cliente;
    private BoloSimples boloS;
    private BoloEspecial boloE;
    private int nEncomenda;
    private boolean delivery;
    private static boolean indicado;
	private static double precoTotalSimples;
	private static double precoTotalEspecial;
    //Construtor

	public static double getPrecoTotalSimples() {
		return precoTotalSimples;
	}
	
	public void setPrecoTotalSimples(double precoTotal) {
		this.precoTotalSimples = BoloSimples.getPrecoQuilo()*getPeso();
	}
	
	public static double getPrecoTotalEspecial() {
		return precoTotalEspecial;
	}
	
	public void setPrecoTotalEspecial(double precoTotal) {
		this.precoTotalEspecial = BoloEspecial.getPrecoQuilo()*getPeso();
	}
	
	public Pedido(Cliente cliente, BoloEspecial boloEspecial, int quantidade, boolean indicado, boolean delivery,
			int codigo) {
		this.boloE = boloEspecial;
		if (boloEspecial.quantidade_estoque > 0) {
			prontaEntrega();
		}
		else { encomenda(); }
	}
	public Pedido(Cliente cliente, BoloSimples boloSimples, int quantidade, boolean indicado, boolean delivery,
			int codigo) {
		this.boloS = boloSimples;
		if (boloSimples.quantidade_estoque > 0) {
			prontaEntrega();
		}
		else { encomenda(); }
	}

	public static boolean isIndicado() {
		return indicado;
	}
	
	public void setIndicado(boolean indicado) {
		this.indicado = indicado;
	}

	public Object getBoloSimples() {
		return boloS;
	}
	
	public Object getBoloEspecial() {
		return boloE;
	}

	public boolean isDelivery() {
		return delivery;
	}
	
	public void setDelivery(boolean delivery) {
		this.delivery = delivery;
	}
	
	public void encomenda() {
		
	}
	
	public void prontaEntrega() {
		
	}
    
	public void verificaMes() {
		
	}
    
    public static double calculaTotalSimples() {
		return precoTotalSimples;
    }
    
    public static double calculaTotalEspecial() {
		return precoTotalEspecial;
    }
    
}