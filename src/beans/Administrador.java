package beans;

public class Administrador extends Funcionario{

	private String login;
	private long senha;
	
	public Administrador(String nome, String sobrenome, int codigo, String email, long celular, 
			 long cpf, long rg, String mes_nascimento, String endereco, int numero, String complemento, 
			 String bairro, long cep, String cidade, String estado, String login, long senha) {
		super(nome, sobrenome, codigo, email, celular, cpf, rg, mes_nascimento, endereco, numero, complemento, 
				bairro, cep, cidade, estado, login, senha);
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
		this.setLogin(login);
		this.setSenha(senha);
	}
	
	void cadastraFuncionario(Funcionario f) {
		f = new Funcionario(nome, sobrenome, codigo, email, celular, cpf, rg, mes_nascimento, endereco, numero, complemento, 
				bairro, cep, cidade, estado, login, senha);
	}

}
