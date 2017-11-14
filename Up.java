package poo.videojuego;

public class Up implements poo.videojuego.Item{
	//Atributos
	private String nombre;
	private int energiaAportada;
	private int experienciaAportada;

	public Up(String nombre){
		this.nombre=nombre;
		energiaAportada = 0;
		experienciaAportada =60;

	}

	//Constructor

	public Up(String nombre, int energiaAportada, int experienciaAportada){
		this.nombre = nombre;
		this.energiaAportada = energiaAportada;
		this.experienciaAportada = experienciaAportada;
	}

	//Metodos implementados
	public  String getNombre(){
		return nombre;
	}
	public int getEnergiaQueAporta(){
		return energiaAportada;
	}
	public int getExperienciaQueAporta(){
		return experienciaAportada;
	}
}