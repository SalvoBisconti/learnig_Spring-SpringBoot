package com.generation.databaseConnect.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.databaseConnect.database.entity.Persona;
import com.generation.databaseConnect.repository.PersonaRepository;

@Service
public class PersonaService {
	
	@Autowired
	PersonaRepository personaRepo;
	
	
	public ArrayList<Persona> getAll() {
		return (ArrayList<Persona>) personaRepo.findAll(); //FINDALL RESTITUISCE UNA LIST QUINDI E' NECESSARIO IL CAST
		
	}

}
