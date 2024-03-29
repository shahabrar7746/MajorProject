package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class pushDb {
	
	 public boolean registerConsumer(String name,String password, String email,String location,String pincode) throws SQLException, ClassNotFoundException {
		 if(!new common().isNew(email)) {
			 return false;
		 }
		 Connection con = common.connect();
		 String query = "insert into consumerdetails(consumer_id,password,email,registration_date,consumer_location,name,pin_code) values(?,?,?,?,?,?,?);";
		
		 PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, common.generateconsumerId());
		ps.setString(2, password);
		ps.setString(3, email);
		ps.setString(4, common.date());
		ps.setString(5, location);
		ps.setString(6, name);
		ps.setString(7, pincode);
		ps.execute();
		
		 return true;
	 }
	 public boolean registerSeller(String fullName,String businessName,String mail,String phNumber,String shopNumber,String Area,String pincode,String state,String serviceType, String password) throws ClassNotFoundException, SQLException {
		 if(!new common().isNew(mail, "sellerdetails")) {
			 return false;
		 }
			 Connection con = common.connect();
String query = "insert into sellerdetails(seller_id,pin_code,seller_name,phone_number,service_name,password,state,shop_number,area,registration_date,service_type,email) values (?,?,?,?,?,?,?,?,?,?,?,?);";
PreparedStatement ps = con.prepareStatement(query);
ps.setString(1, common.generateSellerId());
ps.setString(2, pincode);
ps.setString(3, fullName);
ps.setString(4, phNumber);
ps.setString(5, businessName);
ps.setString(6, password);
ps.setString(7, state);
ps.setString(8, shopNumber);
ps.setString(9, Area);
ps.setString(10, common.date());
ps.setString(11, serviceType);
ps.setString(12, mail);
			 ps.execute();
			 ps.close();
		 
		 return true;
	 }
}
