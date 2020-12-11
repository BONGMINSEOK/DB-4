package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.AC_button;
import Controller.MV_AC_button;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MV_AC_CH_Page extends JFrame {

	private JPanel contentPane;
	private JTextField i1;
	private JTextField i2;
	private JTextField i3;
	private JTextField d1;
	private JTextField c1;
	private JTextField c2;
	private JTextField c3;
	private JTextField d2;


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
		
		i1 = new JTextField();
		i1.setBounds(87, 42, 116, 21);
		contentPane.add(i1);
		i1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uC601\uD654\uBC88\uD638");
		lblNewLabel_2.setBounds(12, 91, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		i2 = new JTextField();
		i2.setBounds(87, 88, 116, 21);
		contentPane.add(i2);
		i2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\uC5ED\uD560");
		lblNewLabel_3.setBounds(12, 138, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		i3 = new JTextField();
		i3.setBounds(87, 135, 116, 21);
		contentPane.add(i3);
		i3.setColumns(10);
		
		JButton mv_ac_insert_button = new JButton("추가");
		mv_ac_insert_button.setBounds(58, 192, 97, 23);
		contentPane.add(mv_ac_insert_button);
		
		//추가버튼 이벤트
		mv_ac_insert_button.addActionListener(new MV_AC_button(i1,i2,i3));
		
		JLabel lblNewLabel_4 = new JLabel("\uC601\uD654\uBC30\uC6B0 \uC0AD\uC81C");
		lblNewLabel_4.setBounds(317, 10, 90, 15);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\uBC30\uC6B0\uBC88\uD638");
		lblNewLabel_5.setBounds(248, 45, 57, 15);
		contentPane.add(lblNewLabel_5);
		
		d1 = new JTextField();
		d1.setBounds(317, 42, 116, 21);
		contentPane.add(d1);
		d1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\uC0AD\uC81C");
		btnNewButton_1.setBounds(310, 192, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("\uC601\uD654\uBC30\uC6B0 \uC815\uBCF4 \uBCC0\uACBD");
		lblNewLabel_6.setBounds(512, 10, 116, 15);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("\uBC30\uC6B0\uBC88\uD638");
		lblNewLabel_7.setBounds(465, 45, 57, 15);
		contentPane.add(lblNewLabel_7);
		
		c1 = new JTextField();
		c1.setBounds(535, 42, 116, 21);
		contentPane.add(c1);
		c1.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("\uC601\uD654\uBC88\uD638");
		lblNewLabel_8.setBounds(465, 91, 57, 15);
		contentPane.add(lblNewLabel_8);
		
		c2 = new JTextField();
		c2.setBounds(535, 88, 116, 21);
		contentPane.add(c2);
		c2.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("\uC5ED\uD560");
		lblNewLabel_9.setBounds(465, 138, 57, 15);
		contentPane.add(lblNewLabel_9);
		
		c3 = new JTextField();
		c3.setBounds(535, 135, 116, 21);
		contentPane.add(c3);
		c3.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("\uBCC0\uACBD");
		btnNewButton_2.setBounds(512, 192, 97, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uD655\uC778");
		btnNewButton_3.setBounds(663, 41, 57, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_10 = new JLabel("\uC601\uD654\uBC88\uD638");
		lblNewLabel_10.setBounds(248, 91, 57, 15);
		contentPane.add(lblNewLabel_10);
		
		d2 = new JTextField();
		d2.setBounds(317, 88, 116, 21);
		contentPane.add(d2);
		d2.setColumns(10);
	}

}
