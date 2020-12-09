package Controller;

import java.awt.EventQueue;

public class Main {
	public static void main(String[] args) {
				try {
					View.main_view frame = new View.main_view();
					frame.setVisible(true);
				}catch(Exception e) {
					e.printStackTrace();
				}
	}

}
