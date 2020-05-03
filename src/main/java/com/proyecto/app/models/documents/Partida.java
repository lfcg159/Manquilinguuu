package com.proyecto.app.models.documents;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "partidas")
public class Partida {
	
	@Id
	private String id;
	
	private int puntaje;
	
	private ArrayList<String> jugadores;
	
	private Date createAt;
	
	private String tema;

	
	public Partida() {	}
	
	public Partida( int puntaje, ArrayList<String> jugadores, String tema) {
		this.puntaje = puntaje;
		this.jugadores = jugadores;
		this.createAt = new Date();
		this.tema = tema;
	}
	
	public Partida(String id, int puntaje, ArrayList<String> jugadores, String tema) {
		this.id = id;
		this.puntaje = puntaje;
		this.jugadores = jugadores;
		this.createAt = new Date();
		this.tema = tema;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public ArrayList<String> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
	
	
	
	

}
