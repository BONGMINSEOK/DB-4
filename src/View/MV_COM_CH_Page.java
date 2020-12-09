package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MV_COM_CH_Page extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public void MV_COM_CH_LOAD() {

				try {
					MV_COM_CH_Page frame = new MV_COM_CH_Page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
	}

	/**
	 * Create the frame.
	 */
	public MV_COM_CH_Page() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 832, 248);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC601\uD654\uC81C\uC791\uC0AC \uCD94\uAC00");
		lblNewLabel.setBounds(67, 10, 105, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC601\uD654\uBC88\uD638");
		lblNewLabel_1.setBounds(12, 46, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(82, 43, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uC81C\uC791\uC0AC\uBC88\uD638");
		lblNewLabel_2.setBounds(12, 90, 70, 15);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(82, 87, 116, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("\uCD94\uAC00");
		btnNewButton.setBounds(52, 140, 97, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("\uC601\uD654\uC81C\uC791\uC0AC \uC0AD\uC81C");
		lblNewLabel_3.setBounds(306, 10, 105, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\uC601\uD654\uBC88\uD638");
		lblNewLabel_4.setBounds(249, 46, 57, 15);
		contentPane.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(331, 43, 116, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(331, 87, 116, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("\uC81C\uC791\uC0AC\uBC88\uD638");
		lblNewLabel_5.setBounds(249, 90, 70, 15);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("\uC0AD\uC81C");
		btnNewButton_1.setBounds(294, 140, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("\uC601\uD654\uC81C\uC791\uC0AC \uC815\uBCF4 \uBCC0\uACBD");
		lblNewLabel_6.setBounds(588, 10, 127, 15);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("\uC601\uD654\uBC88\uD638");
		lblNewLabel_7.setBounds(518, 46, 57, 15);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\uC81C\uC791\uC0AC\uBC88\uD638");
		lblNewLabel_8.setBounds(518, 90, 70, 15);
		contentPane.add(lblNewLabel_8);
		
		textField_4 = new JTextField();
		textField_4.setBounds(588, 43, 116, 21);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(588, 87, 116, 21);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("\uBCC0\uACBD");
		btnNewButton_2.setBounds(556, 140, 97, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uD655\uC778");
		btnNewButton_3.setBounds(723, 42, 77, 23);
		contentPane.add(btnNewButton_3);
	}

}
