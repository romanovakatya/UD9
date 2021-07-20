package clasesVideo;

public class Videojuego implements Entregable, Comparable<Videojuego>{

	// atributos,

	private String title;
	private int estimatedHours;
	private boolean delivered;
	private String genre;
	private String company;

	// constantes para valores por defecto,
	final private int ESTIMATEDHOURS = 10;
	final private boolean DELIVERED = false;

	// constructores,

	// por defecto,
	public Videojuego() {

		this.title = "";
		this.estimatedHours = this.ESTIMATEDHOURS;
		this.delivered = this.DELIVERED;
		this.genre = "";
		this.company = "";
	}

	// con atributos el titulo y horas estimadas, el resto por defecto,
	public Videojuego(String title, int estimatedHours) {

		this.title = title;
		this.estimatedHours = estimatedHours;
		this.delivered = this.DELIVERED;
		this.genre = "";
		this.company = "";
	}

	// con todos los atributos, excepto de entregado,
	public Videojuego(String title, int estimatedHours, String genre, String company) {
		super();
		this.title = title;
		this.estimatedHours = estimatedHours;
		this.delivered = this.DELIVERED;
		this.genre = genre;
		this.company = company;
	}

	// los getters y setters, excepto de entregado,
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getEstimatedHours() {
		return estimatedHours;
	}

	public void setEstimatedHours(int estimatedHours) {
		this.estimatedHours = estimatedHours;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Videojuego " + title + ", horas estimadas: " + estimatedHours + ", genero: " + genre + ", compañia: "
				+ company + "]";
	}

	// entregar videjuego,
	// cambia el atributo delivered a true,
	@Override
	public void deliver() {

		this.delivered = true;
	}

	// devolver videjuego,
	// cambia el atributo delivered a false,
	@Override
	public void returnVideo() {

		this.delivered = false;
	}

	// devuelve el estado del atributo delivered,
	@Override
	public boolean isEntregado() {

		return this.delivered;
	}
	
	//comparamos horas estimadas,
	//clase Serie tiene comentarios a cerca de este tema,
	/*Exception in thread "main" java.lang.ClassCastException: class clasesVideo.Videojuego cannot be cast to class java.lang.Comparable (clasesVideo.Videojuego is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
	at java.base/java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320)
	at java.base/java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
	at java.base/java.util.Arrays.sort(Arrays.java:1040)
	at main.VideoApp.main(VideoApp.java:47)*/

	public int compareTo(Videojuego otro) {

		if (this.getEstimatedHours() == otro.getEstimatedHours()) {
			return 0;
		}  
		else {
			return -Integer.compare(this.getEstimatedHours(), otro.getEstimatedHours());
		}
	}

	// comparamos las horas estimadas,
	/*@Override
	public int compareTo(Object otro) {

		if (this.getEstimatedHours() == ((Videojuego) otro).getEstimatedHours()) {
			return 0;
		} else if (this.getEstimatedHours() > ((Videojuego) otro).getEstimatedHours()) {
			return 1;
		} else {
			return -1;
		}
	}
	// mostrar resultado de comparación,
	public String showCompare(Videojuego otro) {

		int compareTo = this.compareTo(otro);

		if (compareTo == 0) {
			return this.toString() + "\n tiene horas estimadas igual que " + "\n" + otro.toString();
		}

		else if (compareTo == 1) {
			return this.toString() + " tiene más horas estimadas que " + otro.getTitle();
		} else {
			return otro.getTitle() + " tiene más horas estimadas que " + this.toString();
		}
	}*/


}
