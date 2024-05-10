package com.generation.databaseConnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.databaseConnect.database.entity.Persona;

// COINCIDE CON IL DAO
// IL PACKAGE 'REPOSITORY' CORRISPONDE AL DAL

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> { // SPECIFICHIAMO LA TABELLA E IL TIPO DI CHIAVE PRIMITIVA

}
