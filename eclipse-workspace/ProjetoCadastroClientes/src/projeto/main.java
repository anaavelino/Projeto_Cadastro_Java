package projeto;

import java.awt.EventQueue;

import com.mysql.jdbc.PreparedStatement;

import database.db;

import java.util.Calendar;
import com.mysql.jdbc.PreparedStatement;


public class main {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable(){
			
			public void run() {
				try {
					
					clientes frame = new clientes();
					frame.setVisible(true);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		


}
	}
