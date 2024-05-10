package com.generation.databaseConnect.database.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "persone")
public class Persona {
	
	@Id()
	@Column(name = "persona_id") // POICHE IN MYSQL IL CAMPO HA UN ALTRO NOME
	@GeneratedValue(strategy= GenerationType.IDENTITY) // PER L'AUTO INCREMENT
	private int personaId;
	
	@Column(name = "nome") // DATO CHE IN MYSQL HA LO STESSO NOME È SUPRFLUO
	private String nome;
	private String cognome;
	private int eta;
	private double stipendio;
	


	public Persona() {} // SPRING HA BISOGNO DI UN COSTRUTTORE VUOTO



	public Persona(int personaId, String nome, String cognome, int eta, double stipendio) {
		super();
		this.personaId = personaId;
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.stipendio = stipendio;
	}



	public int getPersonaId() {
		return personaId;
	}



	public void setPersonaId(int personaId) {
		this.personaId = personaId;
	}



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



	public int getEta() {
		return eta;
	}



	public void setEta(int eta) {
		this.eta = eta;
	}



	public double getStipendio() {
		return stipendio;
	}



	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	
	
	
	
	
	
	
	
	

}
