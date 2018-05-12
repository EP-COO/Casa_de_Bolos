package visualizacao;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;

public class PedidoBoloSimples extends TelaAbstrata {

	private JFrame frmPedidoBoloSimples;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PedidoBoloSimples window = new PedidoBoloSimples();
					window.frmPedidoBoloSimples.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PedidoBoloSimples() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPedidoBoloSimples = new JFrame();
		frmPedidoBoloSimples.setTitle("Bolos Corporation");
		frmPedidoBoloSimples.setBounds(100, 100, 450, 300);
		frmPedidoBoloSimples.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmPedidoBoloSimples.setJMenuBar(menuBar);
		
		JMenuItem mntmPedidoBoloSimples = new JMenuItem("Pedido Bolo Simples");
		menuBar.add(mntmPedidoBoloSimples);
		frmPedidoBoloSimples.getContentPane().setLayout(null);
		addActionListener(mntmPedidoBoloSimples,  "pedidoBoloSimplesActionPerformed");
		JButton btnPedir = new JButton("Pedir");
		btnPedir.setBounds(10, 203, 89, 23);
		frmPedidoBoloSimples.getContentPane().add(btnPedir);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(335, 203, 89, 23);
		frmPedidoBoloSimples.getContentPane().add(btnCancelar);
		
		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setBounds(10, 27, 46, 14);
		frmPedidoBoloSimples.getContentPane().add(lblCliente);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(81, 24, 82, 20);
		frmPedidoBoloSimples.getContentPane().add(comboBox);
		
		JLabel lblSabor = new JLabel("Sabor:");
		lblSabor.setBounds(10, 63, 46, 14);
		frmPedidoBoloSimples.getContentPane().add(lblSabor);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(10, 100, 60, 14);
		frmPedidoBoloSimples.getContentPane().add(lblQuantidade);
		
		JLabel lblModoDeRetirada = new JLabel("Modo de retirada:");
		lblModoDeRetirada.setBounds(10, 140, 89, 14);
		frmPedidoBoloSimples.getContentPane().add(lblModoDeRetirada);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Selecionar um", "Banana", "Baunilha", "Cenoura", "Chocolate", "Iogurte", "Laranja", "Leite Condensado"}));
		comboBox_1.setBounds(81, 60, 82, 20);
		frmPedidoBoloSimples.getContentPane().add(comboBox_1);
		
		textField = new JTextField();
		textField.setBounds(81, 97, 86, 20);
		frmPedidoBoloSimples.getContentPane().add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnAgora = new JRadioButton("Agora");
		rdbtnAgora.setBounds(105, 136, 58, 23);
		frmPedidoBoloSimples.getContentPane().add(rdbtnAgora);
		
		JRadioButton rdbtnRetirada = new JRadioButton("Retirada");
		rdbtnRetirada.setBounds(165, 136, 67, 23);
		frmPedidoBoloSimples.getContentPane().add(rdbtnRetirada);
	}
	
	public void pedidoBoloSimplesActionPerformed(ActionEvent e) {
		
	}

}
