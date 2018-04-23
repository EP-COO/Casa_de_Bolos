package visualizacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class Home {

	private JFrame frame;
	private JLabel lblBemVindoAo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
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
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 127, 80));
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnEntrar = new JButton("FAZER LOGIN");
		btnEntrar.setBackground(new Color(255, 69, 0));
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEntrar.setBounds(146, 139, 126, 23);
		frame.getContentPane().add(btnEntrar);
		
		lblBemVindoAo = new JLabel("Bem vindo ao Sistema Bolos Corporation");
		lblBemVindoAo.setHorizontalAlignment(SwingConstants.CENTER);
		lblBemVindoAo.setBounds(47, 68, 337, 60);
		frame.getContentPane().add(lblBemVindoAo);
	}
}
