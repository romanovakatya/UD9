package clasesLibro;

public class Libro implements Comparable<Libro> {

	// atributos,

	private String isbn;
	private String titulo;
	private String autor;
	private int numPage;

	// constructores,

	// por defecto,
	public Libro() {

		this.isbn = "";
		this.titulo = "";
		this.autor = "";
		this.numPage = 0;
	}

	// con todos atributos,
	public Libro(String isbn, String titulo, String autor, int numPage) {

		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPage = numPage;
	}

	// métodos,

	// los getters y setters,
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPage() {
		return numPage;
	}

	public void setNumPage(int numPage) {
		this.numPage = numPage;
	}

	@Override
	public String toString() {
		return "El libro " + this.titulo + " con ISBN " + this.isbn + " creado por " + this.autor + " tiene "
				+ this.numPage + " páginas";
	}

	// para comparar dos libros según la cantidad de páginas,
	@Override
	public int compareTo(Libro otro) {
		if (this.getNumPage() == otro.getNumPage()) {
			return 0;
		} else if (this.getNumPage() > otro.getNumPage()) {
			return 1;
		} else {
			return 2;
		}
	}

	// mostrar resultado de comparación,
	public String showCompare(Libro otro) {

		int compareTo = this.compareTo(otro);

		if (compareTo == 0) {
			return "Libros tienen la misma cantidad de páginas";
		}

		else if (compareTo == 1) {
			return "El libro " + this.getTitulo() + " creado por " + this.getAutor() + " tiene más páginas que " + otro.getTitulo()
			+ " creado por " + otro.getAutor();
		} else {
			return "El libro " + otro.getTitulo() + " creado por " + otro.getAutor() + " tiene más páginas que " + this.getTitulo()
			+ " creado por " + this.getAutor();
		}
	}
}
