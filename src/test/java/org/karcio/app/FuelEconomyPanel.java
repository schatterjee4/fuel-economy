package org.karcio.app;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class FuelEconomyPanel extends JPanel {

	private static final long serialVersionUID = 5217699510891524573L;
	private JLabel label1;
	private JLabel label2;
	private JTextArea textArea2;
	private JTextArea textArea1;
	private JButton button1;

	public FuelEconomyPanel() {
		setLayout(new BorderLayout());

		label1 = new JLabel("Podaj ilosc pobranego paliwa");
		add(label1, BorderLayout.NORTH);

		/*
		 * textField1 = new JTextField(2); add(textField1,
		 * BorderLayout.AFTER_LAST_LINE);
		 */

		textArea1 = new JTextArea(1, 1);
		textArea1.setEditable(true);
		add(textArea1, BorderLayout.AFTER_LAST_LINE);

		label2 = new JLabel("Podaj ilosc przejechanych kilometrow");
		add(label2, BorderLayout.CENTER);

		/*
		 * textField2 = new JTextField(2); add(textField2,
		 * BorderLayout.AFTER_LAST_LINE);
		 */

		textArea2 = new JTextArea(1, 1);
		textArea2.setEditable(true);
		add(textArea2, BorderLayout.AFTER_LAST_LINE);

		button1 = new JButton("oblicz");
		add(button1);

	}

}
