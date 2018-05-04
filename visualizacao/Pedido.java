package visualizacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Choice;
import java.awt.Label;
import java.awt.Checkbox;

public class Pedido {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pedido window = new Pedido();
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
	public Pedido() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 99, 71));
		frame.setBounds(100, 100, 700, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPedido = new JLabel("Pedido");
		lblPedido.setBounds(28, 11, 46, 14);
		frame.getContentPane().add(lblPedido);
		
		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setBounds(28, 44, 46, 14);
		frame.getContentPane().add(lblCliente);
		
		Choice choice = new Choice();
		choice.setBounds(90, 44, 145, 20);
		frame.getContentPane().add(choice);
		
		Label label = new Label("Tipo:");
		label.setBounds(28, 70, 62, 22);
		frame.getContentPane().add(label);
		
		Choice choice_1 = new Choice();
		choice_1.setBounds(90, 70, 145, 20);
		frame.getContentPane().add(choice_1);
		
		Label label_1 = new Label("Cobertura:");
		label_1.setBounds(28, 98, 62, 22);
		frame.getContentPane().add(label_1);
		
		Choice choice_2 = new Choice();
		choice_2.setBounds(90, 96, 145, 20);
		frame.getContentPane().add(choice_2);
		
		Label label_2 = new Label("Sabor:");
		label_2.setBounds(28, 122, 62, 22);
		frame.getContentPane().add(label_2);
		
		Choice choice_3 = new Choice();
		choice_3.setBounds(90, 122, 145, 20);
		frame.getContentPane().add(choice_3);
		
		Label label_3 = new Label("Recheio:");
		label_3.setBounds(28, 150, 62, 22);
		frame.getContentPane().add(label_3);
		
		Choice choice_4 = new Choice();
		choice_4.setBounds(90, 150, 145, 20);
		frame.getContentPane().add(choice_4);
		
		Label label_4 = new Label("Tamanho:");
		label_4.setBounds(276, 42, 62, 22);
		frame.getContentPane().add(label_4);
		
		Choice choice_5 = new Choice();
		choice_5.setBounds(351, 44, 145, 20);
		frame.getContentPane().add(choice_5);
		
		Label label_5 = new Label("Quantidade:");
		label_5.setBounds(276, 70, 62, 22);
		frame.getContentPane().add(label_5);
		
		Choice choice_6 = new Choice();
		choice_6.setBounds(351, 72, 145, 20);
		frame.getContentPane().add(choice_6);
		
		Label label_6 = new Label("Peso:");
		label_6.setBounds(276, 98, 62, 22);
		frame.getContentPane().add(label_6);
		
		
		
		
		
	}

}
