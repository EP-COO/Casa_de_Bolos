package visualizacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CadastroBoloSimples {

	private JFrame frmBolosCorporation;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroBoloSimples window = new CadastroBoloSimples();
					window.frmBolosCorporation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CadastroBoloSimples() {
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
		
		JMenuItem mntmCadastroBoloSimples = new JMenuItem("Cadastro Bolo Simples");
		menuBar.add(mntmCadastroBoloSimples);
		frmBolosCorporation.getContentPane().setLayout(null);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(10, 203, 89, 23);
		frmBolosCorporation.getContentPane().add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(335, 203, 89, 23);
		frmBolosCorporation.getContentPane().add(btnCancelar);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(10, 64, 60, 14);
		frmBolosCorporation.getContentPane().add(lblQuantidade);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 25, 60, 14);
		frmBolosCorporation.getContentPane().add(lblNome);
		
		JLabel lblSabor = new JLabel("Sabor:");
		lblSabor.setBounds(10, 101, 60, 14);
		frmBolosCorporation.getContentPane().add(lblSabor);
		
		JLabel lblValidade = new JLabel("Validade:");
		lblValidade.setBounds(10, 147, 60, 14);
		frmBolosCorporation.getContentPane().add(lblValidade);
		
		textField = new JTextField();
		textField.setBounds(80, 22, 86, 20);
		frmBolosCorporation.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(80, 61, 86, 20);
		frmBolosCorporation.getContentPane().add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(80, 141, 86, 20);
		frmBolosCorporation.getContentPane().add(textField_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecionar um", "Banana", "Baunilha", "Cenoura", "Chocolate", "Iogurte", "Laranja", "Leite Condensado"}));
		comboBox.setBounds(80, 98, 86, 20);
		frmBolosCorporation.getContentPane().add(comboBox);
	}

}
