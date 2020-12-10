package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Model.COM_DTO;
import Model.MV_DTO;
import View.COM_CH_Page;

public class COM_button implements ActionListener {
	private JTable table;
	private JTextField I1;
	private JTextField I2;
	private JTextField I3;
	private JTextField I4;
	private JTextField I5;
	private JTextField D1;
	private JTextField C1;
	private JTextField C2;
	private JTextField C3;
	private JTextField C4;
	private JTextField C5;
	
	public COM_button(JTable j) { //리스너 등록할때  해당버튼에 맞는 JTable을 가져온다.
		table =j;
	}
	public COM_button(JTextField a1, JTextField a2, JTextField a3, JTextField a4, JTextField a5) 
	{
		I1 = a1;
		I2 = a2;
		I3 = a3;
		I4 = a4;
		I5 = a5;

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		Vector<String[]> Data;
		
		if(b.getText().equals("검색")) {
			Data= new COM_DTO().COM_READ();
			DefaultTableModel tmp = (DefaultTableModel)table.getModel();
			tmp.setNumRows(0); //제작사테이블 초기화		
			for(int i=0 ; i< Data.size(); i++) {
				tmp.addRow(Data.elementAt(i)); // Jtable에 각각의 값을 추가한다.
			}
		}	
		else if(b.getText().equals("변경")) {
			new COM_CH_Page().COM_CH_LOAD();
		}
		else if(b.getText().equals("추가")) {
			if(I1.getText().isEmpty() || I2.getText().isEmpty() || I3.getText().isEmpty() || I4.getText().isEmpty() || I5.getText().isEmpty()) 
			{
				System.out.println("모든 항목을 채워주세요");
				//나중에 경고창 뜨게 만들기
			}
			else {
				String number = I1.getText();
				String name = I2.getText();
				String address = I3.getText();
				String founding_data = I4.getText();
				String phone_number = I5.getText();
				new COM_DTO().COM_INSERT(number,name,address,founding_data,phone_number);
				
				// button DTO에서 객체를 불러와서 string 전송하기.
				
				
			}
		}
	}
}
