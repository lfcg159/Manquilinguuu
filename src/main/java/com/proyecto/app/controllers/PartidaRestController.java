package com.proyecto.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.app.models.dao.PartidaDao;
import com.proyecto.app.models.documents.Partida;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/partidas")
public class PartidaRestController {

	@Autowired
	private PartidaDao partidaDao;
	
	@PostMapping("/crearpartida/{puntaje}")
	public Flux<Partida> crearPartida(@PathVariable int puntaje){
		return null; 
	}
	
}
