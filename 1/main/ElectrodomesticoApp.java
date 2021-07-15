package main;

import clases.Electrodomestico;
import clases.Lavadora;
import clases.Television;

public class ElectrodomesticoApp {

	public static void main(String[] args) {
		// declaración de las variables,
		double sumaLavadoras = 0;
		double sumaTelevision = 0;
		double sumaTotal = 0;

		Electrodomestico frigorifico = new Electrodomestico();
		Electrodomestico portatil = new Electrodomestico(1000, 2);
		Electrodomestico cepilloElectrico = new Electrodomestico(49, "Rojo", 'D', 0);
		Electrodomestico aireCondicionado = new Electrodomestico(500, "Blue", 'Y', 80);
		Lavadora indezit = new Lavadora();
		Lavadora bosh = new Lavadora(600, 85);
		Lavadora zanussi = new Lavadora(400, "azul moreno", 'A', 60, 30);
		Lavadora murka = new Lavadora(199, "GRis", 'A', 120, 32);
		Television asus = new Television();
		Television luna = new Television(999, 4);
		Television zara = new Television(1000, "negrO", 'B', 16, 20, false);
		Television alba = new Television(200, "azul", 'C', 9, 41, true);

		// creamos un array de 10 Objetos de tipo electrodomestico,
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];

		// Asigna a cada posición un objeto,
		electrodomesticos[0] = frigorifico;
		electrodomesticos[1] = cepilloElectrico;
		electrodomesticos[2] = aireCondicionado;
		electrodomesticos[3] = bosh;
		electrodomesticos[4] = zanussi;
		electrodomesticos[5] = murka;
		electrodomesticos[6] = asus;
		electrodomesticos[7] = luna;
		electrodomesticos[8] = zara;
		electrodomesticos[9] = alba;

		// recorrimos el array y ejecutamos el método precioFinal(),
		for (int i = 0; i < electrodomesticos.length; i++) {
			
			sumaTotal = sumaTotal + electrodomesticos[i].precioFinal();

			if (electrodomesticos[i] instanceof Lavadora) {
				
				sumaLavadoras = sumaLavadoras + electrodomesticos[i].precioFinal();
			} 
			else if (electrodomesticos[i] instanceof Television) {
				
				sumaTelevision = sumaTelevision + electrodomesticos[i].precioFinal();
			}
		}

		 System.out.println(frigorifico.toString());
		// System.out.println(portatil.toString());
		// System.out.println(indezit.toString()); 
		System.out.println(cepilloElectrico.toString());
		System.out.println(aireCondicionado.toString());
		System.out.println(bosh.toString());
		System.out.println(zanussi.toString()); 
		System.out.println(murka.toString());
		
		System.out.println(asus.toString());
		System.out.println(luna.toString());
		System.out.println(zara.toString());
		System.out.println(alba.toString());
		
		System.out.println("Electrodomesticos: " + sumaTotal);
		System.out.println("Entre ellos:");
		System.out.println("lavadoras " + sumaLavadoras);
		System.out.println("televisiónes " + sumaTelevision);
	}

}
