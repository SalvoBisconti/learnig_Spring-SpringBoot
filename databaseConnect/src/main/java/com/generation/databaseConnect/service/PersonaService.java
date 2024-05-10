package com.generation.databaseConnect.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.databaseConnect.entity.Persona;
import com.generation.databaseConnect.repository.PersonaRepository;

@Service
public class PersonaService {
	
	@Autowired
	PersonaRepository personaRepo;
	
	
	public ArrayList<Persona> getAll() {
		return (ArrayList<Persona>) personaRepo.findAll(); //FINDALL RESTITUISCE UNA LIST QUINDI E' NECESSARIO IL CAST
	}
	
	public Persona getById(int idPersona) {
		try {
			//Optional è la promessa di java
			Optional<Persona> personaOptional = personaRepo.findById(idPersona);
			
			if(personaOptional.isEmpty())
			{
				//return new Persona();	
				return null;
			}
			else			
			{
				return personaOptional.get();				
			}
			
		} catch (Exception e) {
			System.err.println(e);
		}
		
		return new Persona();
		
	}

}
