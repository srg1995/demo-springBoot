package com.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.springBoot.dto.IUsuarioRepo;
import com.springBoot.dto.Usuario;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	
	@Autowired
	private IUsuarioRepo user;
	
	@Autowired
	private BCryptPasswordEncoder encoder;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario us = new Usuario();
		us.setId(3);
		us.setNombre("sergioCody");
		us.setClave(encoder.encode("sergio"));
		
		user.save(us);
		
	}

}
