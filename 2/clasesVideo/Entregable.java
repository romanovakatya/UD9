package clasesVideo;

public interface Entregable {
	
	//cambia el atributo prestado a true,
	public void deliver();
	
	//cambia el atributo prestado a false,
	public void returnVideo();
	
	//devuelve el estado del atributo prestado,
	public boolean isEntregado();

	//compara las horas estimadas en los,
	//videojuegos y en las series el numero de temporadas,
	//int compareTo(Object otro);

}
