package clasesAula;

public abstract class Person {

	// atributos,
	protected String name;
	protected int age;
	protected char sex;
	protected boolean absence;

	// valores por defecto,
	private final char SEX = 'H';
	private final int AGE = 14;
	private final boolean ABSENCE = false;

	// los constructores,
	// por defecto,

	public Person() {

		this.name = "";
		this.age = this.AGE;
		this.sex = this.SEX;
		this.absence = this.ABSENCE;
	}

	// con todos los atributos,
	public Person(String name, int age, char sex, int absence) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		setAbsence(absence);
	}

	// métodos,

	// método que devuelve cuanto puede no encontrarse disponible,
	// una persona,
	public abstract int getJustifiedAbsence();

	// los getters y setters,

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public boolean isAbsence() {
		return this.absence;
	}

	// absence se puede escribir como 0 false y 1 - true,
	public void setAbsence(int absence) {
		if (absence == 0) {
			this.absence = this.ABSENCE;
		} else {
			this.absence = true;
		}
	}

	@Override
	public String toString() {
		return "nombre=" + name + ", edad=" + age + ", sexo=" + sex + ", faltas permitidas: "
				+ this.getJustifiedAbsence() + "%";
	}

}
