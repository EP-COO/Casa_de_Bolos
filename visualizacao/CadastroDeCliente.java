package visualizacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.JList;
import java.awt.Choice;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroDeCliente {

	private JFrame frame;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroDeCliente window = new CadastroDeCliente();
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
	public CadastroDeCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 99, 71));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblCadastrarClientes = new JLabel("Cadastrar Clientes");
		lblCadastrarClientes.setBounds(10, 11, 128, 14);
		panel.add(lblCadastrarClientes);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 43, 46, 14);
		panel.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(46, 40, 144, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setBounds(216, 43, 73, 14);
		panel.add(lblSobrenome);
		
		textField_1 = new JTextField();
		textField_1.setBounds(283, 40, 144, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(448, 43, 46, 14);
		panel.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(492, 40, 168, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setBounds(10, 82, 46, 14);
		panel.add(lblCelular);
		
		textField_3 = new JTextField();
		textField_3.setBounds(56, 79, 134, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblTelFixo = new JLabel("Tel. Fixo:");
		lblTelFixo.setBounds(216, 82, 57, 14);
		panel.add(lblTelFixo);
		
		textField_4 = new JTextField();
		textField_4.setBounds(283, 79, 144, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblDataDeNasc = new JLabel("Data de Nasc.:");
		lblDataDeNasc.setBounds(10, 116, 84, 14);
		panel.add(lblDataDeNasc);
		
		textField_5 = new JTextField();
		textField_5.setBounds(87, 113, 102, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 141, 650, 14);
		panel.add(separator);
		
		JLabel lblEndereo = new JLabel("Endereço:");
		lblEndereo.setBounds(10, 152, 65, 14);
		panel.add(lblEndereo);
		
		textField_6 = new JTextField();
		textField_6.setBounds(69, 149, 266, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblN = new JLabel("Nº:");
		lblN.setBounds(348, 152, 27, 14);
		panel.add(lblN);
		
		textField_7 = new JTextField();
		textField_7.setBounds(372, 149, 46, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setBounds(436, 152, 73, 14);
		panel.add(lblComplemento);
		
		textField_8 = new JTextField();
		textField_8.setBounds(507, 149, 86, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(10, 182, 46, 14);
		panel.add(lblBairro);
		
		textField_9 = new JTextField();
		textField_9.setBounds(69, 179, 121, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(216, 182, 46, 14);
		panel.add(lblCep);
		
		textField_10 = new JTextField();
		textField_10.setBounds(249, 179, 86, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(341, 179, 40, 20);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(408, 182, 46, 14);
		panel.add(lblCidade);
		
		Choice choice = new Choice();
		choice.setBounds(460, 182, 133, 20);
		panel.add(choice);
		
		Button button = new Button("Cadastrar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(87, 243, 144, 22);
		panel.add(button);
		
		Button button_1 = new Button("Cancelar");
		button_1.setBounds(408, 243, 134, 22);
		panel.add(button_1);
	}
}
