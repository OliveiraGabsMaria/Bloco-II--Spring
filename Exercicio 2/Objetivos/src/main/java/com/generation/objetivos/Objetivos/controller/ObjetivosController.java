package com.generation.objetivos.Objetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Objetivos")
public class ObjetivosController {

	@GetMapping
	public String objetivo(){
		return "Meus objetivos de aprendizagem envolvem aprender Spring, me dedicar a sempre ser alguém proativa"
	+ " Ser minha melhor versão e oferecer todo o meu melhor em me tornar uma desenvolvedora full stack";
	}
}
