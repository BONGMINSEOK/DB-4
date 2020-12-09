package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MV_DI_CH_Page extends JFrame {

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
	public void MV_DI_CH_Page() {

				try {
					MV_DI_CH_Page frame = new MV_DI_CH_Page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
	}

	/**
	 * Create the frame.
	 */
	public MV_DI_CH_Page() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 753, 230);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\uC601\uD654\uAC10\uB3C5 \uCD94\uAC00");
		label.setBounds(63, 10, 85, 15);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("\uAC10\uB3C5\uBC88\uD638");
		lblNewLabel.setBounds(12, 37, 57, 15);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(86, 34, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uC601\uD654\uBC88\uD638");
		lblNewLabel_1.setBounds(12, 80, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(86, 77, 116, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("\uCD94\uAC00");
		btnNewButton.setBounds(46, 131, 97, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("\uC601\uD654\uBC30\uC6B0 \uC0AD\uC81C");
		lblNewLabel_2.setBounds(293, 10, 85, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uAC10\uB3C5\uBC88\uD638");
		lblNewLabel_3.setBounds(239, 37, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(305, 34, 116, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\uC0AD\uC81C");
		btnNewButton_1.setBounds(281, 131, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("\uC601\uD654\uBC30\uC6B0 \uC815\uBCF4 \uBCC0\uACBD");
		lblNewLabel_4.setBounds(497, 10, 110, 15);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\uAC10\uB3C5\uBC88\uD638");
		lblNewLabel_5.setBounds(451, 37, 57, 15);
		contentPane.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(507, 34, 116, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("\uC601\uD654\uBC88\uD638");
		lblNewLabel_6.setBounds(451, 80, 57, 15);
		contentPane.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(507, 77, 116, 21);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("\uBCC0\uACBD");
		btnNewButton_2.setBounds(494, 131, 97, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uD655\uC778");
		btnNewButton_3.setBounds(635, 33, 75, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_7 = new JLabel("\uC601\uD654\uBC88\uD638");
		lblNewLabel_7.setBounds(239, 80, 57, 15);
		contentPane.add(lblNewLabel_7);
		
		textField_5 = new JTextField();
		textField_5.setBounds(305, 77, 116, 21);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
	}
}
