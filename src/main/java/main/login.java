package main;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;

public class login {
	String consumerId = null;
	String consumerName = null;
	public String login(String name,String password,String email) throws ClassNotFoundException, SQLException {
		if(new common().isNew(email)) {
			return "email does not exist";
		}
		Connection con = common.connect();
		
		String Query = "select consumerId,name from consumerdetails where email = ? AND password = ?;";
		PreparedStatement ps = con.prepareStatement(Query);
		ps.setString(1, email);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			consumerId = rs.getString("consumerId");
			consumerName = rs.getString("name");
		}
		if(consumerId == null ) {
			return "password is wrong";
		}
		return "email exists";
	}
	public String getConsumerId() {
		return consumerId;
	}
	
	public String getConsumerName() {
		return consumerName;
	}
	

}
