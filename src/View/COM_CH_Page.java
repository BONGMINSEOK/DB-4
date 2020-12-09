package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class COM_CH_Page extends JFrame {

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
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public void COM_CH_LOAD() {

				try {
					COM_CH_Page frame = new COM_CH_Page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
	}

	/**
	 * Create the frame.
	 */
	public COM_CH_Page() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 프로그램 전체 종료가 아닌 해당 창만 종료가 된다.
		setBounds(100, 100, 754, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC0AC\uBC88\uD638");
		lblNewLabel.setBounds(12, 39, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\uC81C\uC791\uC0AC \uCD94\uAC00");
		label.setBounds(60, 10, 93, 15);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(81, 36, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uD68C\uC0AC\uC774\uB984");
		lblNewLabel_1.setBounds(12, 80, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(81, 77, 116, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_2.setBounds(12, 123, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(81, 120, 116, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\uCC3D\uB9BD\uC77C");
		lblNewLabel_3.setBounds(12, 162, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(81, 159, 116, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\uC804\uD654\uBC88\uD638\r\n");
		lblNewLabel_4.setBounds(12, 203, 57, 15);
		contentPane.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(81, 200, 116, 21);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("\uCD94\uAC00");
		btnNewButton.setBounds(49, 241, 97, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("\uC81C\uC791\uC0AC \uC0AD\uC81C");
		lblNewLabel_5.setBounds(271, 10, 75, 15);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\uD68C\uC0AC\uBC88\uD638");
		lblNewLabel_6.setBounds(229, 39, 57, 15);
		contentPane.add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(287, 36, 116, 21);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\uC0AD\uC81C");
		btnNewButton_1.setBounds(271, 241, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_7 = new JLabel("\uC81C\uC791\uC0AC \uC815\uBCF4 \uBCC0\uACBD\r\n");
		lblNewLabel_7.setBounds(481, 10, 108, 15);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\uD68C\uC0AC\uBC88\uD638");
		lblNewLabel_8.setBounds(439, 39, 57, 15);
		contentPane.add(lblNewLabel_8);
		
		textField_6 = new JTextField();
		textField_6.setBounds(510, 36, 116, 21);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("\uD68C\uC0AC\uC774\uB984");
		lblNewLabel_9.setBounds(439, 80, 57, 15);
		contentPane.add(lblNewLabel_9);
		
		textField_7 = new JTextField();
		textField_7.setBounds(510, 77, 116, 21);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_10.setBounds(439, 123, 57, 15);
		contentPane.add(lblNewLabel_10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(510, 120, 116, 21);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("\uCC3D\uB9BD\uC77C");
		lblNewLabel_11.setBounds(439, 162, 57, 15);
		contentPane.add(lblNewLabel_11);
		
		textField_9 = new JTextField();
		textField_9.setBounds(510, 159, 116, 21);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("\uC804\uD654\uBC88\uD638\r\n");
		lblNewLabel_12.setBounds(439, 203, 57, 15);
		contentPane.add(lblNewLabel_12);
		
		textField_10 = new JTextField();
		textField_10.setBounds(510, 200, 116, 21);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("\uBCC0\uACBD");
		btnNewButton_2.setBounds(481, 241, 97, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uD655\uC778");
		btnNewButton_3.setBounds(638, 35, 71, 23);
		contentPane.add(btnNewButton_3);
	}
}
