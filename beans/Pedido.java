package beans;

import java.util.Date;

public class Pedido {
	
	//Tipos de retirada possíveis em uma lista enumerada
	enum Retirada{
		agora, entrega;
	}
	
	private Cliente cliente;
	private Bolos cobertura;
	private Bolos recheio;
	private Bolos sabor;
	private int quantidade;
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

}
