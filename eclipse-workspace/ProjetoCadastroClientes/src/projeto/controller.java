package projeto;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

import com.mysql.fabric.xmlrpc.Client;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import projeto.clientes;

import database.db;

public class controller {

	//FUNÇÃO PARA INSERIR DADOS DO BANCO
	
	public void inserir(String a, String b, String c) throws SQLException {
	    Connection connection = (Connection) new db().getConnection();
	    //System.out.println("Conectado!");
	      
		   String sql = "insert into cad(nome,email,celular) " +
	                  "values (?,?,?)";
		   PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
		   
		    
		      stmt.setString(1, a );
		      stmt.setString(2, b);
		      stmt.setString(3, c);
		     
		      stmt.execute();
		      stmt.close();
		      
		  	alerta frame = new alerta();
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);  

		      
		      connection.close();
	}

}
