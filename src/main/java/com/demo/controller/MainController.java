package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@GetMapping("/principal")
	public String principal(@RequestParam(name="nombre", required=false, defaultValue="sergio") String name, Model m) {
		m.addAttribute("name", name);
		return "saludo";
	}
}
