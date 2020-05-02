package com.proyecto.app.models.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.proyecto.app.models.documents.Jugador;


public interface JugadorDao extends ReactiveMongoRepository<Jugador, String> {
	


}
