package visualizacao;

import java.awt.EventQueue;
import java.awt.Font;

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

	public Home() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("Bolos Coorporation");
		frame.getContentPane().setBackground(new Color(255,255,255));
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JButton btnEntrar = new JButton("LOGIN");
		btnEntrar.setFont(new Font("Lucida Sans", 1, 12));
		btnEntrar.setForeground(Color.white);
		btnEntrar.setBackground(new Color(77,77,255));
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEntrar.setBounds(150, 139, 126, 23);
		frame.getContentPane().add(btnEntrar);
		
		btnEntrar.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	frame.dispose();		        	
	        	Login login = new Login();		        	 
	        	login.frame.setVisible(true);	        	
	        }

	    });
		
		lblBemVindoAo = new JLabel("BEM VINDO AO SISTEMA BOLOS COORPORATION");
		lblBemVindoAo.setFont(new Font("Lucida Sans", 1, 12));
		lblBemVindoAo.setForeground(Color.black);
		lblBemVindoAo.setHorizontalAlignment(SwingConstants.CENTER);
		lblBemVindoAo.setBounds(47, 68, 337, 60);
		frame.getContentPane().add(lblBemVindoAo);
	}
}

