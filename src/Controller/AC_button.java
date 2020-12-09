package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.AC_DTO;

public class AC_button implements ActionListener {
		
	private JTable table;
	public AC_button(JTable j) { //리스너 등록할때  해당버튼에 맞는 JTable을 가져온다.
		table =j;
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
			/*버튼 구현*/
		}
	}
}
