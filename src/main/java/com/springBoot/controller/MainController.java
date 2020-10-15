package com.springBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springBoot.dto.IPersonaRepo;

@Controller
public class MainController {
	
	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping("/principal")
	public String principal(@RequestParam(name="nombre", required=false, defaultValue="sergio") String name, Model m) {

//		Persona p = new Persona();
//		p.setEdad("15");
//		p.setNombre("sergio");
//		repo.save(p);
		m.addAttribute("nombre", "sergio");
		return "saludo";
	}
	
	@GetMapping("/listado")
	public String listado(Model m) {

//		Persona p = new Persona();
//		p.setEdad("15");
//		p.setNombre("sergio");
//		repo.save(p);
		m.addAttribute("nombre", "sergio");
		
		m.addAttribute("listado", repo.findAll());
		return "listado";
	}
}
