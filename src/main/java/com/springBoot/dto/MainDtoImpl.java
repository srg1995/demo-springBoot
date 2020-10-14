package com.springBoot.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.springBoot.DemoApplication;

@Repository
@Qualifier("main")
public class MainDtoImpl implements MainDto{

	private static Logger LOG = LoggerFactory.getLogger(DemoApplication.class);

	@Override
	public void registrar(String nombre) {
		LOG.info("*****"+nombre);
		
	}
}
