package beans;

import java.lang.String;
import java.util.Date;

public class Bolos{
	
	private int codigo;
	private int qtd_estoque; 
	private String nome;
	private String tipo;
	private String tamanho;
	private String sabor;
	private String cobertura;
	private double preco;
	private int quantidade;
	private double horasProducao;
	private Date validade;
	
	public Bolos(int codigo, int qtd_estoque, String nome, String tipo, String tamanho, String sabor, String cobertura,
			double preco, int quantidade, double horasProducao, Date validade) {
		
		this.nome = nome;
		this.tipo = tipo;
		this.tamanho = tamanho;
		this.sabor = sabor;
		this.cobertura = cobertura;
		this.preco = preco;
		this.quantidade = quantidade;
		this.horasProducao = horasProducao;
		this.validade = validade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getSabor() {
		return sabor;
	}
	
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
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
