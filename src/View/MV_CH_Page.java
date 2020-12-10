package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import Controller.*;

public class MV_CH_Page extends JFrame {

	private JPanel contentPane;
	private JTextField Mv_Number_Insert;
	private JTextField Mv_Name_Insert;
	private JTextField Mv_OpenningDay_Insert;
	private JTextField Mv_RuninngTime_Insert;
	private JTextField Mv_Grade_Insert;
	private JTextField Mv_Genre_Insert;
	private JTextField Mv_Number_Delete;
	private JTextField Mv_Number_Change;
	private JTextField Mv_Name_Change;
	private JTextField Mv_OpenningDay_Change;
	private JTextField Mv_RunningTime_Change;
	private JTextField Mv_Grade_Change;
	private JTextField Mv_Genre_Change;

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
		
		JLabel lblNewLabel = new JLabel("영화번호");
		lblNewLabel.setBounds(12, 38, 57, 15);
		contentPane.add(lblNewLabel);
		
		Mv_Number_Insert = new JTextField();
		Mv_Number_Insert.setBounds(70, 35, 116, 21);
		contentPane.add(Mv_Number_Insert);
		Mv_Number_Insert.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("영화제목");
		lblNewLabel_1.setBounds(12, 77, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		Mv_Name_Insert = new JTextField();
		Mv_Name_Insert.setBounds(70, 74, 116, 21);
		contentPane.add(Mv_Name_Insert);
		Mv_Name_Insert.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("개봉일");
		lblNewLabel_2.setBounds(12, 116, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		Mv_OpenningDay_Insert = new JTextField();
		Mv_OpenningDay_Insert.setBounds(70, 113, 116, 21);
		contentPane.add(Mv_OpenningDay_Insert);
		Mv_OpenningDay_Insert.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("상영시간");
		lblNewLabel_3.setBounds(12, 153, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		Mv_RuninngTime_Insert = new JTextField();
		Mv_RuninngTime_Insert.setBounds(70, 150, 116, 21);
		contentPane.add(Mv_RuninngTime_Insert);
		Mv_RuninngTime_Insert.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("평점");
		lblNewLabel_4.setBounds(12, 194, 57, 15);
		contentPane.add(lblNewLabel_4);
		
		Mv_Grade_Insert = new JTextField();
		Mv_Grade_Insert.setBounds(70, 191, 116, 21);
		contentPane.add(Mv_Grade_Insert);
		Mv_Grade_Insert.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("장르");
		lblNewLabel_5.setBounds(12, 227, 57, 15);
		contentPane.add(lblNewLabel_5);
		
		Mv_Genre_Insert = new JTextField();
		Mv_Genre_Insert.setBounds(70, 224, 116, 21);
		contentPane.add(Mv_Genre_Insert);
		Mv_Genre_Insert.setColumns(10);
		
		JButton mv_insert_button = new JButton("추가");
		mv_insert_button.setBounds(70, 265, 97, 23);
		contentPane.add(mv_insert_button);
		// 추가버튼 이벤트
		mv_insert_button.addActionListener(new MV_button(Mv_Number_Insert,Mv_Name_Insert,Mv_OpenningDay_Insert,Mv_RuninngTime_Insert,Mv_Grade_Insert,Mv_Genre_Insert));
		
		JLabel lblNewLabel_6 = new JLabel("영화 추가");
		lblNewLabel_6.setBounds(70, 10, 57, 15);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("영화 삭제");
		lblNewLabel_7.setBounds(294, 10, 57, 15);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("영화번호");
		lblNewLabel_8.setBounds(224, 38, 57, 15);
		contentPane.add(lblNewLabel_8);
		
		Mv_Number_Delete = new JTextField();
		Mv_Number_Delete.setBounds(285, 35, 116, 21);
		contentPane.add(Mv_Number_Delete);
		Mv_Number_Delete.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("삭제");
		btnNewButton_1.setBounds(285, 265, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_9 = new JLabel("영화 정보 변경");
		lblNewLabel_9.setBounds(517, 10, 88, 15);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("영화번호");
		lblNewLabel_10.setBounds(451, 38, 57, 15);
		contentPane.add(lblNewLabel_10);
		
		Mv_Number_Change = new JTextField();
		Mv_Number_Change.setBounds(517, 35, 116, 21);
		contentPane.add(Mv_Number_Change);
		Mv_Number_Change.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("영화제목");
		lblNewLabel_11.setBounds(451, 77, 57, 15);
		contentPane.add(lblNewLabel_11);
		
		Mv_Name_Change = new JTextField();
		Mv_Name_Change.setBounds(517, 74, 116, 21);
		contentPane.add(Mv_Name_Change);
		Mv_Name_Change.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("개봉일");
		lblNewLabel_12.setBounds(451, 116, 57, 15);
		contentPane.add(lblNewLabel_12);
		
		Mv_OpenningDay_Change = new JTextField();
		Mv_OpenningDay_Change.setBounds(517, 113, 116, 21);
		contentPane.add(Mv_OpenningDay_Change);
		Mv_OpenningDay_Change.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("상영시간");
		lblNewLabel_13.setBounds(451, 153, 57, 15);
		contentPane.add(lblNewLabel_13);
		
		Mv_RunningTime_Change = new JTextField();
		Mv_RunningTime_Change.setBounds(517, 150, 116, 21);
		contentPane.add(Mv_RunningTime_Change);
		Mv_RunningTime_Change.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("평점");
		lblNewLabel_14.setBounds(451, 194, 57, 15);
		contentPane.add(lblNewLabel_14);
		
		Mv_Grade_Change = new JTextField();
		Mv_Grade_Change.setBounds(517, 191, 116, 21);
		contentPane.add(Mv_Grade_Change);
		Mv_Grade_Change.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("장르");
		lblNewLabel_15.setBounds(451, 227, 57, 15);
		contentPane.add(lblNewLabel_15);
		
		Mv_Genre_Change = new JTextField();
		Mv_Genre_Change.setBounds(517, 224, 116, 21);
		contentPane.add(Mv_Genre_Change);
		Mv_Genre_Change.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("변경");
		btnNewButton_2.setBounds(517, 265, 97, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("확인");
		btnNewButton_3.setBounds(645, 34, 84, 23);
		contentPane.add(btnNewButton_3);
	}
}
