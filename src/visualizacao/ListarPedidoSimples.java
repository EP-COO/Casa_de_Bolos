package visualizacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;

public class ListarPedidoSimples {

	private JFrame frmBolosCorporation;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarPedidoSimples window = new ListarPedidoSimples();
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
	public ListarPedidoSimples() {
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
		
		JMenuItem mntmListarClientes = new JMenuItem("Listar Pedido Bolo Simples");
		menuBar.add(mntmListarClientes);
		frmBolosCorporation.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 226, 414, -200);
		frmBolosCorporation.getContentPane().add(table);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 11, 414, 215);
		frmBolosCorporation.getContentPane().add(textPane);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(417, 0, 17, 226);
		frmBolosCorporation.getContentPane().add(scrollBar);
	}
}
