package visualizacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class Tela_inicial {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_inicial window = new Tela_inicial();
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
	public Tela_inicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 127, 80));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnCadastrarFuncionrio = new JMenu("Cadastrar");
		mnCadastrarFuncionrio.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnCadastrarFuncionrio);
		
		JMenuItem mntmFuncionrios = new JMenuItem("Funcionários");
		mntmFuncionrios.setHorizontalAlignment(SwingConstants.LEFT);
		mnCadastrarFuncionrio.add(mntmFuncionrios);
		
		JMenuItem mntmClientes = new JMenuItem("Clientes");
		mnCadastrarFuncionrio.add(mntmClientes);
		
		JMenuItem mntmBolos = new JMenuItem("Bolos");
		mnCadastrarFuncionrio.add(mntmBolos);
		
		JMenu mnCadastrarBolo = new JMenu("Pedidos");
		menuBar.add(mnCadastrarBolo);
		
		JMenuItem mntmFazerPedidos = new JMenuItem("Fazer Pedidos");
		mnCadastrarBolo.add(mntmFazerPedidos);
		
		JMenu mnCadastrarCliente = new JMenu("Estoque");
		menuBar.add(mnCadastrarCliente);
		
		JMenuItem mntmVerificarEstoque = new JMenuItem("Verificar Estoque");
		mnCadastrarCliente.add(mntmVerificarEstoque);
	}

}
