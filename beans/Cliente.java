/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template cile, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Date;

public class Cliente extends Pessoa {
    
	protected static int codigo;
	protected String nome;
	protected String sobrenome;
	protected static String mes_nascimento; // selecionar apenas o mes
	protected String email;
	protected long celular;
	protected String endereco;
	protected int numero;
	protected String complemento;
	protected String bairro;
	protected long cep;
	protected String cidade;
	protected String estado;
	protected long rg;
	protected long cpf;
	
    //Atributos da classe
	protected boolean ehCadastrado = false;
    
    //Construtor 
    public Cliente(String nome, String sobrenome, int codigo, String email, long celular, long cpf,
			long rg, String mes_nascimento, String endereco, int numero, String complemento, String bairro,
			long cep, String cidade, String estado) {
  
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
    }
    
    
    //Método get and set


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
	public static String getMes_nascimento() {
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
	
    public boolean isEhCadastrado() {
		return ehCadastrado;
	}

	public void setEhCadastrado(boolean ehCadastrado) {
		this.ehCadastrado = ehCadastrado;
	}


	public void realizaPedido(Pedido p) {
    	
    }
    
}
