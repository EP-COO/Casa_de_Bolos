package visualizacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;

import javax.swing.AbstractButton;

public class TelaAbstrata {
	
	protected void addActionListener(AbstractButton btn, String actionListenerName) {
		Object autoRef = this;
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				try {
					Method method = autoRef.getClass().getMethod(
							actionListenerName, ActionEvent.class);
					method.invoke(autoRef, evt);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
