package com.kulpreet.springBoot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot1Application.class, args);
	}


	// Create and configure an instance of a Password encoder to encrypt the users' passwords.

	@Bean
	public PasswordEncoder getPasswordEncoder(){

		return new BCryptPasswordEncoder(15);

	}

}
