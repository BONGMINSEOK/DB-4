package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MV_CH_Page extends JFrame {

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
	private JTextField textField_11;
	private JTextField textField_12;

	public void MV_CH_LOAD() {

				try {
					MV_CH_Page frame = new MV_CH_Page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
	}

	public MV_CH_Page() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// 프로그램 전체 종료가 아닌 해당 창만 종료가 된다.
		setBounds(100, 100, 757, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC601\uD654\uBC88\uD638");
		lblNewLabel.setBounds(12, 38, 57, 15);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(70, 35, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uC601\uD654\uC81C\uBAA9");
		lblNewLabel_1.setBounds(12, 77, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(70, 74, 116, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uAC1C\uBD09\uC77C");
		lblNewLabel_2.setBounds(12, 116, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(70, 113, 116, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\uC0C1\uC601\uC2DC\uAC04");
		lblNewLabel_3.setBounds(12, 153, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(70, 150, 116, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\uD3C9\uC810");
		lblNewLabel_4.setBounds(12, 194, 57, 15);
		contentPane.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(70, 191, 116, 21);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("\uC7A5\uB974");
		lblNewLabel_5.setBounds(12, 227, 57, 15);
		contentPane.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(70, 224, 116, 21);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("\uCD94\uAC00");
		btnNewButton.setBounds(70, 265, 97, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("\uC601\uD654 \uCD94\uAC00");
		lblNewLabel_6.setBounds(70, 10, 57, 15);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("\uC601\uD654 \uC0AD\uC81C");
		lblNewLabel_7.setBounds(294, 10, 57, 15);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\uC601\uD654 \uBC88\uD638");
		lblNewLabel_8.setBounds(224, 38, 57, 15);
		contentPane.add(lblNewLabel_8);
		
		textField_6 = new JTextField();
		textField_6.setBounds(285, 35, 116, 21);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\uC0AD\uC81C");
		btnNewButton_1.setBounds(285, 265, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_9 = new JLabel("\uC601\uD654 \uC815\uBCF4 \uBCC0\uACBD");
		lblNewLabel_9.setBounds(517, 10, 88, 15);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("\uC601\uD654 \uBC88\uD638");
		lblNewLabel_10.setBounds(451, 38, 57, 15);
		contentPane.add(lblNewLabel_10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(517, 35, 116, 21);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("\uC601\uD654\uC81C\uBAA9");
		lblNewLabel_11.setBounds(451, 77, 57, 15);
		contentPane.add(lblNewLabel_11);
		
		textField_8 = new JTextField();
		textField_8.setBounds(517, 74, 116, 21);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("\uAC1C\uBD09\uC77C");
		lblNewLabel_12.setBounds(451, 116, 57, 15);
		contentPane.add(lblNewLabel_12);
		
		textField_9 = new JTextField();
		textField_9.setBounds(517, 113, 116, 21);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("\uC0C1\uC601\uC2DC\uAC04\r\n");
		lblNewLabel_13.setBounds(451, 153, 57, 15);
		contentPane.add(lblNewLabel_13);
		
		textField_10 = new JTextField();
		textField_10.setBounds(517, 150, 116, 21);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("\uD3C9\uC810\r\n");
		lblNewLabel_14.setBounds(451, 194, 57, 15);
		contentPane.add(lblNewLabel_14);
		
		textField_11 = new JTextField();
		textField_11.setBounds(517, 191, 116, 21);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("\uC7A5\uB974");
		lblNewLabel_15.setBounds(451, 227, 57, 15);
		contentPane.add(lblNewLabel_15);
		
		textField_12 = new JTextField();
		textField_12.setBounds(517, 224, 116, 21);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("\uBCC0\uACBD");
		btnNewButton_2.setBounds(517, 265, 97, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uD655\uC778");
		btnNewButton_3.setBounds(645, 34, 84, 23);
		contentPane.add(btnNewButton_3);
	}
}
