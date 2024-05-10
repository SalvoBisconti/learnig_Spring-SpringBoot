package com.generation.databaseConnect.restController;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.databaseConnect.entity.Persona;
import com.generation.databaseConnect.service.PersonaService;

@RestController
@RequestMapping("api/persona")
public class PersonaController {
	
	@Autowired
	PersonaService personaService;
	
	public ArrayList<Persona> getPersone(){
		return personaService.getAll();
	}

}
