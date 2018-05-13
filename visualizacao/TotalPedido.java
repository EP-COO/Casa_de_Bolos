package visualizacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class TotalPedido {

	private JFrame frmBolosCorporation;
	/**
	 * @wbp.nonvisual location=-38,39
	 */
	private final JTextField textField = new JTextField();
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TotalPedido window = new TotalPedido();
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
	public TotalPedido() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		textField.setColumns(10);
		frmBolosCorporation = new JFrame();
		frmBolosCorporation.setTitle("Bolos Corporation");
		frmBolosCorporation.setBounds(100, 100, 450, 300);
		frmBolosCorporation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBolosCorporation.getContentPane().setLayout(null);
		
		JLabel lblValorTotal = new JLabel("Valor do Pedido:");
		lblValorTotal.setBounds(29, 51, 97, 20);
		frmBolosCorporation.getContentPane().add(lblValorTotal);
		
		textField_1 = new JTextField();
		textField_1.setBounds(126, 51, 86, 20);
		frmBolosCorporation.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblValorDoDesconto = new JLabel("Valor do Desconto:");
		lblValorDoDesconto.setBounds(29, 90, 97, 20);
		frmBolosCorporation.getContentPane().add(lblValorDoDesconto);
		
		JLabel lblValorTotal_1 = new JLabel("Valor Total:");
		lblValorTotal_1.setBounds(29, 130, 97, 20);
		frmBolosCorporation.getContentPane().add(lblValorTotal_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(126, 90, 86, 20);
		frmBolosCorporation.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(126, 130, 86, 20);
		frmBolosCorporation.getContentPane().add(textField_3);
		
		JButton btnConcluir = new JButton("Concluir");
		btnConcluir.setBounds(10, 203, 89, 23);
		frmBolosCorporation.getContentPane().add(btnConcluir);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(335, 203, 89, 23);
		frmBolosCorporation.getContentPane().add(btnCancelar);
		
		JMenuBar menuBar = new JMenuBar();
		frmBolosCorporation.setJMenuBar(menuBar);
		
		JMenuItem mntmTotalDePedido = new JMenuItem("Total do Pedido");
		menuBar.add(mntmTotalDePedido);
	}

}
