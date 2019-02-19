package com.example.userlogincheck.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table (name = "utenti")
public class UserModel {
	@Id
	@GeneratedValue
    private int id;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	public UserModel() {}	
	public UserModel(String email, String password) { 
		this.email=email;
		this.password=password;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Email: " + this.email + " Password: " + this.password;
	}
}
