package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class pushDb {
	
	 public boolean registerConsumer(String name,String password, String email,String location) throws SQLException, ClassNotFoundException {
		 if(!new common().isNew(email)) {
			 return false;
		 }
		 Connection con = common.connect();
		 String query = "insert into consumerDetails(consumerId,password,email,registrationDate,consumerLocation,name) values(?,?,?,?,?,?);";
		
		 PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, common.generateconsumerId());
		ps.setString(2, password);
		ps.setString(3, email);
		ps.setString(4, common.date());
		ps.setString(5, location);
		ps.setString(6, name);
		ps.execute();
		
		 return true;
	 }
}
