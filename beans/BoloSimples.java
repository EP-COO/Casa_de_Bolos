
package beans;

import java.util.Date;

public class BoloSimples extends Bolo{
	
	public BoloSimples(int quantidade_estoque,int codigo, int quantidade, double precoQuilo, double peso, String sabor, int validade) {
		this.quantidade_estoque = quantidade_estoque;
		this.codigo = codigo;
		this.sabor = sabor;
		this.precoQuilo = precoQuilo;
		this.peso = peso;
		this.quantidade = quantidade;
		this.validade = validade;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public static int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public static double getPrecoQuilo() {
		return precoQuilo;
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
    
	public int getValidade() {
		return validade;
	}

	public void setValidade(int validade) {
		this.validade = validade;
	}
	
	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	public int getQuantidade_estoque() {
		return quantidade_estoque;
	}


	public void setQuantidade_estoque(int quantidade_estoque) {
		this.quantidade_estoque = quantidade_estoque;
	}
	
	public static double getPrecoTotalBoloSimples() {
		return precoQuilo*peso;
	}
	
}
