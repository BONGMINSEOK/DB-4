package View;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Controller.MV_DI_button;

public class MV_DI_CH_Page extends JFrame {

	private JPanel contentPane;
	private JTextField i1;
	private JTextField i2;
	private JTextField d1;
	private JTextField c1;
	private JTextField c2;
	private JTextField d2;

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
		
		i1 = new JTextField();
		i1.setBounds(86, 34, 116, 21);
		contentPane.add(i1);
		i1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uC601\uD654\uBC88\uD638");
		lblNewLabel_1.setBounds(12, 80, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		i2 = new JTextField();
		i2.setBounds(86, 77, 116, 21);
		contentPane.add(i2);
		i2.setColumns(10);
		
		JButton mv_di_insert_button = new JButton("\uCD94\uAC00");
		mv_di_insert_button.setBounds(46, 131, 97, 23);
		contentPane.add(mv_di_insert_button);
		
		//추가버튼 이벤트
		mv_di_insert_button.addActionListener(new MV_DI_button(i1,i2));
		
		JLabel lblNewLabel_2 = new JLabel("\uC601\uD654\uBC30\uC6B0 \uC0AD\uC81C");
		lblNewLabel_2.setBounds(293, 10, 85, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uAC10\uB3C5\uBC88\uD638");
		lblNewLabel_3.setBounds(239, 37, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		d1 = new JTextField();
		d1.setBounds(305, 34, 116, 21);
		contentPane.add(d1);
		d1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\uC0AD\uC81C");
		btnNewButton_1.setBounds(281, 131, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("\uC601\uD654\uBC30\uC6B0 \uC815\uBCF4 \uBCC0\uACBD");
		lblNewLabel_4.setBounds(497, 10, 110, 15);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\uAC10\uB3C5\uBC88\uD638");
		lblNewLabel_5.setBounds(451, 37, 57, 15);
		contentPane.add(lblNewLabel_5);
		
		c1 = new JTextField();
		c1.setBounds(507, 34, 116, 21);
		contentPane.add(c1);
		c1.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("\uC601\uD654\uBC88\uD638");
		lblNewLabel_6.setBounds(451, 80, 57, 15);
		contentPane.add(lblNewLabel_6);
		
		c2 = new JTextField();
		c2.setBounds(507, 77, 116, 21);
		contentPane.add(c2);
		c2.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("\uBCC0\uACBD");
		btnNewButton_2.setBounds(494, 131, 97, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uD655\uC778");
		btnNewButton_3.setBounds(635, 33, 75, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_7 = new JLabel("\uC601\uD654\uBC88\uD638");
		lblNewLabel_7.setBounds(239, 80, 57, 15);
		contentPane.add(lblNewLabel_7);
		
		d2 = new JTextField();
		d2.setBounds(305, 77, 116, 21);
		contentPane.add(d2);
		d2.setColumns(10);
	}
}
