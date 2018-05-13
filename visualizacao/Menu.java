package visualizacao;

import beans.Desconto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Menu extends TelaAbstrata {

	public JFrame frmBolosCorporation;
	protected JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
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
		
		JMenu mnCadastroCliente = new JMenu("Cadastros");
		menuBar.add(mnCadastroCliente);
		
		JMenuItem mntmCadastroCliente = new JMenuItem("Cadastro Cliente");
		mnCadastroCliente.add(mntmCadastroCliente);
		mnCadastroCliente.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	frame.dispose();		        	
	        	CadastroCliente cliente = new CadastroCliente();		        	 
	        	cliente.frameCadastroCliente.setVisible(true);	        	
	        }

	    });
		
		JMenuItem mntmCadastroFuncionario = new JMenuItem("Cadastro Funcionario");
		mnCadastroCliente.add(mntmCadastroFuncionario);
		
		JMenuItem mntmCadastroBoloSimples = new JMenuItem("Cadastro Bolo Simples");
		mnCadastroCliente.add(mntmCadastroBoloSimples);
		
		JMenuItem mntmCadastroBoloEspecial = new JMenuItem("Cadastro Bolo Especial");
		mnCadastroCliente.add(mntmCadastroBoloEspecial);
		
		JMenu mnPedido = new JMenu("Pedido");
		menuBar.add(mnPedido);
		
		JMenuItem mntmPedidoBoloSimples = new JMenuItem("Pedido Bolo Simples");
		mnPedido.add(mntmPedidoBoloSimples);
		
		JMenuItem mntmPedidoBoloEspecial = new JMenuItem("Pedido Bolo Especial");
		mnPedido.add(mntmPedidoBoloEspecial);
		
		JMenu mnListar = new JMenu("Listar");
		menuBar.add(mnListar);
		
		JMenuItem mntmBolosSimples = new JMenuItem("Bolos Simples");
		mnListar.add(mntmBolosSimples);
		
		JMenuItem mntmBolosEspeciais = new JMenuItem("Bolos Especiais");
		mnListar.add(mntmBolosEspeciais);
		
		JMenuItem mntmPedidoBoloSimples_1 = new JMenuItem("Pedido Bolo Simples");
		mnListar.add(mntmPedidoBoloSimples_1);
		
		JMenuItem mntmPedidoBoloEspecial_1 = new JMenuItem("Pedido Bolo Especial");
		mnListar.add(mntmPedidoBoloEspecial_1);
		
		JMenuItem mntmFuncionarios = new JMenuItem("Funcionarios");
		mnListar.add(mntmFuncionarios);
		addActionListener(mntmFuncionarios,  "teste");
		
		JMenuItem mntmClientes = new JMenuItem("Clientes");
		mnListar.add(mntmClientes);
		frmBolosCorporation.getContentPane().setLayout(null);
		
		JLabel lblBemVindoA = new JLabel("BEM VINDO \u00C0 BOLOS CORPORATION");
		lblBemVindoA.setHorizontalAlignment(SwingConstants.CENTER);
		lblBemVindoA.setFont(new Font("Lucida Sans Typewriter", Font.BOLD | Font.ITALIC, 22));
		lblBemVindoA.setBounds(10, 11, 414, 202);
		frmBolosCorporation.getContentPane().add(lblBemVindoA);
	}
	
	public void teste(ActionEvent e) {
		System.out.println("funfou!!!");
	}
	
	

}
