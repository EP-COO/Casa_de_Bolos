package visualizacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Choice;
import java.awt.Label;
import java.awt.Checkbox;
import javax.swing.JSpinner;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Button;

public class Cadastrar_Bolos {

	private JFrame frame;
	private JTextField textField;
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
					Cadastrar_Bolos window = new Cadastrar_Bolos();
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
	public Cadastrar_Bolos() {
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
		
		JLabel lblCadastarBolos = new JLabel("Cadastar Bolos");
		lblCadastarBolos.setBounds(27, 21, 128, 14);
		frame.getContentPane().add(lblCadastarBolos);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(27, 54, 39, 14);
		frame.getContentPane().add(lblTipo);
		
		Choice choice = new Choice();
		choice.setBounds(72, 54, 131, 20);
		frame.getContentPane().add(choice);
		
		Label label = new Label("Tamanho:");
		label.setBounds(209, 52, 55, 22);
		frame.getContentPane().add(label);
		
		Checkbox checkbox = new Checkbox("Pequeno");
		checkbox.setBounds(270, 54, 73, 22);
		frame.getContentPane().add(checkbox);
		
		Checkbox checkbox_1 = new Checkbox("Médio");
		checkbox_1.setBounds(349, 54, 55, 22);
		frame.getContentPane().add(checkbox_1);
		
		Checkbox checkbox_2 = new Checkbox("Grande");
		checkbox_2.setBounds(409, 54, 62, 22);
		frame.getContentPane().add(checkbox_2);
		
		Label label_1 = new Label("Sabor:");
		label_1.setBounds(477, 54, 62, 22);
		frame.getContentPane().add(label_1);
		
		Choice choice_1 = new Choice();
		choice_1.setBounds(516, 54, 144, 20);
		frame.getContentPane().add(choice_1);
		
		Label label_2 = new Label("Cobertura:");
		label_2.setBounds(24, 89, 62, 22);
		frame.getContentPane().add(label_2);
		
		Choice choice_2 = new Choice();
		choice_2.setBounds(92, 89, 111, 20);
		frame.getContentPane().add(choice_2);
		
		Label label_3 = new Label("Recheio:");
		label_3.setBounds(224, 89, 62, 22);
		frame.getContentPane().add(label_3);
		
		Choice choice_3 = new Choice();
		choice_3.setBounds(276, 91, 128, 20);
		frame.getContentPane().add(choice_3);
		
		Label label_4 = new Label("Quantidade:");
		label_4.setBounds(421, 89, 62, 22);
		frame.getContentPane().add(label_4);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(498, 91, 29, 20);
		frame.getContentPane().add(spinner);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setBounds(27, 130, 46, 14);
		frame.getContentPane().add(lblPeso);
		
		textField = new JTextField();
		textField.setBounds(58, 127, 62, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPreo = new JLabel("Preço:");
		lblPreo.setBounds(148, 130, 46, 14);
		frame.getContentPane().add(lblPreo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(185, 127, 79, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblHorasDeProduo = new JLabel("Horas de Produção:");
		lblHorasDeProduo.setBounds(281, 130, 105, 14);
		frame.getContentPane().add(lblHorasDeProduo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(396, 127, 73, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblValidade = new JLabel("Validade:");
		lblValidade.setBounds(493, 130, 46, 14);
		frame.getContentPane().add(lblValidade);
		
		textField_3 = new JTextField();
		textField_3.setBounds(550, 127, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		Button button = new Button("Cadastrar");
		button.setBounds(79, 259, 124, 22);
		frame.getContentPane().add(button);
		
		Button button_1 = new Button("Cancelar");
		button_1.setBounds(417, 259, 122, 22);
		frame.getContentPane().add(button_1);
	}
}
