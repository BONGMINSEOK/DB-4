package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Controller.COM_button;

public class COM_CH_Page extends JFrame {

	private JPanel contentPane;
	private JTextField i1;
	private JTextField i2;
	private JTextField i3;
	private JTextField i4;
	private JTextField i5;
	private JTextField d1;
	private JTextField c1;
	private JTextField c2;
	private JTextField c3;
	private JTextField c4;
	private JTextField c5;

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
		
		i1 = new JTextField();
		i1.setBounds(81, 36, 116, 21);
		contentPane.add(i1);
		i1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uD68C\uC0AC\uC774\uB984");
		lblNewLabel_1.setBounds(12, 80, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		i2 = new JTextField();
		i2.setBounds(81, 77, 116, 21);
		contentPane.add(i2);
		i2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_2.setBounds(12, 123, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		i3 = new JTextField();
		i3.setBounds(81, 120, 116, 21);
		contentPane.add(i3);
		i3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\uCC3D\uB9BD\uC77C");
		lblNewLabel_3.setBounds(12, 162, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		i4 = new JTextField();
		i4.setBounds(81, 159, 116, 21);
		contentPane.add(i4);
		i4.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\uC804\uD654\uBC88\uD638\r\n");
		lblNewLabel_4.setBounds(12, 203, 57, 15);
		contentPane.add(lblNewLabel_4);
		
		i5 = new JTextField();
		i5.setBounds(81, 200, 116, 21);
		contentPane.add(i5);
		i5.setColumns(10);
		
		JButton com_insert_button = new JButton("추가");
		com_insert_button.setBounds(49, 241, 97, 23);
		contentPane.add(com_insert_button);
		
		//추가버튼 이벤트
		com_insert_button.addActionListener(new COM_button(i1,i2,i3,i4,i5));
		
		JLabel lblNewLabel_5 = new JLabel("\uC81C\uC791\uC0AC \uC0AD\uC81C");
		lblNewLabel_5.setBounds(271, 10, 75, 15);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\uD68C\uC0AC\uBC88\uD638");
		lblNewLabel_6.setBounds(229, 39, 57, 15);
		contentPane.add(lblNewLabel_6);
		
		d1 = new JTextField();
		d1.setBounds(287, 36, 116, 21);
		contentPane.add(d1);
		d1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\uC0AD\uC81C");
		btnNewButton_1.setBounds(271, 241, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_7 = new JLabel("\uC81C\uC791\uC0AC \uC815\uBCF4 \uBCC0\uACBD\r\n");
		lblNewLabel_7.setBounds(481, 10, 108, 15);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\uD68C\uC0AC\uBC88\uD638");
		lblNewLabel_8.setBounds(439, 39, 57, 15);
		contentPane.add(lblNewLabel_8);
		
		c1 = new JTextField();
		c1.setBounds(510, 36, 116, 21);
		contentPane.add(c1);
		c1.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("\uD68C\uC0AC\uC774\uB984");
		lblNewLabel_9.setBounds(439, 80, 57, 15);
		contentPane.add(lblNewLabel_9);
		
		c2 = new JTextField();
		c2.setBounds(510, 77, 116, 21);
		contentPane.add(c2);
		c2.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_10.setBounds(439, 123, 57, 15);
		contentPane.add(lblNewLabel_10);
		
		c3 = new JTextField();
		c3.setBounds(510, 120, 116, 21);
		contentPane.add(c3);
		c3.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("\uCC3D\uB9BD\uC77C");
		lblNewLabel_11.setBounds(439, 162, 57, 15);
		contentPane.add(lblNewLabel_11);
		
		c4 = new JTextField();
		c4.setBounds(510, 159, 116, 21);
		contentPane.add(c4);
		c4.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("\uC804\uD654\uBC88\uD638\r\n");
		lblNewLabel_12.setBounds(439, 203, 57, 15);
		contentPane.add(lblNewLabel_12);
		
		c5 = new JTextField();
		c5.setBounds(510, 200, 116, 21);
		contentPane.add(c5);
		c5.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("\uBCC0\uACBD");
		btnNewButton_2.setBounds(481, 241, 97, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uD655\uC778");
		btnNewButton_3.setBounds(638, 35, 71, 23);
		contentPane.add(btnNewButton_3);
	}
}
