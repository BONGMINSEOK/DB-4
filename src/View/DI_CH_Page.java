package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Controller.DI_button;

public class DI_CH_Page extends JFrame {

	private JPanel contentPane;
	private JTextField I1;
	private JTextField I2;
	private JTextField I3;
	private JTextField I4;
	private JTextField D1;
	private JTextField C1;
	private JTextField C2;
	private JTextField C3;
	private JTextField C4;

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
		
		I1 = new JTextField();
		I1.setBounds(81, 42, 116, 21);
		contentPane.add(I1);
		I1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uC774\uB984");
		lblNewLabel_2.setBounds(12, 98, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		I2 = new JTextField();
		I2.setBounds(81, 95, 116, 21);
		contentPane.add(I2);
		I2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\uCD9C\uC0DD\uC77C");
		lblNewLabel_3.setBounds(12, 145, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		I3 = new JTextField();
		I3.setBounds(81, 142, 116, 21);
		contentPane.add(I3);
		I3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\uC131\uBCC4");
		lblNewLabel_4.setBounds(12, 188, 57, 15);
		contentPane.add(lblNewLabel_4);
		
		I4 = new JTextField();
		I4.setBounds(81, 185, 116, 21);
		contentPane.add(I4);
		I4.setColumns(10);
		
		JButton di_insert_button = new JButton("추가");
		di_insert_button.setBounds(50, 228, 97, 23);
		contentPane.add(di_insert_button);
		
		//추가버튼 이벤트
		di_insert_button.addActionListener(new DI_button(I1,I2,I3,I4));

		
		JLabel lblNewLabel_5 = new JLabel("\uAC10\uB3C5 \uC0AD\uC81C");
		lblNewLabel_5.setBounds(280, 10, 57, 15);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\uAC10\uB3C5\uBC88\uD638");
		lblNewLabel_6.setBounds(223, 45, 57, 15);
		contentPane.add(lblNewLabel_6);
		
		D1 = new JTextField();
		D1.setBounds(294, 42, 116, 21);
		contentPane.add(D1);
		D1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\uC0AD\uC81C");
		btnNewButton_1.setBounds(280, 228, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_7 = new JLabel("\uAC10\uB3C5 \uC815\uBCF4 \uBCC0\uACBD");
		lblNewLabel_7.setBounds(540, 10, 90, 15);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\uAC10\uB3C5\uBC88\uD638");
		lblNewLabel_8.setBounds(464, 45, 57, 15);
		contentPane.add(lblNewLabel_8);
		
		C1 = new JTextField();
		C1.setBounds(540, 42, 116, 21);
		contentPane.add(C1);
		C1.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("\uC774\uB984");
		lblNewLabel_9.setBounds(464, 98, 57, 15);
		contentPane.add(lblNewLabel_9);
		
		C2 = new JTextField();
		C2.setBounds(540, 95, 116, 21);
		contentPane.add(C2);
		C2.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("\uCD9C\uC0DD\uC77C");
		lblNewLabel_10.setBounds(464, 145, 57, 15);
		contentPane.add(lblNewLabel_10);
		
		C3 = new JTextField();
		C3.setBounds(540, 142, 116, 21);
		contentPane.add(C3);
		C3.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("\uC131\uBCC4");
		lblNewLabel_11.setBounds(464, 188, 57, 15);
		contentPane.add(lblNewLabel_11);
		
		C4 = new JTextField();
		C4.setBounds(540, 185, 116, 21);
		contentPane.add(C4);
		C4.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("\uBCC0\uACBD");
		btnNewButton_2.setBounds(513, 228, 97, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uD655\uC778");
		btnNewButton_3.setBounds(668, 41, 73, 23);
		contentPane.add(btnNewButton_3);
	}
}
