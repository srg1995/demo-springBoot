package com.springBoot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springBoot.service.MainService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	
	private static Logger LOG = LoggerFactory.getLogger(DemoApplication.class);
	
	@Autowired
	private MainService objPrincipal;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*LOG.info("------este es un log");
		LOG.warn("------este es un log WARNING");
		LOG.error("------este es un log ERROR");*/
		objPrincipal.registrar("sergio");
	}

}
