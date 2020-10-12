package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.demo.dto.MainDto;

@Component
public class MainServiceImpl implements MainService{
	
	@Autowired
	private MainDto obj;

	@Override
	public void registrar(String nombre) {
		obj.registrar(nombre);
	}

	
}
