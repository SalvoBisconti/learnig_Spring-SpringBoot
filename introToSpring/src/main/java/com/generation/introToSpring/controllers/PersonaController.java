package com.generation.introToSpring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.introToSpring.model.PersonaDTO;
import com.generation.introToSpring.service.PersonaService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(path = "/api/persona") //GESTISCE L'INDIRIZZO
public class PersonaController {
	
	
	// SETTO IL SERVICE 
	@Autowired
	PersonaService personaSrv;
	
	
	
	
	//   GET
	@GetMapping(produces = "application/json") //SPECIFICA IL TIPO DI RISPOSTA
	public PersonaDTO getPersona() {	
		//IL SYSO PERCHE' HO MESSO IL CODICE FISCALE CON JSONIGNORE
		System.out.println(personaSrv.nuovaPersonaDefaut().getCodiceFiscale());
		return personaSrv.nuovaPersonaDefaut();		
	}
	
	
	// POST 
	// @RequestMapping(method = RequestMethod.POST)  -> metodo completo
	@PostMapping("/add") // abbreviazione
	public PersonaDTO postPersonaDTO(@RequestBody PersonaDTO persona ) {
		return personaSrv.toUpper(persona);
	}

	
	
	@GetMapping("/{id}") //SPECIFICA IL TIPO DI RISPOSTA
	public int getPersonaId(@PathVariable ("id") int id_variabile) {
		return id_variabile;
		
	}
	
	/**
	 * "localhost:8080/api/persona/xml" con metodo "Get"
	 * POJO = plain old java object
	 */
	@GetMapping(path = "/xml", produces = MediaType.APPLICATION_XML_VALUE) //="application/xml"
	public PersonaDTO getPersonaXml(){
		return personaSrv.nuovaPersonaDefaut();
	}
	
	
}
