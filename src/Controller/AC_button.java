package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Model.AC_DTO;
import View.AC_CH_Page;

public class AC_button implements ActionListener {
		
	private JTable table;
	private JTextField I1;
	private JTextField I2;
	private JTextField I3;
	private JTextField I4;
	private JTextField D1;
	private JTextField C1;
	private JTextField C2;
	private JTextField C3;
	private JTextField C4;
	
	public AC_button(JTable j) { //리스너 등록할때  해당버튼에 맞는 JTable을 가져온다.
		table =j;
	}
	public AC_button(JTextField a1,JTextField a2,JTextField a3,JTextField a4 ) 
	{
		I1 = a1;
		I2 = a2;
		I3 = a3;
		I4 = a4;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		Vector<String[]> Data;
		
		if(b.getText().equals("검색")) {
			Data= new AC_DTO().AC_READ();
			DefaultTableModel tmp = (DefaultTableModel)table.getModel();
			tmp.setNumRows(0); //배우테이블 초기화		
			for(int i=0 ; i< Data.size(); i++) {
				tmp.addRow(Data.elementAt(i)); // Jtable에 각각의 값을 추가한다.
			}
		}
		else if(b.getText().equals("변경")) {
			new AC_CH_Page().AC_CH_LOAD();
		}
		else if(b.getText().equals("추가")) {
			if(I1.getText().isEmpty() || I2.getText().isEmpty() || I3.getText().isEmpty() || I4.getText().isEmpty()) 
			{
				System.out.println("모든 항목 채워주세요");
			}
			else {
				String number = I1.getText();
				String name = I2.getText();
				String birthday = I3.getText();
				String gender = I4.getText();
				new AC_DTO().AC_INSERT(number,name,birthday,gender);
			}
			}
		}
	}

