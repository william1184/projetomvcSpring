package com.example.projetomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrimeiroController {
	
	//Template do meu próprio projeto
	@GetMapping(path = "/")
	public String pagina2() {
		return "templateprojetomvc";
	}
	
	//Template do meu projeto frontend
	@GetMapping(path = "/projetofrontend")
	public String pagina1() {
		return "templateprojetomvc";
	}
}
