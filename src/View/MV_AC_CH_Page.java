package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MV_AC_CH_Page extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;


	public void MV_AC_CH_LOAD() {

				try {
					MV_AC_CH_Page frame = new MV_AC_CH_Page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
	}


	public MV_AC_CH_Page() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 749, 287);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC601\uD654\uBC30\uC6B0 \uCD94\uAC00");
		lblNewLabel.setBounds(68, 10, 90, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uBC30\uC6B0\uBC88\uD638");
		lblNewLabel_1.setBounds(12, 45, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(87, 42, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uC601\uD654\uBC88\uD638");
		lblNewLabel_2.setBounds(12, 91, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(87, 88, 116, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\uC5ED\uD560");
		lblNewLabel_3.setBounds(12, 138, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(87, 135, 116, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("\uCD94\uAC00");
		btnNewButton.setBounds(58, 192, 97, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("\uC601\uD654\uBC30\uC6B0 \uC0AD\uC81C");
		lblNewLabel_4.setBounds(317, 10, 90, 15);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\uBC30\uC6B0\uBC88\uD638");
		lblNewLabel_5.setBounds(248, 45, 57, 15);
		contentPane.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(317, 42, 116, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\uC0AD\uC81C");
		btnNewButton_1.setBounds(310, 192, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("\uC601\uD654\uBC30\uC6B0 \uC815\uBCF4 \uBCC0\uACBD");
		lblNewLabel_6.setBounds(512, 10, 116, 15);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("\uBC30\uC6B0\uBC88\uD638");
		lblNewLabel_7.setBounds(465, 45, 57, 15);
		contentPane.add(lblNewLabel_7);
		
		textField_4 = new JTextField();
		textField_4.setBounds(535, 42, 116, 21);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("\uC601\uD654\uBC88\uD638");
		lblNewLabel_8.setBounds(465, 91, 57, 15);
		contentPane.add(lblNewLabel_8);
		
		textField_5 = new JTextField();
		textField_5.setBounds(535, 88, 116, 21);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("\uC5ED\uD560");
		lblNewLabel_9.setBounds(465, 138, 57, 15);
		contentPane.add(lblNewLabel_9);
		
		textField_6 = new JTextField();
		textField_6.setBounds(535, 135, 116, 21);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("\uBCC0\uACBD");
		btnNewButton_2.setBounds(512, 192, 97, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uD655\uC778");
		btnNewButton_3.setBounds(663, 41, 57, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_10 = new JLabel("\uC601\uD654\uBC88\uD638");
		lblNewLabel_10.setBounds(248, 91, 57, 15);
		contentPane.add(lblNewLabel_10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(317, 88, 116, 21);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
	}

}
