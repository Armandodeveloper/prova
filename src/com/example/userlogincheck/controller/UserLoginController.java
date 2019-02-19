package com.example.userlogincheck.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import com.example.userlogincheck.model.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("UserModel")
public class UserLoginController extends HttpServlet {
	private String message;

	@RequestMapping(value = "/insert.htm", method = RequestMethod.POST)
	public String inserimentoUtente(ModelMap model, HttpServletRequest request) throws SQLException {

		UserModel u = new UserModel();
		u.setEmail(request.getParameter("email"));
		u.setPassword(request.getParameter("password"));
		try {
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session = factory.openSession();
			session.beginTransaction();
			session.save(u);
			// fine della transazione: salviamo tramite commit()
			System.out.println("dati salvati sul db");
			session.getTransaction().commit();
			session.close();
            return "UtenteRegistrato";
            } catch (HibernateException e) {
			e.printStackTrace();
		       }      
		return "UtenteNonRegistrato";
            
	}

}

	
