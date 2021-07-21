package clasesCine;

public class Pelicula {

	//atributos,
	private String title;
	private int duration;
	private int age_min;
	private String director;
	
	private final int AGE_MIN = 12;

	//constructores,
	
	//por defecto,
	public Pelicula() {
		
		this.title = "";
		this.duration = 0;
		this.age_min = this.AGE_MIN;
		this.director = "";
	}
	
	public Pelicula(String title, int duration, int ageMin, String director) {
		
		this.title = title;
		this.duration = duration;
		this.age_min = ageMin;
		this.director = director;
	}
	
	
	//métodos,
	//los getters y setters,

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getAge_min() {
		return age_min;
	}

	public void setAge_min(int age_min) {
		this.age_min = age_min;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Pelicula [title=" + title + ", duration=" + duration + ", age_min=" + age_min + ", director=" + director
				+ "]";
	}
	
}
