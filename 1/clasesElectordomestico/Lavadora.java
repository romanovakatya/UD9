package clasesElectordomestico;

public class Lavadora extends Electrodomestico {
	
	// atributos,
	protected int carga;
	final private int CARGA_DEFAULT = 5;
	
	//constructores,
	//por defecto,
	public Lavadora() {
		super();
		this.carga = this.CARGA_DEFAULT;
	}
	
	//Un constructor con el precio y peso. El resto por defecto,
	public Lavadora(int precio, int peso) {
		super(precio, peso);
		this.carga = this.CARGA_DEFAULT;
	}
	
	//Un constructor con la carga y el resto de atributos heredados,
	public Lavadora(int precio, String color, char consumo_energetico, int peso, int carga) {
		super(precio, color, consumo_energetico, peso);
		this.carga = carga;		
	}

	//métodos,
	//getters,
	public int getCarga() {
		return carga;
	}

	//sobreescribimos el método padre según el valor de carga,
	@Override
	public double precioFinal() {
		
		return this.carga > 30 ? (super.precioFinal() + 50) : super.precioFinal();
	}

	@Override
	public String toString() {
		return "Lavadora: " + super.toString() + ", carga=" + carga;
	}
	
	

	
}
