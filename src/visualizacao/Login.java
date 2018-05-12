package visualizacao;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class Login {

	protected JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		initialize();
	}

	private void initialize() {
		setFrame(new JFrame("Bolos Coorporation"));
		getFrame().getContentPane().setBackground(new Color(255,255,255));
		getFrame().setBounds(100, 100, 450, 300);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		getFrame().setResizable(false);
		
		JLabel lblAviso = new JLabel("ENTRAR NA CASA DE BOLOS");
		lblAviso.setFont(new Font("Lucida Sans", 1, 12));
		lblAviso.setForeground(Color.black);
		lblAviso.setBounds(130, 30, 200, 14);
		getFrame().getContentPane().add(lblAviso);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Lucida Sans", 1, 12));
		lblLogin.setForeground(Color.black);
		lblLogin.setBounds(130, 74, 46, 14);
		getFrame().getContentPane().add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Lucida Sans", 1, 12));
		lblSenha.setForeground(Color.black);
		lblSenha.setBounds(130, 123, 46, 14);		
		getFrame().getContentPane().add(lblSenha);
		
		JTextField txtLogin = new JTextField();
		txtLogin.setBounds(130, 92, 183, 20);
		getFrame().getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		JTextField txtSenha = new JTextField();
		txtSenha.setBounds(130, 141, 183, 20);
		getFrame().getContentPane().add(txtSenha);
		txtSenha.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Lucida Sans", 1, 12));
		btnEntrar.setForeground(Color.white);
		btnEntrar.setBackground(new Color(77,77,255));
		btnEntrar.setBounds(130, 184, 183, 23);
		getFrame().getContentPane().add(btnEntrar);
		
		btnEntrar.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	frame.dispose();		        	
	        	Menu menu = new Menu();		        	 
	        	menu.frame.setVisible(true);	        	
	        }

	    });
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	
	
}
