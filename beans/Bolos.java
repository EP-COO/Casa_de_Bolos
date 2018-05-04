package beans;

import java.lang.String;
import java.util.Date;

public class Bolos{
	
	protected int codigo;
	protected int qtd_estoque; 
	protected String sabor;
	protected double preco;
	protected int quantidade;
	protected double horasProducao;
	protected Date validade;
	
	public Bolos(int codigo, int qtd_estoque, String sabor, double preco, int quantidade, double horasProducao,
			Date validade) {
		this.sabor = sabor;
		this.preco = preco;
		this.quantidade = quantidade;
		this.horasProducao = horasProducao;
		this.validade = validade;
	}

	public String getSabor() {
		return sabor;
	}
	
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getHorasProducao() {
		return horasProducao;
	}
	
	public void setHorasProducao(double horasProducao) {
		this.horasProducao = horasProducao;
	}
	
	public Date getValidade() {
		return validade;
	}
	
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	
	
	
}
