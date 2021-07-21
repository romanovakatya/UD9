package clasesCine;

public class Sala {

	// atributos,
	private int columns;
	private int rows;
	private double price;
	private Pelicula movie;
	private Espectador[] viewers;
	private boolean[][] seats;
	private String[] columsName = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
			"R", "S", "T", "U", "V", "W", "X", "Y", };

	// constructores,

	// por defecto,
	public Sala() {

		this.columns = 0;
		this.rows = 0;
		this.price = 0;
		this.movie = new Pelicula();
		this.viewers = new Espectador[0];
	}

	// con todos los atributos,
	public Sala(int rows, int columns, double price, Pelicula movie, Espectador[] viewers) {

		this.columns = columns;
		this.rows = rows;
		this.price = price;
		this.movie = movie;
		this.viewers = viewers;
	}

	// métodos,

	// los getters y setters,
	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pelicula getMovie() {
		return movie;
	}

	public void setMovie(Pelicula movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Sala tiene " + (columns * rows) + " acientos, reproduce: " + movie.toString()
				+ ", precio de la entrada: " + price;
	}

	// inicializamos una matriz con el tamaño de filas y columnas,
	// introducidas por el usuario. Al inicio todos los asientos están libres
	// (false),
	private void runSeats() {

		this.seats = new boolean[this.rows][this.columns];

		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				seats[i][j] = false;
			}
		}
	}

	// el método que comprueba si espectador tiene el dinero igual o más que precio,
	// de película
	private boolean isViewerHasSufficientMoney(Espectador viewer) {

		if (viewer.getMoney() >= this.price) {
			return true;
		} else {
			return false;
		}
	}

	// el método que comprueba si espectador tiene edad mayor o igual,
	// que edad mínima de la peli,
	private boolean isViewersAgeSufficient(Espectador viewer) {

		if (viewer.getAge() >= this.movie.getAge_min()) {
			return true;
		} else {
			return false;
		}
	}

	// para mostrar datos de los espectadores,
	public void showViewers() {
		for (int i = 0; i < viewers.length; i++) {
			System.out.println(viewers[i].toString() + ", tiene money " + isViewerHasSufficientMoney(viewers[i])
					+ ", tiene edad suficiente: " + isViewersAgeSufficient(viewers[i]));
		}
	}

	// método que comprueba si hay asientos libres en la sala,
	private boolean isHasFreeSpace() {

		boolean isHasFreeSpace = false;

		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				if (!seats[i][j]) {
					isHasFreeSpace = true;
				}
			}
		}

		return isHasFreeSpace;
	}

	// método que coge fila-columna de primer asiento libre,
	private int[] getFreeSeat() {
		int[] arraySeatPosition = new int[2];
		int contador = 0;

		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {

				if (contador == 0) {

					if (!seats[i][j]) {

						arraySeatPosition[0] = i;
						arraySeatPosition[1] = j;
						contador = 1;
					}
				}
			}
		}
		return arraySeatPosition;
	}

	// método para ocupar asiento por el espectador,
	// que tiene dinero y edad suficiente,
	private void occupySpace(Espectador viewer) {

		int[] arraySeatPosition = this.getFreeSeat();

		if (isViewerHasSufficientMoney(viewer)) {

			if (isViewersAgeSufficient(viewer)) {

				this.seats[arraySeatPosition[0]][arraySeatPosition[1]] = true;

				System.out.println(viewer.getName() + " tu asiento es " + (this.seats.length - arraySeatPosition[0])
						+ columsName[arraySeatPosition[1]]);
				System.out.println(" ");
			}

			else {
				System.out.println(viewer.getName() + " no puedes ver está película. La edad mínima es "
						+ this.movie.getAge_min() + " años");
				System.out.println(" ");
			}

		} else {
			System.out.println(viewer.getName() + " lo siento, pero no tienes dinero suficiente para la entrada.");
			System.out.println(" ");
		}

	}

	// método para mostrar la sala,
	public void showSeats() {
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {

				if (seats[i][j]) {
					System.out.print("X" + "  ");
				} else {
					System.out.print((this.seats.length - i) + this.columsName[j] + " ");
				}
			}
			System.out.println("");
		}
		System.out.println("");
	}

	// el método principal que se ejecuta en el main,
	public void watchMovie() {

		this.runSeats();

		this.showSeats();

		System.out.println(this.toString());
		System.out.println(" ");

		// this.showViewers();

		for (int i = 0; i < viewers.length; i++) {

			if (this.isHasFreeSpace()) {

				this.occupySpace(viewers[i]);

			} else {

				System.out.println("Lo siento " + viewers[i].getName() + " no hay más asientos libres.");
				System.out.println(" ");
			}
		}

		this.showSeats();
	}
}
