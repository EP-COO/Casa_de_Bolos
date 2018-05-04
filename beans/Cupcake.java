package beans;

import java.util.Date;

public class Cupcake extends Bolos {

	private String cobertura;
	private String recheio;
	private String embalagem;
	
	public Cupcake(int codigo, int qtd_estoque, String sabor, double preco, int quantidade, double horasProducao,
			Date validade, String cobertura, String recheio, String embalagem) {
		super(codigo, qtd_estoque, sabor, preco, quantidade, horasProducao, validade);
		this.cobertura = cobertura;
		this.recheio = recheio;
		this.embalagem = embalagem;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getEmbalagem() {
		return embalagem;
	}

	public void setEmbalagem(String embalagem) {
		this.embalagem = embalagem;
	}

}
