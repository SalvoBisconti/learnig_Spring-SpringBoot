package com.generation.introToSpring.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PersonaDTO {
	
	private String nome;
	private String cognome;
	private IndirizzoDTO indirizzo; // chiave esterna
	
	@JsonIgnore //non fa restituire il codici fiscale, dato che è un dato sensibile
	private String codiceFiscale;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public IndirizzoDTO getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(IndirizzoDTO indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	
	
	

}
