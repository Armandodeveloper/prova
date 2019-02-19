package com.example.userlogincheck.userconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.userlogincheck.model.UserModel;

@Configuration
public class UserConfig {
	@Bean(name="utente")
	UserModel userModel() {
		return new UserModel();
	}
}
