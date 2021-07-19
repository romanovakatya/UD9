package clasesElectordomestico;

import java.util.Arrays;
import java.util.List;

public class Electrodomestico {

	// atributos,
	//constantes para valores por defecto,
	final private int PRECIO_DEFAULT = 100;
	final private String COLOR_DEFAULT = "blanco";
	final private char CONSUMO_ENERGETICO_DEFAULT = 'F';
	final private int PESO_DEFAULT = 5;

	protected int precio;
	protected String color;
	protected char consumo_energetico;
	protected int peso;

	//colores y consumo energetico disponibles,
	private List<String> colors = Arrays.asList("negro", "rojo", "azul", "gris");
	private List<String> consumo = Arrays.asList("A", "B", "C", "D", "E");

	// constructores,
	// por defecto,
	public Electrodomestico() {
		this.precio = this.PRECIO_DEFAULT;
		this.color = this.COLOR_DEFAULT;
		this.consumo_energetico = this.CONSUMO_ENERGETICO_DEFAULT;
		this.peso = this.PESO_DEFAULT;
	}

	// con el precio y peso, el resto por defecto,
	public Electrodomestico(int precio, int peso) {
		this.precio = precio;
		this.color = this.COLOR_DEFAULT;
		this.consumo_energetico = this.CONSUMO_ENERGETICO_DEFAULT;
		this.peso = peso;
	}

	// con todos los atributos,
	public Electrodomestico(int precio, String color, char consumo_energetico, int peso) {
		this.precio = precio;
		this.color = this.comprobarColor(color);
		this.consumo_energetico = this.comprobarConsumoEnergetico(consumo_energetico);
		this.peso = peso;
	}

	// métodos,

	// los getters,
	public int getPrecio() {
		return this.precio;
	}

	public String getColor() {
		return this.color;
	}

	public char getConsumo_energetico() {
		return this.consumo_energetico;
	}

	public int getPeso() {
		return this.peso;
	}

	// comprueba que la letra es correcta, sino es correcta usara
	// la letra por defecto,

	private char comprobarConsumoEnergetico(char letra) {

		if (this.consumo.contains(Character.toString(letra).toUpperCase())) {
			return letra;
		} else {
			return this.CONSUMO_ENERGETICO_DEFAULT;
		}
	}

	// comprueba que el color es correcto, sino lo es usa el color por defecto.

	private String comprobarColor(String color) {

		if (this.colors.contains(color.toLowerCase())) {
			return color.toLowerCase();
		} else {
			return this.COLOR_DEFAULT;
		}
	}

	//según el consumo energético, aumentara su precio,
	// y según el tamaño, también.
	public double precioFinal() {

		int precioConsumo;
		int precioPeso;

		//el precio según el consumo energético,
		switch (this.consumo_energetico) {
		case 'A':
			precioConsumo = 100;
			break;
		case 'B':
			precioConsumo = 80;
			break;
		case 'C':
			precioConsumo = 60;
			break;
		case 'D':
			precioConsumo = 50;
			break;
		case 'E':
			precioConsumo = 30;
			break;
		default:
			precioConsumo = 10;
			break;
		}
				
		
		// el precio según el peso del electrodomestico,
		if (this.peso >= 20 && this.peso <= 49) {
			precioPeso = 50;
		} 
		else if (this.peso >= 50 && this.peso <= 79) {
			precioPeso = 80;
		} 
		else if (this.peso >= 80) {
			precioPeso = 100;
		} 
		else {
			precioPeso = 10;
		}

		//devolvemos precio final
		return (this.precio + precioConsumo + precioPeso);
	}

	//mostramos información sobre objeto,
	@Override
	public String toString() {
		return "electrodomestico [precio=" + this.precio + ", color=" + this.color 
				+ ", consumo_energetico=" + this.consumo_energetico
				+ ", peso=" + this.peso + ", precio final=" + this.precioFinal();
	}
	
	
}
