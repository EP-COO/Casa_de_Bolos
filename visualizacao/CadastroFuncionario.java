package visualizacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class CadastroFuncionario {

	private JFrame frmBolosCorporation;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_13;
	private JPasswordField pwdSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCliente window = new CadastroCliente();
					window.frmBolosCorporation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public CadastroFuncionario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBolosCorporation = new JFrame();
		frmBolosCorporation.setTitle("Bolos Corporation");
		frmBolosCorporation.setBounds(100, 100, 450, 300);
		frmBolosCorporation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmBolosCorporation.setJMenuBar(menuBar);
		
		JMenuItem mntmCadastroCliente = new JMenuItem("Cadastro Funcion\u00E1rio");
		menuBar.add(mntmCadastroCliente);
		frmBolosCorporation.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(65, 23, 96, 20);
		frmBolosCorporation.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 26, 46, 14);
		frmBolosCorporation.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(277, 23, 96, 20);
		frmBolosCorporation.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(65, 51, 96, 20);
		frmBolosCorporation.getContentPane().add(textField_2);
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setBounds(171, 26, 66, 14);
		frmBolosCorporation.getContentPane().add(lblSobrenome);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setBounds(171, 51, 117, 14);
		frmBolosCorporation.getContentPane().add(lblDataDeNascimento);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setBounds(10, 51, 46, 14);
		frmBolosCorporation.getContentPane().add(lblCelular);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(277, 51, 96, 20);
		frmBolosCorporation.getContentPane().add(textField_3);
		
		JLabel lblTelefoneFixo = new JLabel("Tel Fixo:");
		lblTelefoneFixo.setBounds(10, 79, 88, 14);
		frmBolosCorporation.getContentPane().add(lblTelefoneFixo);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(65, 76, 96, 20);
		frmBolosCorporation.getContentPane().add(textField_4);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setBounds(171, 76, 46, 14);
		frmBolosCorporation.getContentPane().add(lblRg);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(317, 82, 46, 14);
		frmBolosCorporation.getContentPane().add(lblCpf);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(213, 76, 79, 20);
		frmBolosCorporation.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(345, 76, 79, 20);
		frmBolosCorporation.getContentPane().add(textField_6);
		
		JLabel lblNewLabel_1 = new JLabel("Endere\u00E7o:");
		lblNewLabel_1.setBounds(10, 104, 58, 14);
		frmBolosCorporation.getContentPane().add(lblNewLabel_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(65, 101, 96, 20);
		frmBolosCorporation.getContentPane().add(textField_7);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setBounds(171, 104, 74, 14);
		frmBolosCorporation.getContentPane().add(lblComplemento);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(246, 101, 46, 20);
		frmBolosCorporation.getContentPane().add(textField_8);
		
		JLabel lblN = new JLabel("N\u00BA:");
		lblN.setBounds(317, 104, 46, 14);
		frmBolosCorporation.getContentPane().add(lblN);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(345, 101, 46, 20);
		frmBolosCorporation.getContentPane().add(textField_9);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(10, 129, 58, 14);
		frmBolosCorporation.getContentPane().add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(171, 129, 58, 14);
		frmBolosCorporation.getContentPane().add(lblCidade);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(302, 129, 58, 14);
		frmBolosCorporation.getContentPane().add(lblEstado);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(65, 126, 96, 20);
		frmBolosCorporation.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(213, 126, 79, 20);
		frmBolosCorporation.getContentPane().add(textField_11);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"}));
		comboBox.setBounds(345, 126, 59, 20);
		frmBolosCorporation.getContentPane().add(comboBox);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(10, 190, 89, 23);
		frmBolosCorporation.getContentPane().add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(335, 190, 89, 23);
		frmBolosCorporation.getContentPane().add(btnCancelar);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(10, 152, 46, 14);
		frmBolosCorporation.getContentPane().add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(171, 154, 46, 14);
		frmBolosCorporation.getContentPane().add(lblSenha);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(65, 149, 96, 20);
		frmBolosCorporation.getContentPane().add(textField_13);
		
		pwdSenha = new JPasswordField();
		pwdSenha.setBounds(213, 149, 79, 20);
		frmBolosCorporation.getContentPane().add(pwdSenha);
	}
}
