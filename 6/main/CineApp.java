package main;

import clasesCine.Espectador;
import clasesCine.Pelicula;
import clasesCine.Sala;

public class CineApp {

	public static void main(String[] args) {
		
		//introducimos las variables,
		Espectador [] espectadores = new Espectador [10];
		espectadores[0] = new Espectador("Gregory", 48, 100.0);
		espectadores[1] = new Espectador("Marta", 11, 12.0);
		espectadores[2] = new Espectador("Fred", 14, 10.0);
		espectadores[3] = new Espectador("Svetlana", 31, 50.0);
		espectadores[4] = new Espectador("Alba", 28, 20.0);
		espectadores[5] = new Espectador("Sergiy", 15, 8.0);
		espectadores[6] = new Espectador("Cristina", 5, 0.0);
		espectadores[7] = new Espectador("Laya", 21, 16.0);
		espectadores[8] = new Espectador("Monica", 30, 40.0);
		espectadores[9] = new Espectador("John", 40, 10.0);
		
		Pelicula comedia = new Pelicula("Palm Springs", 180, 14, "Max Barbakow");
		Sala sala1 = new Sala(8, 9, 12.0, comedia, espectadores);

		//ejecutamos el programa,
		sala1.watchMovie();
	}

}
