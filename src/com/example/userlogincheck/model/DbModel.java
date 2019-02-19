package com.example.userlogincheck.model;

public class DbModel {
	private String dbConnURL;
	private String dbUser;
	private String dbPsw;
	
	public DbModel() { }

	public String getDbConnURL() {
		return dbConnURL;
	}

	public void setDbConnURL(String dbConnURL) {
		this.dbConnURL = dbConnURL;
	}

	public String getDbUser() {
		return dbUser;
	}

	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}

	public String getDbPsw() {
		return dbPsw;
	}

	public void setDbPsw(String dbPsw) {
		this.dbPsw = dbPsw;
	}

}
