package com.generation.introToSpring.service;
import org.springframework.stereotype.Service;

import com.generation.introToSpring.model.IndirizzoDTO;
import com.generation.introToSpring.model.PersonaDTO;

@Service
public class PersonaService {
	

	public PersonaDTO toUpper(PersonaDTO pers) {
		pers.setNome(pers.getNome().toUpperCase());
		pers.setCognome(pers.getCognome().toUpperCase());
		return pers;
	}
	
	public PersonaDTO nuovaPersonaDefaut() {		
		PersonaDTO persona = new PersonaDTO();		
		persona.setNome("Fabio");
		persona.setCognome("Rossi");
		persona.setCodiceFiscale("codicefiscaelefinto");
		persona.setIndirizzo(new IndirizzoDTO("Via Pisa", 3));
		return persona;
	}
	

}
