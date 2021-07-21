package clasesCine;

public class Espectador {

	//atributos,
	private String name;
	private int age;
	private double money;
	
	//constructores,
	//por defecto,
	public Espectador() {
		
		this.name = "";
		this.age = 0;
		this.money = 0;
	}
	
	
	//con todos los atributos,
	public Espectador(String name, int age, double money) {

		this.name = name;
		this.age = age;
		this.money = money;
	}

	//métodos,

	//los getters y setters,
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


	public double getMoney() {
		return money;
	}


	public void setMoney(double money) {
		this.money = money;
	}


	@Override
	public String toString() {
		return "Espectador [name=" + name + ", age=" + age + ", money=" + money + "]";
	}
		
}
