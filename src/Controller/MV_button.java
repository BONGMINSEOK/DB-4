package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.MV_DTO;
public class MV_button implements ActionListener {
	
	
	private JTable table;
	public MV_button(JTable j) { //리스너 등록할때  해당버튼에 맞는 JTable을 가져온다.
		table =j;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int row_count=0; //mv데이터의 row값을 저장하기 위한 함수
		JButton b = (JButton)e.getSource();
		Vector<String[]> Data;
		
		if(b.getText().equals("검색")) {
			Data= new MV_DTO().MV_READ();
			row_count = Data.size();
			DefaultTableModel tmp = (DefaultTableModel)table.getModel();
			
			for(int i=0 ; i< Data.size(); i++) {
				tmp.addRow(Data.elementAt(i)); // Jtable에 각각의 값을 추가한다.
			}
		}	
		else if(b.getText().equals("변경")) {
			/*버튼 구현*/
		}
	}
	
}

