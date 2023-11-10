package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class changePasswords {
	public void changePasswordConsumer(String password,String mail) throws ClassNotFoundException, SQLException {
		Connection con = common.connect();
		String query = "update consumerDetails set password = ? where email = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, password);
		ps.setString(2, mail);
		ps.execute();
	}

}
