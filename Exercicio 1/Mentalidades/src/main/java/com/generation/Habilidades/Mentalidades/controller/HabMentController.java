package com.generation.Habilidades.Mentalidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HabMent")
public class HabMentController {
	
	@GetMapping
	public String habment() {
		return "As habilidades e mentalidades que utilizei para realizar essa atividade são:\"\r\n"
				+ "				+ \"\\n | Proatividade | e \"\r\n"
				+ "				+ \"| Persistencia|\"";
	}

}
