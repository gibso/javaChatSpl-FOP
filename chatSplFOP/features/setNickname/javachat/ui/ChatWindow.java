package javachat.ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;

public class ChatWindow {

	void initComponents() {

		JButton nicknameButton = new JButton();
		nicknameButton.setText("Update Name");

		nicknameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		featureButtonsHorizontal.addComponent(nicknameButton);
		featureButtonsVertical.addComponent(nicknameButton);

		original();
	}
}