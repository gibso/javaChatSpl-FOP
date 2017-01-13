package javachat.ui;

import javax.swing.GroupLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ChatWindow {
	private ButtonGroup buttonGroupGender;
	private JRadioButton jRadioButtonMale;
	private JRadioButton jRadioButtonFemale;
	private JTextField jTextFieldDate;
	private JTextField jTextFieldEMail;
	private JLabel jLabelGender;
	private JLabel jLabelBirthday;
	private JLabel jLabelEMail;

	void initComponents() {

		jLabelBirthday = new javax.swing.JLabel();
		jLabelGender = new javax.swing.JLabel();
		jLabelEMail = new javax.swing.JLabel();
		buttonGroupGender = new javax.swing.ButtonGroup();
		jRadioButtonMale = new javax.swing.JRadioButton();
		jRadioButtonFemale = new javax.swing.JRadioButton();
		jTextFieldEMail = new javax.swing.JTextField();
		jTextFieldDate = new javax.swing.JTextField();

		buttonGroupGender.add(jRadioButtonMale);
		jRadioButtonMale.setText("Male");
		buttonGroupGender.add(jRadioButtonFemale);
		jRadioButtonFemale.setSelected(true);
		jRadioButtonFemale.setText("Female");
		jLabelGender.setText("Gender:");
		jLabelBirthday.setText("Birthday:");
		jLabelEMail.setText("Email-Address:");

		updateNameGroupHorizontal.addGroup(layout.createSequentialGroup().addComponent(jLabelGender)
				.addComponent(jRadioButtonMale).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jRadioButtonFemale)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
				.addComponent(jLabelBirthday)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
				.addComponent(jTextFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, 221,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
				.addComponent(jLabelEMail)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
				.addComponent(jTextFieldEMail, javax.swing.GroupLayout.PREFERRED_SIZE, 221,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE));

		updateNameGroupVertical
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabelGender)
						.addComponent(jRadioButtonMale).addComponent(jRadioButtonFemale).addComponent(jLabelBirthday)
						.addComponent(jTextFieldDate).addComponent(jLabelEMail).addComponent(jTextFieldEMail));

		original();
	}

	String getUsername() {
		
		String name = nameTextField.getText();
		
		if (jRadioButtonMale.isSelected())
			name = name + " (m) ";
		if (jRadioButtonFemale.isSelected())
			name = name + " (f) ";
		
		try {
			DateFormat format = new SimpleDateFormat("dd.MM.yyyy", Locale.GERMAN);	
			String birthdayStr = jTextFieldDate.getText();
			Date birthday = format.parse(birthdayStr);
			int age = new Date().getYear() - birthday.getYear();
			name = name + age;

		} catch (ParseException e) {
			System.out.println("exception: " + e.getMessage());
		}

		return name;
	}
}