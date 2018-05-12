
package beans;

import visualizacao.CadastroCliente;

public class Funcionario extends Pessoa {

	// Atributos da classe
	private String login; // Apenas Caracteres
	private long senha; // Apenas numeros

	// Construtotes
	public Funcionario(String nome, String sobrenome, int codigo, String email, long celular, 
			 long cpf, long rg, String mes_nascimento, String endereco, int numero, String complemento, 
			 String bairro, long cep, String cidade, String estado, String login, long senha) {
		this.codigo = codigo;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.mes_nascimento = mes_nascimento;
		this.email = email;
		this.celular = celular;
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.rg = rg;
		this.cpf = cpf;
		this.login = login;
		this.senha = senha;
	}

	
	public static int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getMes_nascimento() {
		return mes_nascimento;
	}

	public void setMes_nascimento(String mes_nascimento) {
		this.mes_nascimento = mes_nascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getCelular() {
		return celular;
	}

	public void setCelular(long celular) {
		this.celular = celular;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public long getCep() {
		return cep;
	}

	public void setCep(long cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public long getRg() {
		return rg;
	}

	public void setRg(long rg) {
		this.rg = rg;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public long getSenha() {
		return cpf;
	}

	public void setSenha(long senha) {
		this.senha = senha;
	}

	// verifica se o cliente ja esta cadastrado
	protected boolean verificaCadastroCliente(Cliente c) {
		if (c.isEhCadastrado() == false) {
			return false;
		} else {
			return true;
		}
	}

	// cadastra o cliente caso ainda nao esteja cadastrado
	protected boolean cadastraCliente(Cliente c) {
		if (!verificaCadastroCliente(c)) {
			new Cliente(nome, sobrenome, codigo, email, celular, cpf, rg, mes_nascimento, endereco, numero, 
					complemento, bairro, cep, cidade, estado);
			c.setEhCadastrado(true);
			return true; // return true SOMENTE SE O CADASTRO DEU CERTO;
		} else {
			return false;
		}
	}
}
