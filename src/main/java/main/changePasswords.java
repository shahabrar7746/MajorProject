package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class changePasswords {
	public void changePasswordConsumer(String password,String mail) throws ClassNotFoundException, SQLException {
		Connection con = common.connect();
		String query = "update consumerdetails set password = ? where email = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, password);
		ps.setString(2, mail);
		ps.execute();
	}
	public void changePasswordSeller(String password,String sellerId) throws ClassNotFoundException, SQLException {
		Connection con = common.connect();
		String query = "update sellerdetails set password = ? where seller_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, password);
		ps.setString(2, sellerId);
		ps.execute();
	}

}
