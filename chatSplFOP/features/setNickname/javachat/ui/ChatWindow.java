package javachat.ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javachat.JavaChat;
import javachat.network.Client;

public class ChatWindow {

	private JTextField nameTextField;
	private JButton updateNameButton;

	void initComponents() {

		JLabel nameLabel = new JLabel();
		updateNameButton = new JButton();
		nameTextField = new JTextField();

		nameLabel.setText("Name:");
		nameTextField.setText("Unknown");
		updateNameButton.setText("Update Name");
		updateNameButton.setEnabled(false);

		updateNameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Client client = JavaChat.getClient();
				if (client != null) {
					String name = getUsername();
					client.setName(name);
				}
			}
		});

		updateNameGroupHorizontal.addGroup(layout.createSequentialGroup().addComponent(nameLabel).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(nameTextField)
				.addComponent(updateNameButton));

		updateNameGroupVertical.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
				GroupLayout.PREFERRED_SIZE).addComponent(nameLabel).addComponent(updateNameButton));

		original();
	}

	String getUsername() {
		return nameTextField.getText();
	}
	
	void lockServerDetails(boolean lock) {
		original(lock);
		updateNameButton.setEnabled(lock);
	}
}