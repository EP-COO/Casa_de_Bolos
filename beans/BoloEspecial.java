
package beans;

public class BoloEspecial extends Bolo {

	public BoloEspecial(int quantidade_estoque, int codigo, int quantidade, double precoQuilo, double peso,
			String sabor, int validade,	String cobertura, String recheio) {
		this.quantidade_estoque = quantidade_estoque;
		this.codigo = codigo;
		this.sabor = sabor;
		this.precoQuilo = precoQuilo;
		this.peso = peso;
		this.quantidade = quantidade;
		this.validade = validade;
		this.recheio = recheio;
		this.cobertura = cobertura;
	}

	// Métodos Getters and Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
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

	public static double getPrecoTotalBoloEspecial() {
		return precoQuilo*peso;
	}
}
