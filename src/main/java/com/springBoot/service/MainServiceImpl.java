package com.springBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springBoot.dto.MainDto;

@Component
public class MainServiceImpl implements MainService{
	
	@Autowired
	private MainDto obj;

	@Override
	public void registrar(String nombre) {
		obj.registrar(nombre);
	}

	
}
