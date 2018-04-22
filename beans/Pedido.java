package beans;

import java.util.Date;

public class Pedido {
	
	//Tipos de tamanho poss�veis em uma lista enumerada
	enum Tamanho{
		pequeno, medio, grande;
	}
	
	//Tipos de retirada poss�veis em uma lista enumerada
	enum Retirada{
		agora, entrega;
	}
	
	private Cliente cliente;
	private Bolos tipo;
	private Bolos cobertura;
	private Bolos recheio;
	private Bolos sabor;
	private int quantidade;
	private Tamanho tamanho;
	private Retirada modo_retirada;
	private Date data_retirada;
	private boolean indicado;
	private boolean finalizado;

	public Pedido(Cliente cliente, Bolos tipo, Bolos cobertura, Bolos recheio, Bolos sabor, int quantidade,
			Tamanho tamanho, Retirada modo_retirada, Date data_retirada , boolean indicado, boolean finalizado) {
		super();
		this.cliente = cliente;
		this.tipo = tipo;
		this.cobertura = cobertura;
		this.recheio = recheio;
		this.sabor = sabor;
		this.quantidade = quantidade;
		this.tamanho = tamanho;
		this.modo_retirada = modo_retirada;
		this.indicado = indicado;
		this.data_retirada = data_retirada;
		this.finalizado = finalizado;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Bolos getTipo() {
		return tipo;
	}


	public void setTipo(Bolos tipo) {
		this.tipo = tipo;
	}


	public Bolos getCobertura() {
		return cobertura;
	}


	public void setCobertura(Bolos cobertura) {
		this.cobertura = cobertura;
	}


	public Bolos getRecheio() {
		return recheio;
	}


	public void setRecheio(Bolos recheio) {
		this.recheio = recheio;
	}


	public Bolos getSabor() {
		return sabor;
	}


	public void setSabor(Bolos sabor) {
		this.sabor = sabor;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public Tamanho getTamanho() {
		return tamanho;
	}


	public void setTamanho(Tamanho tamanho) {
		this.tamanho = tamanho;
	}


	public Retirada getModo_retirada() {
		return modo_retirada;
	}


	public void setModo_retirada(Retirada modo_retirada) {
		this.modo_retirada = modo_retirada;
	}


	public boolean isIndicado() {
		return indicado;
	}


	public void setIndicado(boolean indicado) {
		this.indicado = indicado;
	}
	
	
	public Date getData_retirada() {
		return data_retirada;
	}


	public void setData_retirada(Date data_retirada) {
		this.data_retirada = data_retirada;
	}


	public boolean isFinalizado() {
		return finalizado;
	}


	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}
}
