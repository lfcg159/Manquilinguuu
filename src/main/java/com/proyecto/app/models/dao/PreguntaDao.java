package com.proyecto.app.models.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.proyecto.app.models.documents.Pregunta;

public interface PreguntaDao extends ReactiveMongoRepository<Pregunta,String>{

}
