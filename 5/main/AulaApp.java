package main;

import java.util.ArrayList;

import clasesAula.Classroom;
import clasesAula.Professor;
import clasesAula.Student;

public class AulaApp {

	public static void main(String[] args) {
		String[] material = { "math", "philosophy", "física" };
				
		//profes,
		Professor profeMath = new Professor("Pitágoras", 2469, 'H', 0, material[0]);
		Professor profePhilosophy = new Professor("Heráclito", 2569, 'H', 0, material[1]);
		Professor profeFisica = new Professor("Isaac Newton", 378, 'H', 0, material[2]);
		Professor profeFisica2 = new Professor("Albert Einstein", 66, 'H', 1, material[2]);
				
		//estudiantes,
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Kolya Ivanov", 21, 'H', 0, 9));
		students.add(new Student("Petr Steklov", 80, 'H', 0, 5));
		students.add(new Student("Joan Kerry", 5, 'H', 0, -3));
		
		students.add(new Student("Julia Alvares", 16, 'M', 1, 7));
		students.add(new Student("Olga Jimenez", 30, 'M', 0, 8));
		students.add(new Student("Cristina Luna", 25, 'M', 1, 6));
		
		//mostramos resultados,
		System.out.println(profeMath.toString());
		System.out.println(" ");
		
		Classroom aulaMath = new Classroom(1, 7, material[0], profeMath, students);
		aulaMath.giveClass();
		
		Classroom aulaPhilosophy = new Classroom(2, 2, material[1], profeMath, students);		
		aulaPhilosophy.giveClass();
		
		aulaPhilosophy = new Classroom(2, 2, material[1], profePhilosophy, students);		
		aulaPhilosophy.giveClass();
		
		students.add(new Student("Charlie Sheenn", 35, 'H', 1, 12));
		students.add(new Student("Marie Curie", 87, 'M', 1, 100));
		
		Classroom aulaFisica = new Classroom(3, 10, material[2], profeFisica, students);
		aulaFisica.giveClass();
		
		aulaFisica = new Classroom(3, 10, material[2], profeFisica2, students);
		aulaFisica.giveClass();

	}

}
