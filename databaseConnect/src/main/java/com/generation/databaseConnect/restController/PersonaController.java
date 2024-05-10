package com.generation.databaseConnect.restController;

import java.util.ArrayList;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.databaseConnect.entity.Persona;
import com.generation.databaseConnect.service.PersonaService;


@CrossOrigin("*") //PERMETTE DI VISUALIZZARE UGUALMENTE A PRESCINDERE DELLE POLICY
@RestController
@RequestMapping("api/persona")


public class PersonaController {
	
	@Autowired
	PersonaService personaService;
	
	@GetMapping
	public ArrayList<Persona> getPersone(){
		return personaService.getAll();
	}

	
	@GetMapping("/{idPercorso}")
	public ResponseEntity<Persona> dammiPersonaConId(@PathVariable("idPercorso") int idPers) {
		Persona persona = personaService.getById(idPers);	
		if(persona == null)
		{
			return new ResponseEntity<Persona>(new Persona(), HttpStatus.NOT_FOUND);
		}else
		{
			return new ResponseEntity<Persona>(persona, HttpStatus.OK);
		}
	}
}
