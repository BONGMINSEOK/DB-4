package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
public class MV_button implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("검색")) {
		/*버튼 구현*/	
		}	
		else if(b.getText().equals("변경")) {
			/*버튼 구현*/
		}
	}
	
}

