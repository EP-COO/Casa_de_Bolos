package beans;

import java.util.Date;

public class NakedCake extends Bolos{

	private String cobertura;
	private int camadas;
	
	
	public NakedCake(int codigo, int qtd_estoque, String sabor, double preco, int quantidade, double horasProducao,
			Date validade, String cobertura, int camadas) {
		super(codigo, qtd_estoque, sabor, preco, quantidade, horasProducao, validade);
		this.cobertura = cobertura;
		this.camadas = camadas;
	}


	public String getCobertura() {
		return cobertura;
	}


	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}


	public int getCamadas() {
		return camadas;
	}


	public void setCamadas(int camadas) {
		this.camadas = camadas;
	}

	
}
