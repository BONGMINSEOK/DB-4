package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.MV_COM_DTO;
import View.MV_COM_CH_Page;

public class MV_COM_button  implements ActionListener{
	private JTable table;
	public MV_COM_button(JTable j) { //리스너 등록할때  해당버튼에 맞는 JTable을 가져온다.
		table =j;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		Vector<String[]> Data;
		
		if(b.getText().equals("검색")) {
			Data= new MV_COM_DTO().MV_COM_READ();
			DefaultTableModel tmp = (DefaultTableModel)table.getModel();
			tmp.setNumRows(0); //영화 제작사 테이블 초기화		
			for(int i=0 ; i< Data.size(); i++) {
				tmp.addRow(Data.elementAt(i)); // Jtable에 각각의 값을 추가한다.
			}
		}	
		else if(b.getText().equals("변경")) {
			new MV_COM_CH_Page().MV_COM_CH_LOAD();
		}
	}
}
