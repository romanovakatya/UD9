package clasesVideo;

public class Serie implements Entregable, Comparable<Serie> {

	// atributos,

	private String title;
	private int numberOfSeasons;
	private boolean delivered;
	private String genre;
	private String creator;

	// constantes para valores por defecto,
	final private int NUMBEROFSEASONS = 3;
	final private boolean DELIVERED = false;

	// constructores,

	// por defecto,
	public Serie() {
		this.title = "";
		this.numberOfSeasons = this.NUMBEROFSEASONS;
		this.delivered = this.DELIVERED;
		this.genre = "";
		this.creator = "";
	}

	// con atributos el titulo y creador, el resto por defecto,
	public Serie(String title, String creator) {
		this.title = title;
		this.numberOfSeasons = this.NUMBEROFSEASONS;
		this.delivered = this.DELIVERED;
		this.genre = "";
		this.creator = creator;
	}

	// con todos los atributos, excepto de entregado,
	public Serie(String title, int numberOfSeasons, String genre, String creator) {
		this.title = title;
		this.numberOfSeasons = numberOfSeasons;
		this.delivered = this.DELIVERED;
		this.genre = genre;
		this.creator = creator;
	}

	// métodos,

	// los getters, excepto de entregado,
	public String getTitle() {
		return title;
	}

	public int getNumberOfSeasons() {
		return numberOfSeasons;
	}

	public String getGenre() {
		return genre;
	}

	public String getCreator() {
		return creator;
	}

	// los setters, excepto de entregado,

	public void setTitle(String title) {
		this.title = title;
	}

	public void setNumberOfSeasons(int numberOfSeasons) {
		this.numberOfSeasons = numberOfSeasons;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	@Override
	public String toString() {
		return "Serie " + title + ", tiene " + numberOfSeasons + " temporadas" + ", genero: " + genre + ", creator: "
				+ creator;
	}

	// entregar serie,
	// cambia el atributo delivered a true,
	@Override
	public void deliver() {

		this.delivered = true;
	}

	// devolver serie,
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

	// comparamos el número de temporadas,
	//para poder realizar arrays.sort en el orden desc,
	
	///////////////////////
	////////  compareTo (Object a) con el cast de Objeto da un error a la hora de hacer arrays.sort
	////////  para mi arrays.sort es una manera más eficaz de encontrar la serie que tiene,
	////////  más temporadas por eso lo he utilizado,
	////////  y dejado comentadas las partes de código donde uso compareTo de Entregable,
	
	@Override
	public int compareTo(Serie otra) {

		if (this.getNumberOfSeasons() == otra.getNumberOfSeasons()) {
			return 0;
		}  
		else {
			return -Integer.compare(this.getNumberOfSeasons(), otra.getNumberOfSeasons());
		}
	}
	
	// comparamos las horas estimadas,
		/*@Override
		public int compareTo(Object otra) {

			if (this.getNumberOfSeasons() == ((Serie) otra).getNumberOfSeasons()) {
				return 0;
			} else if (this.getNumberOfSeasons() > ((Serie) otra).getNumberOfSeasons()) {
				return 1;
			} else {
				return -1;
			}
		}
	// mostrar resultado de comparación entre dos objetos,
		public String showCompare(Serie otra) {

			int compareTo = this.compareTo(otra);

			if (compareTo == 0) {
				return this.toString() + "\n tiene el mismo número de temporadas que "
						+ "\n" + otra.toString();
			}

			else if (compareTo == 1) {
				return this.toString() + " tiene más temporadas que " + otra.getTitle();
			}
			else {
				return otra.getTitle() + " tiene más temporadas que " + this.toString();
			}
		}*/


}
