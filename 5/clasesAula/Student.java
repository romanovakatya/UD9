package clasesAula;

public class Student extends Person {

	// atributos,
	private int score;

	private final int MAX_SCORE = 10;
	private final int MIN_SCORE = 0;
	private final int MAX_AGE = 45;
	private final int MIN_AGE = 14;

	// constructores,
	// por defecto,

	public Student() {
		super();
		this.score = 5;
	}

	// con todos los atributos,
	public Student(String name, int age, char sex, int absence, int score) {
		super(name, age, sex, absence);
		this.setAge(age);
		this.setScore(score);
	}

	// métodos,

	// método que según la nota del alumno devuelve true,
	// si está aprobado, false si no está aprobado,
	public boolean isApproved() {
		if (this.score > 5) {
			return true;
		} else {
			return false;
		}
	}

	// los getters y setters,
	// hacemos comprobación para que adad no salga del rango (de 14 a 45),
	@Override
	public void setAge(int age) {
		
		if (age < this.MIN_AGE) {

			this.age = this.MIN_AGE;
			
		} else if (age > this.MAX_AGE) {

			this.age = this.MAX_AGE;
		} else {

			this.age = age;
		}
		
	}

	public int getScore() {
		return score;
	}

	// hacemos comprobación para que calificación no salga del rango,
	public void setScore(int score) {

		if (score < this.MIN_SCORE) {

			this.score = this.MIN_SCORE;
		} else if (score > this.MAX_SCORE) {

			this.score = this.MAX_SCORE;
		} else {

			this.score = score;
		}
	}

	@Override
	public String toString() {

		return "Estudiante " + super.toString() + ", calificación actual " + this.score;
	}

	// los estudiantes tendrán un 50% de hacer novillos,
	@Override
	public int getJustifiedAbsence() {

		return 50;
	}

}
