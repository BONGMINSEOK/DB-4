package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DI_CH_Page extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public void DI_CH_LOAD() {

				try {
					DI_CH_Page frame = new DI_CH_Page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
	}

	/**
	 * Create the frame.
	 */
	public DI_CH_Page() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 786, 307);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uAC10\uB3C5\uCD94\uAC00");
		lblNewLabel.setBounds(66, 10, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uAC10\uB3C5\uBC88\uD638");
		lblNewLabel_1.setBounds(12, 45, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(81, 42, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uC774\uB984");
		lblNewLabel_2.setBounds(12, 98, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(81, 95, 116, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\uCD9C\uC0DD\uC77C");
		lblNewLabel_3.setBounds(12, 145, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(81, 142, 116, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\uC131\uBCC4");
		lblNewLabel_4.setBounds(12, 188, 57, 15);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(81, 185, 116, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("\uCD94\uAC00");
		btnNewButton.setBounds(50, 228, 97, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("\uAC10\uB3C5 \uC0AD\uC81C");
		lblNewLabel_5.setBounds(280, 10, 57, 15);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\uAC10\uB3C5\uBC88\uD638");
		lblNewLabel_6.setBounds(223, 45, 57, 15);
		contentPane.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(294, 42, 116, 21);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\uC0AD\uC81C");
		btnNewButton_1.setBounds(280, 228, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_7 = new JLabel("\uAC10\uB3C5 \uC815\uBCF4 \uBCC0\uACBD");
		lblNewLabel_7.setBounds(540, 10, 90, 15);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\uAC10\uB3C5\uBC88\uD638");
		lblNewLabel_8.setBounds(464, 45, 57, 15);
		contentPane.add(lblNewLabel_8);
		
		textField_5 = new JTextField();
		textField_5.setBounds(540, 42, 116, 21);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("\uC774\uB984");
		lblNewLabel_9.setBounds(464, 98, 57, 15);
		contentPane.add(lblNewLabel_9);
		
		textField_6 = new JTextField();
		textField_6.setBounds(540, 95, 116, 21);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("\uCD9C\uC0DD\uC77C");
		lblNewLabel_10.setBounds(464, 145, 57, 15);
		contentPane.add(lblNewLabel_10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(540, 142, 116, 21);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("\uC131\uBCC4");
		lblNewLabel_11.setBounds(464, 188, 57, 15);
		contentPane.add(lblNewLabel_11);
		
		textField_8 = new JTextField();
		textField_8.setBounds(540, 185, 116, 21);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("\uBCC0\uACBD");
		btnNewButton_2.setBounds(513, 228, 97, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uD655\uC778");
		btnNewButton_3.setBounds(668, 41, 73, 23);
		contentPane.add(btnNewButton_3);
	}
}
