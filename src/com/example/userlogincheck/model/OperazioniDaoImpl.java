package com.example.userlogincheck.model;

import java.sql.Connection;

import sigletonjadbc.DbParams;
import sigletonjadbc.SingletonJdbc;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.userlogincheck.userconfig.UserConfig;

public class OperazioniDaoImpl implements OperazioniDao {

	public void inserisciUtente(UserModel u) throws SQLException {
	}
	

	public boolean ricercaUtente(UserModel u) throws SQLException {


	Statement stmt = null;
	String query = "SELECT * FROM utenti";
	String email = null;
	String password = null;
	boolean trovato=false;

	try
	{
		System.out.println("user emai = " + u.getEmail());
		Connection conn = SingletonJdbc.getDbConnectionInstance().getDbConnection();

		stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(query);

		while (rs.next()) {

			email = rs.getString("email");
			password = rs.getString("password");
			// Confronto ogni record di email e password presente nel db con l'email e
			// password digitati
			// nel form del jsp.
			if (u.getEmail().equals(email)) {
				System.out.println("trovato: " + email);
				return true;
			}
		}
	}catch(
	SQLException e)
	{
		e.printStackTrace();
	}finally
	{
		if (stmt != null) {
			stmt.close();
		}

	}return false;

}}
