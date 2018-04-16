/**
 * 
 */
/**
 * @author Mara
 *
 */
package visualizacao;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class GerenciadorVisualizacaoSwing extends JFrame {
	
	public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		// configura look-and-feel
		for (UIManager.LookAndFeelInfo info : UIManager
				.getInstalledLookAndFeels()) {
			if ("Nimbus".equals(info.getName())) {
				UIManager.setLookAndFeel(info.getClassName());
				break;
			}
		}

		// mostra a tela em uma outra thread
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GerenciadorVisualizacaoSwing().setVisible(true);
			}
		});
	}
}
