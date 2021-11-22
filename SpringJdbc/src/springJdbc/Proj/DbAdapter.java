package springJdbc.Proj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbAdapter implements DBInf{

	@Override
	public Connection dbConnect() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/springjdbc","root","root");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}

}
