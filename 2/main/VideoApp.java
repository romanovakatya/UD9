package main;

import java.util.Arrays;

import clasesVideo.*;

public class VideoApp {

	public static void main(String[] args) {
		
		//creamos dos arrays: uno de series u el otro de videojuegos,
		Serie [] series = new Serie [5];
		Videojuego [] videojuegos = new Videojuego [5];
		
		
		//creamos un objeto en cada posición de los arrays,
		series [0] = new Serie();
		series [1] = new Serie("House", "David Shore");
		series [2] = new Serie("The Big Bang Theory", 12, "comedy", "Chuck Lorre");
		series [3] = new Serie("María", 20, "drama", "Juan Carlos Huella");
		series [4] = new Serie("Witcher", 2, "Fantasía oscura", "Lauren Schmidt Hissrich");

		videojuegos[0] = new Videojuego();
		videojuegos[1] = new Videojuego("Super Mario", 16);
		videojuegos[2] = new Videojuego("The Witcher", 100, "Fantasía oscura", "CD Projekt RED STUDIO");
		videojuegos[3] = new Videojuego("Metro 2033", 730, "Horror de supervivencia", "4A Games");
		videojuegos[4] = new Videojuego("S.T.A.L.K.E.R.: Shadow of Chernobyl", 500, "Disparos en primera persona", "GSC Game World");
		
		
		//entregamos algunos Videojuegos y Series,
		series[0].deliver();
		series [2].deliver();
		
		videojuegos[1].deliver();
		videojuegos[3].deliver();
		videojuegos[4].deliver();
		
		//contar cuantos Series y Videojuegos hay entregados,
		System.out.println("Series entregadas: " + countSeriesDelivered(series));
		
		System.out.println("Videojuegos entregados: " + countVidejuegosDelivered(videojuegos));
		
		//ordenamos el array de series por el número de temporadas,
		Arrays.sort(series);
		
		//ordenamos el array de videojuegos por las horas estimadas,
		Arrays.sort(videojuegos);
		
		//mostramos serie que tiene más temporadas,		
		System.out.println("Serie que tiene más temporadas:");
		System.out.println(series[0].toString() + "\n");
		
		showArray(series);
		
		//mostramos videojuego que tiene más horas estimadas,	
		System.out.println("Videojuego que tiene más horas estimadas:");
		System.out.println(videojuegos[0].toString() + "\n");
		
		showArray(videojuegos);			
	}
	
	//para contar series enviadas,
	public static int countSeriesDelivered(Serie [] series) {
		int count = 0;
		
		for (int i = 0; i < series.length; i++) {
			if (series[i].isEntregado()) {
				count++;
				series[i].returnVideo();
			}
		}
		
		return count;
	}
	
	//para contar videojuegos entregados,
	public static int countVidejuegosDelivered(Videojuego [] videojuegos) {
		int count = 0;
		
		for (int i = 0; i < videojuegos.length; i++) {
			if (videojuegos[i].isEntregado()) {
				count++;
				videojuegos[i].returnVideo();
			}
		}
		
		return count;
	}

	//para mostrar un array,
	public static void showArray(Object [] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].toString());
		}
		System.out.println("");
	}
}
