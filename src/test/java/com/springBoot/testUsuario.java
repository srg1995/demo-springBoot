package com.springBoot;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.springBoot.dto.Usuario;

class testUsuario {
	
	@Test
	void test() {
			
		Usuario us = new Usuario();
		us.setId(5);
		us.setNombre("sergio4");
		us.setClave("sergio5");
		
		Usuario retorno = new Usuario();
		retorno.setId(5);
		retorno.setNombre("sergio4");
		retorno.setClave("sergio5");
		
		assertTrue(retorno.getClave().equals(us.getClave()));
		
	}

}
