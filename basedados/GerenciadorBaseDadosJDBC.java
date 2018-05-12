package basedados;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;

import utilizacao.Log;
import visualizacao.PedidoBoloEspecial;
import visualizacao.PedidoBoloSimples;
import beans.BoloSimples;
import beans.BoloEspecial;
import beans.Administrador;
import beans.Bolo;
import beans.Pessoa;
import beans.Cliente;
import beans.Funcionario;
import beans.Pedido;

public class GerenciadorBaseDadosJDBC extends ConectorJDBC implements GerenciadorBaseDados {

	private static final String PASSWORD = "";
	private static final String USER = "root";
	private static final String HOST = "localhost";
	private static final String DB_NAME = "BolosEnterprise";
	private boolean jaCriouBD;

	public GerenciadorBaseDadosJDBC() throws BaseDadosException, SQLException {
		super(DB.MYSQL);

		try {
			criaBancoDeDados();
			criaTabelaBoloSimples();
			criaTabelaBoloEspecial();
			criaTabelaCliente();
			criaTabelaFuncionario();
			criaTabelaPedidoBoloSimples();
			criaTabelaPedidoBoloEspecial();
			populaTabelas();
		} catch (SQLException e) {
			Log.gravaLog(e);
			throw new BaseDadosException("Não foi criado o banco de dados.");
		}
	}
	// Getters e Setters

	protected String getUser() {
		return USER;
	}

	@Override
	protected String getPassword() {
		return PASSWORD;
	}

	@Override
	protected String getDbHost() {
		return HOST;
	}

	@Override
	protected String getDbName() {
		return jaCriouBD ? DB_NAME : "";
	}

	public Cliente inserirCliente(Cliente cliente) throws BaseDadosException {
		abreConexao();
		preparaComandoSQL(
				"insert into Pessoa (nome, sobrenome, codigo, email, celular, cpf, rg, mes_nascimento, "
				+ "endereco, numero, complemento, bairro, cep, cidade, estado) values (?, ?, ?, ?, ?, ?, ?, ?,"
				+ " ?, ?, ?, ?, ?, ?, ?)");
		try {
			pstmt.setString(1, cliente.getNome());
			pstmt.setString(2, cliente.getSobrenome());
			pstmt.setInt(3, cliente.getCodigo());
			pstmt.setString(4, cliente.getEmail());
			pstmt.setLong(5, cliente.getCelular());
			//pstmt.setString(6, cliente.getTelefone_fixo());
			pstmt.setLong(6, cliente.getCpf());
			pstmt.setLong(7, cliente.getRg());
			pstmt.setString(8, cliente.getMes_nascimento());
			pstmt.setString(9, cliente.getEndereco());
			pstmt.setInt(10, cliente.getNumero());
			pstmt.setString(11, cliente.getComplemento());
			pstmt.setString(12, cliente.getBairro());
			pstmt.setLong(13, cliente.getCep());
			pstmt.setString(14, cliente.getCidade());
			pstmt.setString(15, cliente.getEstado());
			//pstmt.setBoolean(17, cliente.isEhNoiva());
			pstmt.execute();
		} catch (SQLException e) {
			Log.gravaLog(e);
			throw new BaseDadosException("Houve um erro na colocação dos parâmetros na nossa tabela.");
		}

		fechaConexao();
		return cliente;
	}

	public Funcionario inserirFuncionario(Funcionario funcionario) throws BaseDadosException {
		abreConexao();
		preparaComandoSQL(
				"insert into Funcionario (nome, sobrenome, codigo, email, celular, cpf, rg, mes_nascimento, "
				+ "endereco, numero, complemento, bairro, cep, cidade, estado, login, senha) values "
				+ "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		try {
			pstmt.setString(1, funcionario.getNome());
			pstmt.setString(2, funcionario.getSobrenome());
			pstmt.setInt(3, funcionario.getCodigo());
			pstmt.setString(4, funcionario.getEmail());
			pstmt.setLong(5, funcionario.getCelular());
			//pstmt.setString(6, funcionario.getTelefone_fixo());
			pstmt.setLong(6, funcionario.getCpf());
			pstmt.setLong(7, funcionario.getRg());
			pstmt.setString(8, funcionario.getMes_nascimento());
			pstmt.setString(9, funcionario.getEndereco());
			pstmt.setInt(10, funcionario.getNumero());
			pstmt.setString(11, funcionario.getComplemento());
			pstmt.setString(12, funcionario.getBairro());
			pstmt.setLong(13, funcionario.getCep());
			pstmt.setString(14, funcionario.getCidade());
			pstmt.setString(15, funcionario.getEstado());
			pstmt.setString(16, funcionario.getLogin());
			pstmt.setLong(17, funcionario.getSenha());
		} catch (SQLException e) {
			Log.gravaLog(e);
			throw new BaseDadosException("Houve um erro na colocação dos parâmetros na nossa tabela.");
		}

		fechaConexao();
		return funcionario;
	}

	public BoloSimples inserirBoloSimples(BoloSimples boloSimples) throws BaseDadosException {
		abreConexao();
		preparaComandoSQL(
				"insert into BoloSimples (codigo, quantidade_estoque, quantidade, preco, peso, sabor, "
				+ "validade) values (?, ?, ?, ?, ?, ?, ?)");
		try {
			pstmt.setInt(1, boloSimples.getCodigo());
			pstmt.setInt(2, boloSimples.getQuantidade_estoque());
			pstmt.setInt(3, boloSimples.getQuantidade());
			pstmt.setDouble(4, boloSimples.getPrecoQuilo());
			pstmt.setDouble(5, boloSimples.getPeso());
			//pstmt.setString(5, boloSimples.getNome());
			pstmt.setString(6, boloSimples.getSabor());
			pstmt.setInt(7, boloSimples.getValidade());
		} catch (SQLException e) {
			Log.gravaLog(e);
			throw new BaseDadosException("Houve um erro na colocação dos parâmetros na nossa tabela.");
		}

		fechaConexao();
		return boloSimples;
	}

	public BoloEspecial inserirBoloEspecial(BoloEspecial boloEspecial) throws BaseDadosException {
		abreConexao();
		preparaComandoSQL(
				"insert into BoloEspecial (odigo, quantidade_estoque, quantidade, preco, peso, sabor, "
				+ "validade, cobertura,  recheio) values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
		try {
			pstmt.setInt(1, boloEspecial.getCodigo());
			pstmt.setInt(2, boloEspecial.getQuantidade_estoque());
			pstmt.setInt(3, boloEspecial.getQuantidade());
			pstmt.setDouble(4, boloEspecial.getPrecoQuilo());
			pstmt.setDouble(5, boloEspecial.getPeso());
			//pstmt.setString(5, boloEspecial./getNome());
			pstmt.setString(6, boloEspecial.getSabor());
			pstmt.setInt(7, boloEspecial.getValidade());
			pstmt.setString(8, boloEspecial.getCobertura());
			pstmt.setString(9, boloEspecial.getRecheio());
			//pstmt.setString(10, boloEspecial.getEnfeite());
		} catch (SQLException e) {
			Log.gravaLog(e);
			throw new BaseDadosException("Houve um erro na colocação dos parâmetros na nossa tabela.");
		}
		return boloEspecial;
	}

	public Pedido inserirPedidoBoloSimples(Pedido pedido) throws BaseDadosException {
		abreConexao();
		preparaComandoSQL(
				"insert into Pedido (codigo, cliente, boloSimples, quantidade, indicado, delivery) values "
				+ "(?, ?, ?, ?, ?, ?)");
		try {
			pstmt.setInt(1, pedido.getCodigo());
			pstmt.setObject(2, Cliente.getCodigo());
			pstmt.setObject(3, pedido.getBoloSimples());
			pstmt.setDouble(4, pedido.getQuantidade());
			//pstmt.setInt(5, pedido.getData_retirada());
			pstmt.setBoolean(5, pedido.isIndicado());
			pstmt.setBoolean(6, pedido.isDelivery());
		} catch (SQLException e) {
			Log.gravaLog(e);
			throw new BaseDadosException("Houve um erro na colocação dos parâmetros na nossa tabela.");
		}
		return pedido;
	}

	public Pedido inserirPedidoBoloEspecial(Pedido pedido) throws BaseDadosException {
		abreConexao();
		preparaComandoSQL(
				"insert into Pedido (codigo, cliente, boloEspecial, quantidade, indicado, delivery) values "
				+ "(?, ?, ?, ?, ?, ?)");
		try {
			pstmt.setInt(1, pedido.getCodigo());
			pstmt.setObject(2, Cliente.getCodigo());
			pstmt.setObject(3, pedido.getBoloEspecial());
			pstmt.setInt(3, pedido.getQuantidade());
			//pstmt.setInt(3, pedido.getData_retirada());
			pstmt.setBoolean(4, pedido.isIndicado());
			pstmt.setBoolean(5, pedido.isDelivery());
		} catch (SQLException e) {
			Log.gravaLog(e);
			throw new BaseDadosException("Houve um erro na colocação dos parâmetros na nossa tabela.");
		}
		return pedido;
	}

	public Cliente buscarCliente(int codigo) throws BaseDadosException {
		abreConexao();
		preparaComandoSQL(
				"select nome, sobrenome, codigo, email, celular, cpf, rg, mes_nascimento, endereco, numero, "
				+ "complemento, bairro, cep, cidade, estado from Cliente where codigo="
						+ codigo);
		Cliente cliente = null;
		try {
			rs = pstmt.executeQuery();

			if (rs.next()) {
				String nome = rs.getString(1);
				String sobrenome = rs.getString(2);
				int codigoCliente = rs.getInt(3);
				String email = rs.getString(4);
				long celular = rs.getLong(5);
				//String telefone_fixo = rs.getString(6);
				long cpf = rs.getLong(6);
				long rg = rs.getLong(7);
				String mes_nascimento = rs.getString(8);
				String endereco = rs.getString(9);
				int numero = rs.getInt(10);
				String complemento = rs.getString(11);
				String bairro = rs.getString(12);
				long cep = rs.getLong(13);
				String cidade = rs.getString(14);
				String estado = rs.getString(15);
				//Boolean ehNoiva = rs.getBoolean(17);
				cliente = new Cliente(nome, sobrenome, codigoCliente, email, celular, cpf,	rg, 
						mes_nascimento, endereco, numero, complemento, bairro, cep, cidade, estado);
			}
		} catch (SQLException e) {
			Log.gravaLog(e);
			throw new BaseDadosException("Problemas ao ler o resultado da consulta.");
		}

		fechaConexao();
		return cliente;
	}

	public Funcionario buscarFuncionario(int codigo) throws BaseDadosException {
		abreConexao();
		preparaComandoSQL(
				"select nome, sobrenome, codigo, email, celular, cpf, rg, mes_nascimento, endereco, numero, "
				+ "complemento, bairro, cep, cidade, estado, login, senha from Funcionario where codigo="
						+ codigo);		
		Funcionario funcionario = null;
		try {
			rs = pstmt.executeQuery();

			if (rs.next()) {
				String nome = rs.getString(1);
				String sobrenome = rs.getString(2);
				String email = rs.getString(3);
				long celular = rs.getLong(4);
				//String telefone_fixo = rs.getString(5);
				long cpf = rs.getLong(5);
				long rg = rs.getLong(6);
				String mes_nascimento = rs.getString(7);
				String endereco = rs.getString(8);
				int numero = rs.getInt(9);
				String complemento = rs.getString(10);
				String bairro = rs.getString(11);
				long cep = rs.getLong(12);
				String cidade = rs.getString(13);
				String estado = rs.getString(14);
				String login = rs.getString(15);
				long senha = rs.getLong(16);
				funcionario = new Funcionario(nome, sobrenome, codigo, email, celular, 
						 cpf, rg, mes_nascimento, endereco, numero, complemento, 
						  bairro, cep, cidade, estado, login, senha);
			}
		} catch (SQLException e) {
			Log.gravaLog(e);
			throw new BaseDadosException("Problemas ao ler o resultado da consulta.");
		}

		fechaConexao();
		return funcionario;
	}

	public BoloSimples buscarBoloSimples(int codigo) throws BaseDadosException {
		abreConexao();
		preparaComandoSQL(
				"select quantidade_estoque, codigoBolo, quantidade, precoQuilo, peso, sabor, validade "
				+ "from BoloSimples where codigo=" + codigo);
		BoloSimples boloSimples = null;
		try {
			rs = pstmt.executeQuery();

			if (rs.next()) {
				int quantidade_estoque = rs.getInt(1);
				int codigoBolo = rs.getInt(2);
				int quantidade = rs.getInt(3);
				double precoQuilo = rs.getDouble(4);
				double peso = rs.getDouble(5);
				String sabor = rs.getString(6);
				int validade = rs.getInt(7);
				boloSimples = new BoloSimples(quantidade_estoque, codigoBolo, quantidade, precoQuilo, peso, 
						sabor, validade);
			}
		} catch (SQLException e) {
			Log.gravaLog(e);
			throw new BaseDadosException("Problemas ao ler o resultado da consulta.");
		}

		fechaConexao();
		return boloSimples;
	}

	public BoloEspecial buscarBoloEspecial(int codigo) throws BaseDadosException {
		abreConexao();
		preparaComandoSQL(
				"select quantidade_estoque, codigoBolo, quantidade, precoQuilo, peso, sabor, validade, "
				+ "cobertura, recheio from BoloEspecial where codigo="	+ codigo);
		BoloEspecial boloEspecial = null;
		try {
			rs = pstmt.executeQuery();

			if (rs.next()) {
				int quantidade_estoque = rs.getInt(1);
				int codigoBolo = rs.getInt(2);
				int quantidade = rs.getInt(3);
				double precoQuilo = rs.getDouble(4);
				double peso = rs.getDouble(5);
				//String nome = rs.getString(5);
				String sabor = rs.getString(6);
				int validade = rs.getInt(7);
				String cobertura = rs.getString(8);
				String recheio = rs.getString(9);
				//String enfeite = rs.getString(10);
				boloEspecial = new BoloEspecial(quantidade_estoque, codigoBolo, quantidade, precoQuilo, peso, 
						sabor, validade, cobertura, recheio);
			}
		} catch (SQLException e) {
			Log.gravaLog(e);
			throw new BaseDadosException("Problemas ao ler o resultado da consulta.");
		}

		fechaConexao();
		return boloEspecial;
	}

	public Pedido buscarPedidoBoloSimples(int codigo) throws BaseDadosException {
		abreConexao();
		preparaComandoSQL(
				"select cliente, boloSimples, quantidade, indicado, delivery from Pedido where codigo="
						+ codigo);
		Pedido pedido = null;
		try {
			rs = pstmt.executeQuery();

			if (rs.next()) {
				Cliente cliente = (Cliente) rs.getObject(1);
				BoloSimples boloSimples = (BoloSimples) rs.getObject(2);
				int quantidade = rs.getInt(4);
				//int data_retirada = rs.getInt(5);
				Boolean indicado = rs.getBoolean(5);
				Boolean delivery = rs.getBoolean(6);

				pedido = new Pedido(cliente, boloSimples, quantidade, indicado, delivery, codigo);
			}
		} catch (SQLException e) {
			Log.gravaLog(e);
			throw new BaseDadosException("Problemas ao ler o resultado da consulta.");
		}

		fechaConexao();
		return pedido;
	}

	public Pedido buscarPedidoBoloEspecial(int codigo) throws BaseDadosException {
		abreConexao();
		preparaComandoSQL(
				"select cliente, boloEspecial, quantidade, indicado, delivery from Pedido where codigo="
						+ codigo);
		Pedido pedido = null;
		try {
			rs = pstmt.executeQuery();

			if (rs.next()) {
				Cliente cliente = (Cliente) rs.getObject(1);
				BoloEspecial boloEspecial = (BoloEspecial) rs.getObject(2);
				int quantidade = rs.getInt(4);
				//int data_retirada = rs.getInt(5);
				Boolean indicado = rs.getBoolean(5);
				Boolean delivery = rs.getBoolean(6);

				pedido = new Pedido(cliente, boloEspecial, quantidade, indicado, delivery, codigo);
			}
		} catch (SQLException e) {
			Log.gravaLog(e);
			throw new BaseDadosException("Problemas ao ler o resultado da consulta.");
		}

		fechaConexao();
		return pedido;
	}
	
	public List<Cliente> listarCliente() throws BaseDadosException {
		LinkedList<Cliente> clientes = new LinkedList<Cliente>();
		abreConexao();
		preparaComandoSQL(
				"select nome, sobrenome, codigo, email, celular, cpf, rg, mes_nascimento, "
				+ "endereco, numero, complemento, bairro, cep, cidade, estado from Cliente");

		try {
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String nome = rs.getString(1);
				String sobrenome = rs.getString(2);
				int codigo = rs.getInt(3);
				String email = rs.getString(4);
				long celular = rs.getLong(5);
				//String telefone_fixo = rs.getString(6);
				long cpf = rs.getLong(6);
				long rg = rs.getLong(7);
				String mes_nascimento = rs.getString(8);
				String endereco = rs.getString(9);
				int numero = rs.getInt(10);
				String complemento = rs.getString(11);
				String bairro = rs.getString(12);
				long cep = rs.getLong(13);
				String cidade = rs.getString(14);
				String estado = rs.getString(15);
				//Boolean ehNoiva = rs.getBoolean(17);
				Cliente cliente = new Cliente(nome, sobrenome, codigo, email, celular, cpf,	rg, 
						mes_nascimento, endereco, numero, complemento, bairro, cep, cidade, estado);
				clientes.add(cliente);
			}
		} catch (SQLException e) {
			Log.gravaLog(e);
			throw new BaseDadosException("Problemas ao ler o resultado da consulta.");
		}
		fechaConexao();
		return clientes;
	}

	public List<Funcionario> listarFuncionario() throws BaseDadosException {
		LinkedList<Funcionario> funcionarios = new LinkedList<Funcionario>();
		abreConexao();
		preparaComandoSQL(
				"select nome, sobrenome, codigo, email, celular, cpf, rg, mes_nascimento, endereco, numero, "
				+ "complemento, bairro, cep, cidade, estado, login, senha from Cliente");

		try {
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String nome = rs.getString(1);
				String sobrenome = rs.getString(2);
				int codigo = rs.getInt(3);
				String email = rs.getString(4);
				long celular = rs.getLong(5);
				//String telefone_fixo = rs.getString(6);
				long cpf = rs.getLong(7);
				long rg = rs.getLong(8);
				String mes_nascimento = rs.getString(9);
				String endereco = rs.getString(10);
				int numero = rs.getInt(11);
				String complemento = rs.getString(11);
				String bairro = rs.getString(13);
				long cep = rs.getLong(14);
				String cidade = rs.getString(15);
				String estado = rs.getString(16);
				String login = rs.getString(17);
				long senha = rs.getLong(18);
				Funcionario funcionario = new Funcionario(nome, sobrenome, codigo, email, celular, 
						 cpf, rg, mes_nascimento, endereco, numero, complemento, 
						  bairro, cep, cidade, estado, login, senha);
				funcionarios.add(funcionario);
			}
		} catch (SQLException e) {
			Log.gravaLog(e);
			throw new BaseDadosException("Problemas ao ler o resultado da consulta.");
		}
		fechaConexao();
		return funcionarios;
	}
	
	

	public List<BoloSimples> listarBoloSimples() throws BaseDadosException {
		LinkedList<BoloSimples> bolos_simples = new LinkedList<BoloSimples>();
		abreConexao();
		preparaComandoSQL("select quantidade_estoque, codigo, quantidade, precoQuilo, peso, sabor, validade "
				+ "from Bolos");

		try {
			rs = pstmt.executeQuery();

			while (rs.next()) {
				int quantidade_estoque = rs.getInt(1);
				int codigo = rs.getInt(2);
				int quantidade = rs.getInt(3);
				double precoQuilo = rs.getDouble(4);
				double peso = rs.getDouble(5);
				String sabor = rs.getString(6);
				//String nome = rs.getString(5);
				//int quantidade = rs.getInt(6);
				//int horasProducao = rs.getInt(7);
				int validade = rs.getInt(7);
				BoloSimples boloSimples = new BoloSimples(quantidade_estoque, codigo, quantidade, precoQuilo, 
						peso, sabor, validade);
				bolos_simples.add(boloSimples);
			}
		} catch (SQLException e) {
			Log.gravaLog(e);
			throw new BaseDadosException("Problemas ao ler o resultado da consulta.");
		}

		fechaConexao();
		return bolos_simples;
	}

	public List<BoloEspecial> listarBoloEspecial() throws BaseDadosException {
		LinkedList<BoloEspecial> bolos_especial = new LinkedList<BoloEspecial>();
		abreConexao();
		preparaComandoSQL(
				"select quantidade_estoque, codigo, quantidade, precoQuilo, peso, sabor, validade, cobertura, "
				+ "recheio, enfeite from Bolos");

		try {
			rs = pstmt.executeQuery();

			while (rs.next()) {
				int quantidade_estoque = rs.getInt(1);
				int codigo = rs.getInt(2);
				int quantidade = rs.getInt(3);
				double precoQuilo = rs.getDouble(4);
				double peso = rs.getDouble(5);
				String sabor = rs.getString(5);
				//String nome = rs.getString(5);
				//int quantidade = rs.getInt(6);
				//int horasProducao = rs.getInt(7);
				int validade = rs.getInt(6);
				String cobertura = rs.getString(7);
				String recheio = rs.getString(8);
				//String enfeite = rs.getString(11);
				BoloEspecial boloEspecial = new BoloEspecial(quantidade_estoque, codigo, quantidade, precoQuilo, 
						peso, sabor, validade, cobertura, recheio);
				bolos_especial.add(boloEspecial);
			}
		} catch (SQLException e) {
			Log.gravaLog(e);
			throw new BaseDadosException("Problemas ao ler o resultado da consulta.");
		}

		fechaConexao();
		return bolos_especial;
	}
	
	@Override
	public List<Pedido> listarPedidoBoloSimples() throws BaseDadosException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pedido> listarPedidoBoloEspecial() throws BaseDadosException {
		// TODO Auto-generated method stub
		return null;
	}

	private void criaBancoDeDados() throws SQLException, BaseDadosException {
		abreConexao();
		jaCriouBD = true;
		preparaComandoSQL("create database if not exists " + getDbName());
		pstmt.execute();
		fechaConexao();
	}

	private void criaTabelaBoloSimples() throws SQLException, BaseDadosException {
		abreConexao();
		preparaComandoSQL("create table if not exists BoloSimples (codigo int unsigned not null,"
				+ "qtd_estoque int unsigned not null," + "sabor varchar (20) not null,"
				+ "preco double unsigned not null," + "peso double unsigned not null,"
				+ "quantidade int unsigned not null," + "validade int not null,"
				+ "constraint fk_Bolos_BoloSimples FOREIGN KET (codigo) REFERENCES Bolos (codigo)");
		pstmt.execute();
		fechaConexao();
	}

	private void criaTabelaBoloEspecial() throws SQLException, BaseDadosException {
		abreConexao();
		preparaComandoSQL("create table if not exists BoloEspecial (codigo int unsigned not null,"
				+ "qtd_estoque int unsigned not null," + "sabor varchar (20) not null,"
				+ "preco double unsigned not null," + "peso double unsigned not null,"
				+ "quantidade int unsigned not null," + "validade int not null,"
				+ "recheio varchar (20) not null," + "cobertura varchar (30),"
				+ "constraint fk_Bolos_BoloSimples FOREIGN KET (codigo) REFERENCES Bolos (codigo)");
		pstmt.execute();
		fechaConexao();
	}

	private void criaTabelaCliente() throws SQLException, BaseDadosException {
		abreConexao();
		preparaComandoSQL("create table if not exists Cliente (" + "codigo int unsigned not null," 
				+ "nome varchar(20) not null," + "sobrenome varchar(40) not null," 
				+ "email varchar(30) not null,"	+ "celular varchar(15) not null," 
				+ "cpf varchar(20) not null," + "rg varchar(20) not null," + "mes_nascimento int not null," 
				+ "endereco varchar(40) not null," + "numero int unsigned not null," 
				+ "complemento varchar(40) not null," + "bairro varchar(40) not null," 
				+ "cep varchar(40) not null," + "cidade varchar(40) not null," + "estado varchar(40) not null,"
				+ "constraint fk_Pessoa_Cliente FOREIGN KEY (codigoCliente) REFERENCES Cliente (codigo)");
		pstmt.execute();
		fechaConexao();
	}

	private void criaTabelaFuncionario() throws SQLException, BaseDadosException {
		abreConexao();
		preparaComandoSQL("create table if not exists Funcionario (" + "codigo int unsigned not null," 
				+ "nome varchar(20) not null," + "sobrenome varchar(40) not null," 
				+ "email varchar(30) not null,"	+ "celular varchar(15) not null," 
				+ "cpf varchar(20) not null," + "rg varchar(20) not null," + "mes_nascimento int not null," 
				+ "endereco varchar(40) not null," + "numero int unsigned not null," 
				+ "complemento varchar(40) not null," + "bairro varchar(40) not null," 
				+ "cep varchar(40) not null," + "cidade varchar(40) not null," + "estado varchar(40) not null,"
				+ "login varchar (10) not null. " + "senha varchar (10) not null,"
				+ "constraint fk_Pessoa_Funcionario FOREIGN KEY (codigoFuncionario) REFERENCES Funcionario (codigo)");
		pstmt.execute();
		fechaConexao();
	}

	private void criaTabelaPedidoBoloSimples() throws SQLException, BaseDadosException {
		abreConexao();
		preparaComandoSQL("create table if not exists PedidoBoloSimples (" + "int codigoCliente not null,"
				+ "int codigoBoloSimples not null," + "codigo int unsigned not null,"
				+ "int quantidade_estoque unsigned not null," + "int quantidade unsigned not null,"
				+ "double preco unsigned not null," + "double peso unsigned not null," 
				+ "sabor varchar(50) not null," + "validade int not null,"
				+ "constraint fk_Pessoa_Cliente FOREIGN KEY (codigoCliente) REFERENCES Cliente(codigo)"
				+ "constraint fk_Bolo_BoloSimples FOREIGN KEY (codigoBoloSimples) REFERENCES BoloSimples(codigo)");
		pstmt.execute();
		fechaConexao();
	}

	private void criaTabelaPedidoBoloEspecial() throws SQLException, BaseDadosException {
		abreConexao();
		preparaComandoSQL("create table if not exists PedidoBoloSimples (" + "int codigoCliente not null,"
				+ "int codigoBoloSimples not null," + "codigo int unsigned not null,"
				+ "int quantidade_estoque unsigned not null," + "int quantidade unsigned not null,"
				+ "double preco unsigned not null," + "double peso unsigned not null," 
				+ "sabor varchar(50) not null," + "validade int not null,"
				+ "cobertura varchar(50) not null," + "recheio varchar(50) not null,"
				+ "constraint fk_Pessoa_Cliente FOREIGN KEY (codigoCliente) REFERENCES Cliente(codigo)"
				+ "constraint fk_Bolo_BoloSimples FOREIGN KEY (codigoBoloSimples) REFERENCES BoloSimples(codigo)");
		pstmt.execute();
		fechaConexao();
	}

	private void populaTabelas() throws SQLException, BaseDadosException{
    	if(buscarFuncionario(1) != null) {
			return;
		}

    	Administrador a1;
		Funcionario f1, f2;
		Cliente c1, c2;
		BoloSimples s1, s2;
		BoloEspecial e1, e2;
		
		inserirFuncionario(a1 = new Administrador("Alexandre", "Freire", 0, "asfreire@usp.br", 912345678, 12345, 
				123456789, "janeiro", "Rua Arlindo BÃ©ttio", 1000, null, "Vila Guaraciaba", 0, "SÃ£o Paulo", 
				"SP", "afreire", 123));
		inserirFuncionario(f1 = new Funcionario("Beatriz", "Pozzan", 1, "beatrizpozzan@hotmail.com", 
				987098893, 470280988-18, 38834502-0, "março", "Rua Riskallah Abib", 292, null, "Nova Petrópolis", 
				0, "São Paulo", "SP", "bpozzan", 10));
		inserirFuncionario(f1 = new Funcionario("Fernando", "Santos", 2, "nando.freitas@gmail.com", 
				987478953, 474278974-18, 38478056-0, "fevereiro", "Avenida Jabaquara", 1909, null, "Mirandópolis", 
				0, "São Paulo", "SP", "fsantos", 11));
		inserirBoloSimples(s1 = new BoloSimples(0, 0, 5, 10.5, 0.500, "laranja", 5));
		inserirBoloSimples(s1 = new BoloSimples(0, 0, 5, 10.5, 0.300, "banana", 5));
	}

}