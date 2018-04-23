package visualizacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JList;
import java.awt.Choice;
import javax.swing.JButton;

public class Cadastro_funcionario {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblSobrenome;
	private JTextField textField_3;
	private JLabel lblEmail;
	private JTextField textField_4;
	private JLabel lblTelFixo;
	private JTextField textField_5;
	private JLabel lblCpf;
	private JTextField textField_6;
	private JLabel lblRg;
	private JTextField textField_7;
	private JTextField textField_8;
	private JLabel lblNewLabel;
	private JTextField textField_9;
	private JLabel lblComplemento;
	private JTextField textField_10;
	private JLabel lblBairro;
	private JTextField textField_11;
	private JLabel lblCep;
	private JTextField textField_12;
	private JLabel lblCidade;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro_funcionario window = new Cadastro_funcionario();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cadastro_funcionario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 99, 71));
		frame.setBounds(100, 100, 700, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCadastroDeFuncionrios = new JLabel("Cadastro de Funcionários");
		lblCadastroDeFuncionrios.setBounds(23, 11, 199, 34);
		frame.getContentPane().add(lblCadastroDeFuncionrios);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(21, 56, 46, 14);
		frame.getContentPane().add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(61, 53, 142, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setBounds(21, 81, 46, 16);
		frame.getContentPane().add(lblCelular);
		
		textField_1 = new JTextField();
		textField_1.setBounds(61, 79, 142, 18);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDataDeNas = new JLabel("Data de Nasc.:");
		lblDataDeNas.setBounds(21, 106, 72, 14);
		frame.getContentPane().add(lblDataDeNas);
		
		textField_2 = new JTextField();
		textField_2.setBounds(98, 103, 105, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setBounds(217, 56, 63, 14);
		frame.getContentPane().add(lblSobrenome);
		
		textField_3 = new JTextField();
		textField_3.setBounds(278, 53, 130, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		lblEmail = new JLabel("Email:");
		lblEmail.setBounds(419, 56, 46, 14);
		frame.getContentPane().add(lblEmail);
		
		textField_4 = new JTextField();
		textField_4.setBounds(451, 53, 223, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		lblTelFixo = new JLabel("Tel. Fixo:");
		lblTelFixo.setBounds(227, 82, 46, 14);
		frame.getContentPane().add(lblTelFixo);
		
		textField_5 = new JTextField();
		textField_5.setBounds(278, 79, 130, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(419, 82, 28, 14);
		frame.getContentPane().add(lblCpf);
		
		textField_6 = new JTextField();
		textField_6.setBounds(451, 79, 223, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		lblRg = new JLabel("RG:");
		lblRg.setBounds(252, 106, 28, 14);
		frame.getContentPane().add(lblRg);
		
		textField_7 = new JTextField();
		textField_7.setBounds(278, 103, 130, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 148, 622, -7);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 131, 654, 14);
		frame.getContentPane().add(separator_1);
		
		JLabel lblEndereo = new JLabel("Endereço:");
		lblEndereo.setBounds(20, 144, 57, 14);
		frame.getContentPane().add(lblEndereo);
		
		textField_8 = new JTextField();
		textField_8.setBounds(73, 141, 257, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		lblNewLabel = new JLabel("Nº:");
		lblNewLabel.setBounds(349, 144, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField_9 = new JTextField();
		textField_9.setBounds(372, 141, 46, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		lblComplemento = new JLabel("Complemento:");
		lblComplemento.setBounds(428, 144, 72, 14);
		frame.getContentPane().add(lblComplemento);
		
		textField_10 = new JTextField();
		textField_10.setBounds(510, 141, 164, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(21, 169, 37, 14);
		frame.getContentPane().add(lblBairro);
		
		textField_11 = new JTextField();
		textField_11.setBounds(61, 166, 142, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		lblCep = new JLabel("CEP:");
		lblCep.setBounds(234, 169, 46, 14);
		frame.getContentPane().add(lblCep);
		
		textField_12 = new JTextField();
		textField_12.setBounds(263, 166, 86, 20);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(382, 169, 46, 14);
		frame.getContentPane().add(lblCidade);
		
		JList list = new JList();
		list.setBounds(451, 182, 1, 1);
		frame.getContentPane().add(list);
		
		Choice choice = new Choice();
		choice.setBounds(426, 166, 154, 20);
		frame.getContentPane().add(choice);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(23, 194, 654, 14);
		frame.getContentPane().add(separator_2);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(23, 208, 46, 14);
		frame.getContentPane().add(lblLogin);
		
		textField_13 = new JTextField();
		textField_13.setBounds(56, 205, 166, 20);
		frame.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(244, 208, 46, 14);
		frame.getContentPane().add(lblSenha);
		
		textField_14 = new JTextField();
		textField_14.setBounds(285, 205, 99, 20);
		frame.getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar senha:");
		lblConfirmarSenha.setBounds(401, 208, 91, 14);
		frame.getContentPane().add(lblConfirmarSenha);
		
		textField_15 = new JTextField();
		textField_15.setBounds(489, 205, 121, 20);
		frame.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(96, 257, 89, 23);
		frame.getContentPane().add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(424, 257, 89, 23);
		frame.getContentPane().add(btnCancelar);
	}
}
