package clasesAula;

public class Professor extends Person {

	// atributos,
	private String material;

	private final String[] MATERIAL = { "math", "philosophy", "física" };

	// constructores,
	// por defecto,

	public Professor() {
		super();
		this.material = this.MATERIAL[0];
	}

	// con todos los atributos,
	public Professor(String name, int age, char sex, int absence, String material) {
		super(name, age, sex, absence);
		this.material = material;
	}

	// métodos,
	// los getters y setters,

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {

		this.material = material;
	}

	@Override
	public String toString() {

		return "Profesor " + super.toString() + ", da " + this.material;
	}

	// el profesor tiene un 20% de no encontrarse disponible (reuniones, baja,
	// etc.),
	@Override
	public int getJustifiedAbsence() {

		return 20;
	}

}
