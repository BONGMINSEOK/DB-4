package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Model.MV_DI_DTO;
import View.MV_DI_CH_Page;


public class MV_DI_button implements ActionListener{
	private JTable table;
	private JTextField I1;
	private JTextField I2;
	private JTextField D1;
	private JTextField D2;
	private JTextField C1;
	private JTextField C2;
	
	public MV_DI_button(JTable j) { //리스너 등록할때  해당버튼에 맞는 JTable을 가져온다.
		table =j;
	}
	public MV_DI_button(JTextField a1, JTextField a2) {
		I1 = a1;
		I2 = a2;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		Vector<String[]> Data;
		
		if(b.getText().equals("검색")) {
			Data= new MV_DI_DTO().MV_DI_READ();
			DefaultTableModel tmp = (DefaultTableModel)table.getModel();
			tmp.setNumRows(0); //영화 감독 테이블 초기화		
			for(int i=0 ; i< Data.size(); i++) {
				tmp.addRow(Data.elementAt(i)); // Jtable에 각각의 값을 추가한다.
			}
		}	
		else if(b.getText().equals("변경")) {
			new MV_DI_CH_Page().MV_DI_CH_Page();
		}
		else if(b.getText().equals("추가")) {
			if(I1.getText().isEmpty() || I2.getText().isEmpty()) 
			{
				System.out.println("모든 항목을 채워주세요");
				//나중에 경고창 뜨게 만들기
			}
			else {
				String di_number = I1.getText();
				String mv_number = I2.getText();

				new MV_DI_DTO().MV_DI_INSERT(di_number,mv_number);
				
				// button DTO에서 객체를 불러와서 string 전송하기.
				
				
			}
		}
		
	}
	
	
}
