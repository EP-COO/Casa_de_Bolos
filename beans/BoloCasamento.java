package beans;

import java.util.Date;

public class BoloCasamento extends Bolos{

	private int andares;
	private String recheio;
	private String cobertura;
	private boolean enfeite;
	
	public BoloCasamento(int codigo, int qtd_estoque, String sabor, double preco, int quantidade, double horasProducao,
			Date validade, int andares, String recheio, String cobertura, boolean enfeite) {
		super(codigo, qtd_estoque, sabor, preco, quantidade, horasProducao, validade);
		this.andares = andares;
		this.recheio = recheio;
		this.cobertura = cobertura;
		this.enfeite = enfeite;
	}

	public int getAndares() {
		return andares;
	}

	public void setAndares(int camadas) {
		this.andares = camadas;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

	public boolean isEnfeite() {
		return enfeite;
	}

	public void setEnfeite(boolean enfeite) {
		this.enfeite = enfeite;
	}

}
