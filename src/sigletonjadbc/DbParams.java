package sigletonjadbc;



public class DbParams {
	private static DbParams dbParams;
	private String dbConnURL;
	private String dbUser;
	private String dbPassword;

	private DbParams() {
	}

	public static DbParams getDbParamsInstance() {
		if (dbParams == null) {
			dbParams = new DbParams();
			dbParams.dbConnURL = "jdbc:postgresql://127.0.0.1:5432/login";
			dbParams.dbUser = "postgres";
			dbParams.dbPassword = "bcsoft";
		}

		return dbParams;
	}

	public String getDbConnURL() {
		return dbConnURL;
	}

	public String getDbUser() {
		return dbUser;
	}

	public String getDbPassword() {
		return dbPassword;
	}

}