package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;




public class db {
	
	  public Connection getConnection() {
	      try {
	          return DriverManager.getConnection(
	  "jdbc:mysql://localhost/dbpiloto?&useSSL=false", "root", "");
	      } catch (SQLException e) {
	          throw new RuntimeException(e);
	      }
	  }
	
	
	

}

