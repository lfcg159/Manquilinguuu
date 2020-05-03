package com.proyecto.app.models.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.annotations.NotThreadSafe;
import com.mongodb.lang.NonNull;

@Document(collection = "jugadores")
public class Jugador {
	
	
	
	
	@Id
	private String id;

	private String nombre;
	
	private int puntaje;
	
	
	public Jugador() {}
	
	public Jugador( String nombre) {
		this.nombre = nombre;
		this.puntaje = 0;
	}

	public Jugador(String id, String nombre, int puntaje) {
		this.id = id;		
		this.nombre = nombre;
		this.puntaje = puntaje;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
	
	
}
