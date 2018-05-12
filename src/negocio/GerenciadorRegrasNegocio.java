package negocio;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import utilizacao.Log;
import basedados.BaseDadosException;
import basedados.GerenciadorBaseDados;
import basedados.GerenciadorBaseDadosJDBC;
import beans.Administrador;
import beans.Bolo;
import beans.BoloSimples;
import beans.BoloEspecial;
import beans.Cliente;
import beans.Funcionario;
import beans.Pedido;
import beans.Desconto;
import beans.Estoque;
import beans.Pessoa;

public class GerenciadorRegrasNegocio {

	private GerenciadorBaseDados gerenciadorBaseDados;

	public enum BaseDados {
		RAM, JDBC;
	}

	private BaseDados bd;

	public GerenciadorRegrasNegocio(BaseDados bd) throws NegocioException, SQLException {
		this.bd = bd;
		if (this.bd == BaseDados.JDBC) {
			try {
				gerenciadorBaseDados = new GerenciadorBaseDadosJDBC();
			} catch (BaseDadosException e) {
				throw new NegocioException(e);
			}
		} else {
			throw new NegocioException("Problemas no acesso � base de dados");
		}
	}
	
	public void cadastraCliente (String nome, String sobrenome, int codigo, String email, long celular, long cpf,
			long rg, String mes_nascimento, String endereco, int numero, String complemento, String bairro,
			long cep, String cidade, String estado) throws NegocioException {
		Cliente cliente = new Cliente (nome, sobrenome, codigo, email, celular, cpf, rg, mes_nascimento, 
				endereco, numero, complemento, bairro, cep, cidade, estado);
		
		try {
			gerenciadorBaseDados.inserirCliente(cliente);
		} catch (BaseDadosException e) {
			Log.gravaLog(e);
			throw new NegocioException("Problemas no acesso ao banco de dados.");
		}
	}
	
	public void cadastraFuncionario (String nome, String sobrenome, int codigo, String email, long celular, long cpf,
			long rg, String mes_nascimento, String endereco, int numero, String complemento, String bairro,
			long cep, String cidade, String estado, String login, int senha) throws NegocioException {
		Funcionario funcionario = new Funcionario (nome, sobrenome, codigo, email, celular, cpf, rg, mes_nascimento, 
				endereco, numero, complemento, bairro, cep, cidade, estado, login, senha);
		try {
			gerenciadorBaseDados.inserirFuncionario(funcionario);
		} catch (BaseDadosException e) {
			Log.gravaLog(e);
			throw new NegocioException("Problemas no acesso ao banco de dados.");
		}
	}
	
	public void cadastraBoloSimples(int quantidade_estoque,int codigo, int quantidade, double precoQuilo, 
			double peso, String sabor, int validade) throws NegocioException {
		BoloSimples boloSimples = new BoloSimples (quantidade_estoque, codigo, quantidade, precoQuilo, 
				peso, sabor, validade);
		int qtd_estoque = BoloSimples.quantidade_estoque;
		Bolo.iteraQtdBolo(qtd_estoque);
		try {
			gerenciadorBaseDados.inserirBoloSimples(boloSimples);
		} catch (BaseDadosException e) {
			Log.gravaLog(e);
			throw new NegocioException("Problemas no acesso ao banco de dados.");
		}
	}
	
	public void cadastraBoloEspecial(int quantidade_estoque,int codigo, int quantidade, double precoQuilo, 
			double peso, String sabor, int validade, String cobertura, String recheio) throws NegocioException {
		BoloEspecial boloEspecial = new BoloEspecial (quantidade_estoque, codigo, quantidade, precoQuilo, 
				peso, sabor, validade, cobertura, recheio);
		int qtd_estoque = BoloEspecial.quantidade_estoque;
		Bolo.iteraQtdBolo(qtd_estoque);
		try {
			if(qtd_estoque > 10) {
				//devolve que n�o pode
			}
			gerenciadorBaseDados.inserirBoloEspecial(boloEspecial);
		} catch (BaseDadosException e) {
			Log.gravaLog(e);
			throw new NegocioException("Problemas no acesso ao banco de dados.");
		}
	}
	
	public void fazerPedido() {
		
	}
	
	public List<Cliente> listaCliente() throws NegocioException {
		try {
			return gerenciadorBaseDados.listarCliente();
		} catch (BaseDadosException e) {
			Log.gravaLog(e);
			throw new NegocioException("Problemas no acesso ao banco de dados.");
		}
	}
	
	public List<Funcionario> listaFuncionario() throws NegocioException {
		try {
			return gerenciadorBaseDados.listarFuncionario();
		} catch (BaseDadosException e) {
			Log.gravaLog(e);
			throw new NegocioException("Problemas no acesso ao banco de dados.");
		}
	}
	
	public List<BoloSimples> listaBoloSimples() throws NegocioException {
		try {
			return gerenciadorBaseDados.listarBoloSimples();
		} catch (BaseDadosException e) {
			Log.gravaLog(e);
			throw new NegocioException("Problemas no acesso ao banco de dados.");
		}
	}
	
	public List<BoloEspecial> listaBoloEspecial() throws NegocioException {
		try {
			return gerenciadorBaseDados.listarBoloEspecial();
		} catch (BaseDadosException e) {
			Log.gravaLog(e);
			throw new NegocioException("Problemas no acesso ao banco de dados.");
		}
	}
	
	public List<Pedido> listaPedidoBoloSimples() throws NegocioException {
		try {
			return gerenciadorBaseDados.listarPedidoBoloSimples();
		} catch (BaseDadosException e) {
			Log.gravaLog(e);
			throw new NegocioException("Problemas no acesso ao banco de dados.");
		}
	}
	
	public List<Pedido> listaPedidoBoloEspecial() throws NegocioException {
		try {
			return gerenciadorBaseDados.listarPedidoBoloEspecial();
		} catch (BaseDadosException e) {
			Log.gravaLog(e);
			throw new NegocioException("Problemas no acesso ao banco de dados.");
		}
	}
}

	/*
	public void devolveLivro(int codigoEmprestimo) throws NegocioException {
		try {
			Emprestimo emprestimo = gerenciadorBaseDados
					.buscaEmprestimo(codigoEmprestimo);
			emprestimo.setFinalizado(true);
			gerenciadorBaseDados.alteraEmprestimo(emprestimo);
		} catch (BaseDadosException e) {
			Log.gravaLog(e);
			throw new NegocioException("Problemas no acesso ao banco de dados.");
		}
	}

	
	public List<Emprestimo> listaEmprestimosEmAbertoDoUsuario(Usuario usuario)
			throws NegocioException {
		return null;
	}

	public List<Livro> listaLivrosDisponiveis() throws NegocioException {
		List<Livro> livros = listaLivros();
		List<Livro> livrosDisponiveis = new LinkedList<Livro>();

		for (Livro livro : livros) {
			if (livro.getQtdExemplaresDisponiveis() > 0) {
				livrosDisponiveis.add(livro);
			}
		}

		return livrosDisponiveis;
	}

	public void emprestaLivro(int codigoLivro, int codigoUsuario)
			throws NegocioException {
		try {
			Livro livro = gerenciadorBaseDados.buscaLivro(codigoLivro);
			Usuario usuario = gerenciadorBaseDados.buscaUsuario(codigoUsuario);
			emprestaItem(livro, usuario);
		} catch (BaseDadosException e) {
			Log.gravaLog(e);
			throw new NegocioException("Problemas no acesso ao banco de dados.");
		}
	}

	public void emprestaCD(int codigoCD, int codigoUsuario)
			throws NegocioException {
	}*/

	/*public void emprestaItem(Item item, Usuario usuario)
			throws NegocioException {
		int maxItens = 6;
		int maxLivros = 3;
		int maxCDs = 5;

		try {
			LinkedList<Emprestimo> listaEmprestimos = gerenciadorBaseDados
					.listaEmprestimosEmAbertoDoUsuario(usuario);
			int nEmprestimos = listaEmprestimos.size();
			int nLivros = 0;
			int nCDs = 0;
			boolean jahEmprestouOutroExemplarDoMesmoItem = false;

			for (Emprestimo emprestimo : listaEmprestimos) {
				if (emprestimo.getItem().getCodigo() == item.getCodigo()) {
					jahEmprestouOutroExemplarDoMesmoItem = true;
				}

				if (emprestimo.getItem() instanceof Livro) {
					nLivros++;
				} else {
					nCDs++;
				}
			}

			// regra de negócio 1
			if (nEmprestimos >= maxItens || nLivros >= maxLivros
					|| nCDs >= maxCDs) {
				throw new NegocioException("Usuário já possui " + nLivros
						+ " livros e " + nCDs + " CDs emprestados!");
			}

			// regra de negócio 2
			if (jahEmprestouOutroExemplarDoMesmoItem) {
				throw new NegocioException(
						"Um exemplar deste item já encontra-se emprestado ao usuário!");
			}

			Emprestimo emprestimo = new Emprestimo(item, usuario);
			gerenciadorBaseDados.insereEmprestimo(emprestimo);
		} catch (BaseDadosException e) {
			Log.gravaLog(e);
			throw new NegocioException("Problemas no acesso ao banco de dados.");
		}
	}*/
