
package beans;

import java.util.Date;

public abstract class Bolo {

	// Atributos de um bolo
	protected int codigo; // codigo do bolo
	public static int quantidade_estoque = 0;
	protected String tipo;
	protected static int quantidade;
	protected static double precoQuilo;
	protected static double peso;
	protected String sabor;
	protected String recheio;
	protected String cobertura;
	protected int validade;

	// MÃ©todos Getters e Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade_estoque() {
		return quantidade_estoque;
	}

	public void setQuantidade_estoque(int quantidade_estoque) {
		this.quantidade_estoque = quantidade_estoque;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public static int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrecoQuilo() {
		return precoQuilo*peso;
	}

	public void setPrecoQuilo(double precoQuilo) {
		this.precoQuilo = precoQuilo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
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

	public int getValidade() {
		return validade;
	}

	public void setValidade(int validade) {
		this.validade = validade;
	}

	public static void iteraQtdBolo(int quantidade_estoque) {
		if (quantidade_estoque <= 10) {
			quantidade_estoque++;
		}
		else {
			System.out.println("Não dá pra adicionar mais"); //fazer certo
		}
	}

}
