package sigletonjadbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import com.example.userlogincheck.model.DbModel;

public class SingletonJdbc {
	private static SingletonJdbc conn;
	private Connection connection;

	private SingletonJdbc() {
	}

	public static SingletonJdbc getDbConnectionInstance() {
		if (conn == null) {
			conn = new SingletonJdbc();

			System.out.println("-------- PostgreSQL " + "JDBC Connection Testing ------------");

			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println("Where is your PostgreSQL JDBC Driver? " + "Include in your library path!");
				e.printStackTrace();
				conn.connection = null;
			}

			System.out.println("PostgreSQL JDBC Driver Registered!");

			try {
				conn.connection = DriverManager.getConnection(DbParams.getDbParamsInstance().getDbConnURL(),
						DbParams.getDbParamsInstance().getDbUser(),
						DbParams.getDbParamsInstance().getDbPassword());
			} catch (SQLException e) {
				System.out.println("Connection Failed! Check output console");
				e.printStackTrace();
				conn.connection = null;
			}
		}

		return conn;
	}

	public Connection getDbConnection() {
		return connection;
	}
}
    	 

