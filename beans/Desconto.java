package beans;

import beans.Pedido;

public class Desconto {
	
	protected static double valorTotal;
	protected static double desconto = 0;;
	
	//10% indicação amigo (na primeira compra- MUDAR AKI)
	public static void indicacaoSimples(boolean indicado, int quantidade, double precoTotalBoloSimples) {
		if (indicado) {
			valorTotal = quantidade*precoTotalBoloSimples*0.9;
			desconto = quantidade*precoTotalBoloSimples*0.1;
		}
	}
	
	public static void indicacaoEspecial(boolean indicado, int quantidade, double precoTotalBoloEspecial) {
		if (indicado) {
			valorTotal = quantidade*precoTotalBoloEspecial*0.9;
			desconto = quantidade*precoTotalBoloEspecial*0.1;
		}
	}
	
	//11º produto com 20% de desconto
	public void decimoPrimeiroSimples(int quantidade, double precoTotalBoloSimples) {
		if(quantidade >= 10) {
			valorTotal = (quantidade -1)* precoTotalBoloSimples + precoTotalBoloSimples*0.8;
			desconto = precoTotalBoloSimples*0.2;
		}
		else {
			valorTotal = quantidade * precoTotalBoloSimples;
			desconto = 0;
		}
	}
	
	//mes de aniversario 15% 	
	public void mesAniversarioSimples(String mes, double precoTotalBoloSimples, int quantidade) {
		if (Cliente.getMes_nascimento() == mes) {
			valorTotal = quantidade*precoTotalBoloSimples*0.85;
			desconto = quantidade*precoTotalBoloSimples*0.15;
		}
	}
	
	public void mesAniversarioEspecial(String mes, double precoTotalBoloEspecial, int quantidade) {
		if (Cliente.getMes_nascimento() == mes) {
			valorTotal = quantidade*precoTotalBoloEspecial*0.85;
			desconto = quantidade*precoTotalBoloEspecial*0.15;
		}
	}
	
	//mes maio (noivas) 15% bolos especiais
	public void mesNoivasSimples(String mes, double precoTotalBoloSimples, int quantidade) {
		if (mes == "maio") {
			valorTotal = quantidade*precoTotalBoloSimples*0.85;
			desconto = quantidade*precoTotalBoloSimples*0.15;
		}
	}
	
	public void mesNoivasEspecial(String mes, double precoTotalBoloEspecial, int quantidade) {
		if (mes == "maio") {
			valorTotal = quantidade*precoTotalBoloEspecial*0.85;
			desconto = quantidade*precoTotalBoloEspecial*0.15;
		}
	}
	
	//5 bolos especiais + 1 de graca
	public int maisUmGracaEspecial(int quantidade, double precoTotalBoloSimples) {
		int quantidade_total = 0;
		if(quantidade == 5) {
			quantidade_total = Pedido.getQuantidade() + 1;
			valorTotal = quantidade * precoTotalBoloSimples;
		}
		return quantidade_total;
	} //quando comparar considerar 20% em cima desse
	
	
	//10% para funcionario
	public void descontoFuncionario (int codigo, double valorPedido) {
		if (codigo == Funcionario.getCodigo()) {
			valorTotal = valorPedido*0.9;
			desconto = valorPedido*0.1;
		}
	}
	
	//10 reais a mais para encomenda
	public void encomenda(boolean delivery) {
		if (delivery) {
			valorTotal = valorTotal + 10;
		}
	}
	
	//considerar apenas uma opção de desconto, a maior
	
}