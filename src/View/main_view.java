package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JButton;
import Controller.*;
import java.awt.event.ActionEvent;

public class main_view extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;
	private JTable table_6;
	private JTable table_7;
	private JTable table_8;
	private JTable table_9;

	public main_view() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1212, 968);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 41, 1168, 140);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new String[] {
				"영화번호", "영화제목", "개봉일", "상영 시간", "평점", "장르"
			},0
		));
		table.getColumnModel().getColumn(3).setPreferredWidth(81);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("\uC601\uD654 \uC815\uBCF4");
		lblNewLabel.setBounds(536, 14, 75, 19);
		contentPane.add(lblNewLabel);
		
		JButton mv_change_button = new JButton("변경"); // 영화정보 변경 버튼
		mv_change_button.setBounds(1115, 10, 68, 27);
		contentPane.add(mv_change_button);
		
		mv_change_button.addActionListener(new MV_button(table)); //영화정보 변경 버튼 이벤트 함수
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(15, 222, 531, 140);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\uBC30\uC6B0\uBC88\uD638", "\uC774\uB984", "\uCD9C\uC0DD\uC77C", "\uC131\uBCC4"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JLabel lblNewLabel_1 = new JLabel("\uBC30\uC6B0 \uC815\uBCF4");
		lblNewLabel_1.setBounds(243, 195, 75, 19);
		contentPane.add(lblNewLabel_1);
		
		JButton ac_change_button = new JButton("변경");
		ac_change_button.setBounds(478, 191, 68, 27);
		contentPane.add(ac_change_button);
		
		ac_change_button.addActionListener(new AC_button());
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(609, 222, 574, 140);
		contentPane.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\uAC10\uB3C5\uBC88\uD638", "\uC774\uB984", "\uCD9C\uC0DD\uC77C", "\uC131\uBCC4"
			}
		));
		scrollPane_2.setViewportView(table_2);
		
		JLabel lblNewLabel_2 = new JLabel("\uAC10\uB3C5\uC815\uBCF4");
		lblNewLabel_2.setBounds(846, 195, 68, 19);
		contentPane.add(lblNewLabel_2);
		
		JButton di_change_button = new JButton("변경");
		di_change_button.setBounds(1115, 191, 68, 27);
		contentPane.add(di_change_button);
		di_change_button.addActionListener(new DI_button());
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(15, 409, 531, 140);
		contentPane.add(scrollPane_3);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\uD68C\uC0AC\uBC88\uD638", "\uD68C\uC0AC\uC774\uB984", "\uC8FC\uC18C", "\uCC3D\uB9BD\uC77C", "\uC804\uD654\uBC88\uD638"
			}
		));
		scrollPane_3.setViewportView(table_3);
		
		JLabel lblNewLabel_3 = new JLabel("\uC81C\uC791\uC0AC");
		lblNewLabel_3.setBounds(243, 376, 68, 19);
		contentPane.add(lblNewLabel_3);
		
		JButton com_change_button = new JButton("변경");
		com_change_button.setBounds(478, 376, 68, 27);
		contentPane.add(com_change_button);
		com_change_button.addActionListener(new COM_button());
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(609, 409, 574, 140);
		contentPane.add(scrollPane_4);
		
		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\uBC30\uC6B0\uBC88\uD638", "\uC601\uD654\uBC88\uD638", "\uC5ED\uD560"
			}
		));
		scrollPane_4.setViewportView(table_4);
		
		JLabel lblNewLabel_4 = new JLabel("\uC601\uD654\uBC30\uC6B0\uC815\uBCF4");
		lblNewLabel_4.setBounds(846, 376, 103, 19);
		contentPane.add(lblNewLabel_4);
		
		JButton mv_ac_change_button = new JButton("변경");
		mv_ac_change_button.setBounds(1115, 376, 68, 27);
		contentPane.add(mv_ac_change_button);
		mv_ac_change_button.addActionListener(new MV_AC_button());
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(15, 591, 531, 140);
		contentPane.add(scrollPane_5);
		 
		table_5 = new JTable();
		table_5.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\uAC10\uB3C5\uBC88\uD638", "\uC601\uD654\uBC88\uD638"
			}
		));
		scrollPane_5.setViewportView(table_5);
		
		JLabel lblNewLabel_5 = new JLabel("\uC601\uD654\uAC10\uB3C5");
		lblNewLabel_5.setBounds(243, 563, 68, 19);
		contentPane.add(lblNewLabel_5);
		
		JButton mv_di_change_button = new JButton("변경");
		mv_di_change_button.setBounds(478, 559, 68, 27);
		contentPane.add(mv_di_change_button);
		mv_di_change_button.addActionListener(new MV_DI_button());
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(609, 591, 574, 140);
		contentPane.add(scrollPane_6);
		
		table_6 = new JTable();
		table_6.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\uC601\uD654\uBC88\uD638", "\uC81C\uC791\uC0AC\uBC88\uD638"
			}
		));
		scrollPane_6.setViewportView(table_6);
		
		JLabel lblNewLabel_6 = new JLabel("\uC601\uD654\uC81C\uC791\uC0AC");
		lblNewLabel_6.setBounds(846, 558, 86, 19);
		contentPane.add(lblNewLabel_6);
		
		JButton mv_com_change_button = new JButton("변경");
		mv_com_change_button.setBounds(1115, 559, 68, 27);
		contentPane.add(mv_com_change_button);
		mv_com_change_button.addActionListener(new MV_COM_button());
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(15, 772, 400, 140);
		contentPane.add(scrollPane_7);
		
		table_7 = new JTable();
		table_7.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column"
			}
		));
		scrollPane_7.setViewportView(table_7);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(154, 739, 68, 19);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton_7 = new JButton("t");
		btnNewButton_7.setBounds(347, 735, 68, 27);
		contentPane.add(btnNewButton_7);
		
		JScrollPane scrollPane_8 = new JScrollPane();
		scrollPane_8.setBounds(431, 772, 423, 140);
		contentPane.add(scrollPane_8);
		
		table_8 = new JTable();
		table_8.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		scrollPane_8.setViewportView(table_8);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(587, 739, 68, 19);
		contentPane.add(lblNewLabel_8);
		
		JButton btnNewButton_8 = new JButton("\uBCC0\uACBD");
		btnNewButton_8.setBounds(785, 735, 68, 27);
		contentPane.add(btnNewButton_8);
		
		JScrollPane scrollPane_9 = new JScrollPane();
		scrollPane_9.setBounds(869, 773, 310, 139);
		contentPane.add(scrollPane_9);
		
		table_9 = new JTable();
		table_9.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column"
			}
		));
		scrollPane_9.setViewportView(table_9);
		
		JLabel lblNewLabel_9 = new JLabel("mylabel");
		lblNewLabel_9.setBounds(983, 739, 68, 19);
		contentPane.add(lblNewLabel_9);
		
		JButton btnNewButton_9 = new JButton("y");
		btnNewButton_9.setBounds(1115, 735, 68, 27);
		contentPane.add(btnNewButton_9);
		
		JButton mv_search_button = new JButton("검색");
		mv_search_button.setBounds(15, 10, 68, 27);
		contentPane.add(mv_search_button);
		mv_search_button.addActionListener(new MV_button(table));

		JButton ac_search_button = new JButton("검색");
		ac_search_button.setBounds(15, 191, 68, 27);
		contentPane.add(ac_search_button);
		ac_search_button.addActionListener(new AC_button());
		
		JButton di_search_button = new JButton("검색");
		di_search_button.setBounds(609, 191, 68, 27);
		contentPane.add(di_search_button);
		di_search_button.addActionListener(new DI_button());
		
		JButton mv_ac_search_button = new JButton("검색");
		mv_ac_search_button.setBounds(609, 372, 68, 27);
		contentPane.add(mv_ac_search_button);
		mv_ac_search_button.addActionListener(new MV_AC_button());
		
		JButton com_search_button = new JButton("검색");
		com_search_button.setBounds(15, 372, 68, 27);
		contentPane.add(com_search_button);
		com_search_button.addActionListener(new COM_button());
		
		JButton btnNewButton_14 = new JButton("m");
		btnNewButton_14.setBounds(15, 735, 68, 27);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("n");
		btnNewButton_15.setBounds(431, 735, 68, 27);
		contentPane.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("v");
		btnNewButton_16.setBounds(872, 735, 68, 27);
		contentPane.add(btnNewButton_16);
		
		JButton mv_com_search_button = new JButton("검색");
		mv_com_search_button.setBounds(609, 559, 68, 27);
		contentPane.add(mv_com_search_button);
		mv_com_search_button.addActionListener(new MV_COM_button());
		
		JButton mv_di_search_button = new JButton("검색");
		mv_di_search_button.setBounds(15, 559, 68, 27);
		contentPane.add(mv_di_search_button);
		mv_di_search_button.addActionListener(new MV_DI_button());

	}
}
