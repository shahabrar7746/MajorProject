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
private final static String dburl = "jdbc:mysql://mysql-240f0ee5-com-24local.a.aivencloud.com:10102/?user=avnadmin";
		
private static  String host = "mysql-240f0ee5-com-24local.a.aivencloud.com";
final static String dbPort = "10102";
 final static String dbName = "bwpcz0vlb7xoowjt5all";
final static String dbUser = "avnadmin";
private final static String dbPassword = "AVNS_6OvSkrnvhZDB6mguwKX";
static String user = "avnadmin";
final static String dbDriver = "com.mysql.cj.jdbc.Driver"
		+ "";
private static Connection con = null;
static Connection connect() throws SQLException, ClassNotFoundException {
	Class.forName(dbDriver);
	if(con == null || con.isClosed()) {
       con =  DriverManager.getConnection("jdbc:mysql://" + host + ":" + dbPort + "/" + dbName + "?sslmode=require", user, dbPassword);

		return con;
	}
	if (!con.isValid(0)) {
	    // Reconnect to the database.
	    con.close();
	       con =  DriverManager.getConnection("jdbc:mysql://" + host + ":" + dbPort + "/" + dbName + "?sslmode=require", user, dbPassword);

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
	String query = "SELECT consumer_id ,name FROM bwpcz0vlb7xoowjt5all.consumerdetails where email = ?";
	PreparedStatement ps = common.connect().prepareStatement(query);
	ps.setString(1, email);
	ResultSet rs = ps.executeQuery();
	String ans = null;
	while(rs.next()) {
	 ans = rs.getString("consumer_id");
	 consumerName = rs.getString("name");
	}
	rs.close();
	ps.close();
	
	return ans == null;
	
}

public String sellerName = null;
public boolean isNew(String email,String table) throws SQLException, ClassNotFoundException {
	String query = "Select seller_id,seller_name  from " + table + "  where email = ?";
	PreparedStatement ps = common.connect().prepareStatement(query);
	ps.setString(1, email);
	ResultSet rs = ps.executeQuery();
	String ans = null;
	while(rs.next()) {
	 ans = rs.getString("seller_id");
	 sellerName = rs.getString("seller_name");
	}
	rs.close();
	ps.close();
	
	return ans == null;
	
}
public String getSellerId(String mail) throws ClassNotFoundException, SQLException {
	Connection con = connect();
	String sellerId = null;
	String query = "select seller_id from sellerdetails where email = ?;";
	PreparedStatement ps = con.prepareStatement(query);
	ps.setString(1, mail);
	ResultSet rs = ps.executeQuery();
	while(rs.next()) {
		sellerId = rs.getString("seller_id");
	}
	return sellerId;
}
public String getConsumerId(String mail) throws ClassNotFoundException, SQLException {
	String id = null;
	Connection con = connect();
	String query = "SELECT consumer_id FROM bwpcz0vlb7xoowjt5all.consumerdetails where email = ?";

	PreparedStatement ps = con.prepareStatement(query);
	ps.setString(1, mail);
	ResultSet rs = ps.executeQuery();
	while(rs.next()) {
		id = rs.getString("consumer_id");
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
public static void main(String [] args) throws SQLException, ClassNotFoundException {
Connection con = connect();
} 
}
