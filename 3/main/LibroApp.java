package main;

import clasesLibro.Libro;

public class LibroApp {

	public static void main(String[] args) {
		
		
		// introduzco variables,
		Libro libro1 = new Libro("0-7645-26413", "Guerra y Paz", "Lev Tolstoy", 1200);
		Libro libro2 = new Libro("1-2461-00982", "Novelas", "Anton Chekhov", 368);
		
		//mostramos los datos de libros,
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		//mostramos que libro tiene más páginas,
		System.out.println(libro1.showCompare(libro2));

	}

}
