package com.proyecto.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.proyecto.app.models.dao.JugadorDao;
import com.proyecto.app.models.dao.PartidaDao;
import com.proyecto.app.models.dao.PreguntaDao;
import com.proyecto.app.models.documents.Jugador;
import com.proyecto.app.models.documents.Partida;
import com.proyecto.app.models.documents.Pregunta;

//import reactor.core.publisher.Flux;

@SpringBootApplication
public class ManquilingoApplication implements CommandLineRunner{

	@Autowired
	private PartidaDao partidaDao;
	
	@Autowired
	private PreguntaDao preguntaDao;
	
	@Autowired
	private JugadorDao jugadorDao;
	
	public static void main(String[] args) {
		SpringApplication.run(ManquilingoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Carlos");
		a.add("Maria");
		a.add("Juan");
		
		partidaDao.save(new Partida(0, a, "Sociales")).subscribe();
		
		/*Flux.just(new Partida(0, a, "Sociales")).flatMap(partida-> {
			return partidaDao.save(partida);
				}).subscribe();
		*/
		
		ArrayList<String> b = new ArrayList<String>();
		b.add("Cartagena");
		b.add("Barrancabermeja");
		b.add("Medellin");
		
		preguntaDao.save(new Pregunta("Sociales", "Cual es la capital de Antioquia?", b, "Medellin")).subscribe();
		
		/*Flux.just( new Pregunta("Sociales", "Cual es la capital de Antioquia?", b, "Medellin")).flatMap(pregunta ->{
			return preguntaDao.save(pregunta);
					
		}).subscribe();
	}*/
	
		jugadorDao.save(new Jugador("55", "Elmo", 1000)).subscribe();
	
	}
}
