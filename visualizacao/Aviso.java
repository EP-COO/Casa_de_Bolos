package visualizacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Aviso {

	private JFrame frmBolosCorporation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aviso window = new Aviso();
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
	public Aviso() {
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
		frmBolosCorporation.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("O sistema encontrou um erro. Refa\u00E7a a opera\u00E7\u00E3o ou retorne ao Menu.");
		lblNewLabel.setFont(new Font("Lucida Sans", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 414, 239);
		frmBolosCorporation.getContentPane().add(lblNewLabel);
		
		JButton btnRefazer = new JButton("Refazer");
		btnRefazer.setBounds(10, 227, 89, 23);
		frmBolosCorporation.getContentPane().add(btnRefazer);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.setBounds(335, 227, 89, 23);
		frmBolosCorporation.getContentPane().add(btnMenu);
		
		JMenuBar menuBar = new JMenuBar();
		frmBolosCorporation.setJMenuBar(menuBar);
		
		JMenuItem mntmAvisoErro = new JMenuItem("AVISO! ERRO!");
		menuBar.add(mntmAvisoErro);
	}
}
