package clases;

public class Television extends Electrodomestico{
	
	// atributos,
	protected double resolucion;
	protected boolean sintonizadorTDT; 
	
	final private double RESOLUCION_DEFAULT = 20;
	final private boolean SINTONIZADOR_TDT_DEFAULT = false;
	
	//constructores,
	//por defecto,
	public Television() {
		super();
		this.resolucion = this.RESOLUCION_DEFAULT;
		this.sintonizadorTDT = this.SINTONIZADOR_TDT_DEFAULT;
		
	}
	
	//Un constructor con el precio y peso. El resto por defecto,
	public Television(int precio, int peso) {
		super(precio, peso);
		this.resolucion = this.RESOLUCION_DEFAULT;
		this.sintonizadorTDT = this.SINTONIZADOR_TDT_DEFAULT;
		
	}
	
	//Un constructor con la resolución, sintonizador TDT y el resto de atributos,
	//heredados 
	public Television(int precio, String color, char consumo_energetico, int peso,
			double resolucion, boolean sintonizadorTDT) {
		super(precio, color, consumo_energetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	//métodos,
	//getters,

	public double getResolucion() {
		return this.resolucion;
	}

	public boolean isSintonizadorTDT() {
		return this.sintonizadorTDT;
	}

	@Override
	public double precioFinal() {
		double precioFinal = 0;
		
		if (this.resolucion > 40) {
			precioFinal = (super.precioFinal() * 1.3);
		}
		if (this.sintonizadorTDT) {
			precioFinal += 50;
		}
		else {
			precioFinal = super.precioFinal();
		}
		return precioFinal;
	}

	@Override
	public String toString() {
		
		return "Television: " + super.toString() + ", resolución=" + this.resolucion
				+ ", sintonizador TDT=" + this.sintonizadorTDT;
	}
	
	
	
	
	
	
}
