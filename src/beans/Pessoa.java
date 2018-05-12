
package beans;

public abstract class Pessoa {

	// Atributos da classe Pessoa
	protected static int codigo;
	protected String nome;
	protected String sobrenome;
	protected String mes_nascimento; // selecionar apenas o mes
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
	
	public static int getCodigo() {
		return codigo;
	}
	

}
