package com.example.userlogincheck.model;

import java.sql.Connection;
import java.sql.SQLException;

public interface OperazioniDao {
	public void inserisciUtente(UserModel u) throws SQLException;
	public boolean ricercaUtente(UserModel u) throws SQLException;
	
	

}
