package main;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Random;

public class common  {
private final static String dburl = "\"mysql://uizlnplnxgqkaypn:MnzZfwjnKSml5hlmMv8B@bwpcz0vlb7xoowjt5all-mysql.services.clever-cloud.com:3306/bwpcz0vlb7xoowjt5all\"\r\n"
		+ "";

final static String dbPort = "3306//";
 final static String dbName = "bwpcz0vlb7xoowjt5all";
final static String dbUser = "uizlnplnxgqkaypn";
private final static String dbPassword = "MnzZfwjnKSml5hlmMv8B";
final static String dbDriver = "com.mysql.cj.jdbc.Driver";
private static Connection con = null;
static Connection connect() throws SQLException, ClassNotFoundException {
	Class.forName(dbDriver);
	if(con == null || con.isClosed()) {
	con = DriverManager.getConnection("jdbc:mysql://uizlnplnxgqkaypn:MnzZfwjnKSml5hlmMv8B@bwpcz0vlb7xoowjt5all-mysql.services.clever-cloud.com:3306/bwpcz0vlb7xoowjt5all");
	return con;
	}
	if (!con.isValid(0)) {
	    // Reconnect to the database.
	    con.close();
		con = DriverManager.getConnection("jdbc:mysql://uizlnplnxgqkaypn:MnzZfwjnKSml5hlmMv8B@bwpcz0vlb7xoowjt5all-mysql.services.clever-cloud.com:3306/bwpcz0vlb7xoowjt5all");
	  }
	return con;
}
public static String consumerId = null;
public static String generateconsumerId() {
       String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
       StringBuilder uniqueString = new StringBuilder();

       Random random = new Random();
       for (int i = 0; i < 10; i++) {
           int index = random.nextInt(characters.length());
           uniqueString.append(characters.charAt(index));
       }
       consumerId = uniqueString.toString();
       return consumerId;
   }
public static String sellerId = null;
public static String generateSellerId() {
       String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
       StringBuilder uniqueString = new StringBuilder();

       Random random = new Random();
       for (int i = 0; i < 7; i++) {
           int index = random.nextInt(characters.length());
           uniqueString.append(characters.charAt(index));
       }
       sellerId = uniqueString.toString();
       return sellerId;
   }
public static String date() {
	 LocalDate today = LocalDate.now();
     return today.toString();
}
public  String consumerName = null;
public boolean isNew(String email) throws SQLException, ClassNotFoundException {
	String query = "Select consumerId,name  from consumerDetails where email = ?";
	PreparedStatement ps = common.connect().prepareStatement(query);
	ps.setString(1, email);
	ResultSet rs = ps.executeQuery();
	String ans = null;
	while(rs.next()) {
	 ans = rs.getString("consumerId");
	 consumerName = rs.getString("name");
	}
	rs.close();
	ps.close();
	
	return ans == null;
	
}
public String getConsumerId(String mail) throws ClassNotFoundException, SQLException {
	String id = null;
	Connection con = connect();
	String query = " select consumerId from consumerDetails where email = ?";
	PreparedStatement ps = con.prepareStatement(query);
	ps.setString(1, mail);
	ResultSet rs = ps.executeQuery();
	while(rs.next()) {
		id = rs.getString("consumerId");
	}
	return id;
}
public String generateOTP() {
	String nums = "1234567890";
	 Random random = new Random();
     StringBuilder otp = new StringBuilder();
     for (int i = 0; i < 6; i++) {
         otp.append(nums.charAt(random.nextInt(nums.length())));
     }
     return otp.toString();
}
public static void main(String [] args) throws SQLException {

}
}
