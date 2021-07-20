package clasesAula;

import java.util.ArrayList;
import java.util.Hashtable;

public class Classroom {

	// atributos,
	private long id;
	private int size;
	private String destination;
	private Professor profesor;
	private ArrayList<Student> students = new ArrayList<Student>();

	private final String[] DESTINATION = { "math", "philosophy", "física" };

	// constructores,
	// por defecto,
	public Classroom() {

		this.id = 0;
		this.size = 20;
		this.destination = this.DESTINATION[0];
	}

	// con todos atributos,
	public Classroom(long id, int size, String destination, Professor profesor, ArrayList<Student> students) {
		super();
		this.id = id;
		this.size = size;
		this.destination = destination;
		this.profesor = profesor;
		this.students = students;
	}

	// comprobar que la materia que da el profesor corresponde al destino,
	// de aula, true - sí, false - no,
	private boolean isProfessorMaterialCorrespondsToDestination() {
		if (this.profesor.getMaterial().equalsIgnoreCase(this.destination)) {
			return true;
		} else {
			System.out.println("El profesor " + this.profesor.getName() + " da otro material");
			return false;
		}
	}

	// método para comprobar si en aula hay alumnos más de 50%,
	// y que no están más que la capacidad de aula,
	private boolean isSizeCorresponds() {

		int studentsPresentes = studentsPresentes();
		// comprobamos que alumnos presentes son más de 50% de clase,
		if ( studentsPresentes > (this.students.size() / 2)) {

			// comprobamos si alumnos presentados no superan,
			// la capacidad de aula,
			if (studentsPresentes <= this.size) {
				return true;
			} else {
				System.out.println("Aula " + this.id + " es demasiado pequeña para " + studentsPresentes + " alumnos");
				return false;
			}

		} else {
			System.out.println("Los alumnos presentes son menos que 50 % de clase.");
			return false;
		}

	}

	// método que calcula cuantos alumnos presentan en aula,
	private int studentsPresentes() {
		int countPresents = 0;

		for (Student student : this.students) {
			if (!student.isAbsence()) {
				countPresents++;
			}
		}
		return countPresents;
	}

	// método que calcula cuantos alumnos y alumnas (por separado),
	// están aprobados ,
	private Hashtable<String, Integer> countApproved() {

		Hashtable<String, Integer> approved = new Hashtable<String, Integer>();
		int girlsApproved = 0;
		int boysApproved = 0;

		for (int i = 0; i < this.students.size(); i++)  {
			
			if (this.students.get(i).isApproved()) {

				if (this.students.get(i).getSex() == 'H') {
					System.out.println("Alumno: " + this.students.get(i).getName() + ", nota: " + this.students.get(i).getScore());
					boysApproved += 1;
				} else {
					System.out.println("Alumna: " + this.students.get(i).getName() + ", nota: " + this.students.get(i).getScore());
					girlsApproved += 1;
				}
			}
		}

		approved.put("alumnos", boysApproved);
		approved.put("alumnas", girlsApproved);

		return approved;
	}

	// el método principal que se ejecuta en main,
	public void giveClass() {

		//comprobamos si profesor ha venido,
		if (!this.profesor.isAbsence()) {

			//comprobamos si material que da profesor corresponde,
			//al destino de aula y que aula tiene más de 50% alumnos,
			// pero no más que capacidad de aula,
			if (this.isProfessorMaterialCorrespondsToDestination() && this.isSizeCorresponds()) {

				//calculamos y mostamos están aprobados,
				System.out.println("Están aprobados: " + this.countApproved().toString());
				System.out.println(" ");
			} else {
				System.out.println("Es imposible darse clase");
				System.out.println(" ");
			}
		} else {
			System.out.println("El profesor " + this.profesor.getName() + " no presente");
		}
	}
	
	//método para mostrar array de estudiantes,
	public void showStudents() {
		for (Student student : this.students) {
			System.out.println(student.toString());
		}
	}
}
