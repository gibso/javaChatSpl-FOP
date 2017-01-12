package javachat.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatWindow {
	
	void initComponents(){
		
		
		JButton buttonPluginButton = new JButton();
		buttonPluginButton.setText("Clear");

		buttonPluginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTextAreaChat.setText("");
			}
		});

		pluginButtonsHorizontal.addComponent(buttonPluginButton);
		pluginButtonsVertical.addComponent(buttonPluginButton);
		
		original();
	
	}
}