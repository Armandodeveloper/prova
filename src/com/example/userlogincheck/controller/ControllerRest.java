package com.example.userlogincheck.controller;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.HibernateException;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.userlogincheck.model.OperazioniDao;
import com.example.userlogincheck.model.OperazioniDaoImpl;
import com.example.userlogincheck.model.UserModel;

import modalcontroller.Response;

@RestController
@RequestMapping(value = "/logindata")
public class ControllerRest {
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody Response postCustomer(@RequestBody UserModel u) throws SQLException {
		System.out.println("dentro il controller");
		Response response = null;
		boolean trovato = false;
		String email = null;
		String password = null;
		System.out.println("Prima della session");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();

		Query query = session.createQuery("FROM UserModel WHERE email = '" + u.getEmail() + "'");
		System.out.println("Dopo la query");
		List<UserModel> results = query.getResultList();

		if (!results.isEmpty()) {
			email = (results.get(0)).getEmail();
			password = (results.get(0)).getPassword();

			System.out.println("da getUser(): Email=" + email + " Password=" + password);
			trovato = true;
		}

		boolean found = trovato;
		if (found) {
			response = new Response("Done", u);

		} else {
			response = new Response("Error", u);
		}

		return response;

	}

}
