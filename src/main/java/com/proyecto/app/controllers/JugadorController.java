package com.proyecto.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.app.models.dao.JugadorDao;
import com.proyecto.app.models.documents.Jugador;


@RestController
@RequestMapping("/api/manquilingo/")
public class JugadorController {

	@Autowired
	JugadorDao JugadorDao;
	
	@PostMapping("/jugador/{nombre}")
	public ResponseEntity<?> crearJugador(@RequestParam String nombre) {
		Jugador jugador= new Jugador(nombre);
		JugadorDao.save(jugador).subscribe();
		return new ResponseEntity(HttpStatus.OK);
		
	}
	
	
}
