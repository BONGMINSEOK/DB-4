package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.AC_button;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AC_CH_Page extends JFrame {

	private JPanel contentPane;
	private JTextField i1;
	private JTextField i2;
	private JTextField i3;
	private JTextField i4;
	private JTextField d1;
	private JTextField c1;
	private JTextField c2;
	private JTextField c3;
	private JTextField c4;

	/**
	 * Launch the application.
	 */
	public void AC_CH_LOAD() {

				try {
					AC_CH_Page frame = new AC_CH_Page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
	}

	/**
	 * Create the frame.
	 */
	public AC_CH_Page() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 프로그램 전체 종료가 아닌 해당 창만 종료가 된다.
		setBounds(100, 100, 724, 281);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("배우번호");
		lblNewLabel.setBounds(12, 29, 57, 15);
		contentPane.add(lblNewLabel);
		
		i1 = new JTextField();
		i1.setBounds(76, 26, 116, 21);
		contentPane.add(i1);
		i1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uC774\uB984");
		lblNewLabel_1.setBounds(12, 72, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		i2 = new JTextField();
		i2.setBounds(76, 69, 116, 21);
		contentPane.add(i2);
		i2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uCD9C\uC0DD\uC77C");
		lblNewLabel_2.setBounds(12, 114, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		i3 = new JTextField();
		i3.setBounds(76, 111, 116, 21);
		contentPane.add(i3);
		i3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\uC131\uBCC4");
		lblNewLabel_3.setBounds(12, 154, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		i4 = new JTextField();
		i4.setBounds(76, 151, 116, 21);
		contentPane.add(i4);
		i4.setColumns(10);
		
		JButton ac_insert_button = new JButton("추가");
		ac_insert_button.setBounds(45, 199, 97, 23);
		contentPane.add(ac_insert_button);
		
		//추가버튼 이벤트
		ac_insert_button.addActionListener(new AC_button(i1,i2,i3,i4));
		
		
		
		JLabel lblNewLabel_4 = new JLabel("\uBC30\uC6B0 \uCD94\uAC00");
		lblNewLabel_4.setBounds(59, 4, 70, 15);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\uBC30\uC6B0 \uC0AD\uC81C");
		lblNewLabel_5.setBounds(275, 4, 57, 15);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\uBC30\uC6B0 \uBC88\uD638");
		lblNewLabel_6.setBounds(216, 29, 57, 15);
		contentPane.add(lblNewLabel_6);
		
		d1 = new JTextField();
		d1.setBounds(285, 26, 116, 21);
		contentPane.add(d1);
		d1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\uC0AD\uC81C");
		btnNewButton_1.setBounds(261, 199, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_7 = new JLabel("\uBC30\uC6B0 \uC815\uBCF4 \uBCC0\uACBD");
		lblNewLabel_7.setBounds(472, 4, 97, 15);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\uBC30\uC6B0\uBC88\uD638");
		lblNewLabel_8.setBounds(425, 29, 57, 15);
		contentPane.add(lblNewLabel_8);
		
		c1 = new JTextField();
		c1.setBounds(494, 26, 116, 21);
		contentPane.add(c1);
		c1.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("\uC774\uB984");
		lblNewLabel_9.setBounds(425, 72, 57, 15);
		contentPane.add(lblNewLabel_9);
		
		c2 = new JTextField();
		c2.setBounds(494, 69, 116, 21);
		contentPane.add(c2);
		c2.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("\uCD9C\uC0DD\uC77C");
		lblNewLabel_10.setBounds(425, 114, 57, 15);
		contentPane.add(lblNewLabel_10);
		
		c3 = new JTextField();
		c3.setBounds(494, 111, 116, 21);
		contentPane.add(c3);
		c3.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("\uC131\uBCC4");
		lblNewLabel_11.setBounds(425, 157, 57, 15);
		contentPane.add(lblNewLabel_11);
		
		c4 = new JTextField();
		c4.setBounds(494, 151, 116, 21);
		contentPane.add(c4);
		c4.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("\uD655\uC778");
		btnNewButton_2.setBounds(622, 25, 79, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uBCC0\uACBD");
		btnNewButton_3.setBounds(472, 199, 97, 23);
		contentPane.add(btnNewButton_3);
	}
}
