package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JButton;

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
			new Object[][] {
			},
			new String[] {
				"\uC601\uD654\uBC88\uD638", "\uC601\uD654\uC81C\uBAA9", "\uAC1C\uBD09\uC77C", "\uC0C1\uC601 \uC2DC\uAC04", "\uD3C9\uC810", "\uC601\uD654\uC7A5\uB974"
			}
		));
		table.getColumnModel().getColumn(3).setPreferredWidth(81);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("\uC601\uD654 \uC815\uBCF4");
		lblNewLabel.setBounds(536, 14, 75, 19);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_3 = new JButton("\uBCC0\uACBD");
		btnNewButton_3.setBounds(1068, 10, 115, 27);
		contentPane.add(btnNewButton_3);
		
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
		
		JButton btnNewButton = new JButton("\uBCC0\uACBD");
		btnNewButton.setBounds(431, 191, 115, 27);
		contentPane.add(btnNewButton);
		
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
		
		JButton btnNewButton_1 = new JButton("\uBCC0\uACBD");
		btnNewButton_1.setBounds(1068, 191, 115, 27);
		contentPane.add(btnNewButton_1);
		
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
		
		JButton btnNewButton_2 = new JButton("\uBCC0\uACBD");
		btnNewButton_2.setBounds(431, 376, 115, 27);
		contentPane.add(btnNewButton_2);
		
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
		
		JButton btnNewButton_4 = new JButton("\uBCC0\uACBD");
		btnNewButton_4.setBounds(1068, 376, 115, 27);
		contentPane.add(btnNewButton_4);
		
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
		
		JButton btnNewButton_5 = new JButton("\uBCC0\uACBD");
		btnNewButton_5.setBounds(431, 559, 115, 27);
		contentPane.add(btnNewButton_5);
		
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
		
		JButton btnNewButton_6 = new JButton("\uBCC0\uACBD");
		btnNewButton_6.setBounds(1068, 559, 115, 27);
		contentPane.add(btnNewButton_6);
		
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
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setBounds(300, 735, 115, 27);
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
		
		JButton btnNewButton_8 = new JButton("New button");
		btnNewButton_8.setBounds(738, 735, 115, 27);
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
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setBounds(983, 739, 68, 19);
		contentPane.add(lblNewLabel_9);
		
		JButton btnNewButton_9 = new JButton("New button");
		btnNewButton_9.setBounds(1068, 735, 115, 27);
		contentPane.add(btnNewButton_9);
	}
}
