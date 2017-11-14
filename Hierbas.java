package poo.videojuego;

public class Hierbas implements poo.videojuego.Item{
	//Atributos
	private String nombre;
	private int energiaAportada;
	private int experienciaAportada;

	//Constructor
	public Hierbas(String nombre, int energiaAportada, int experienciaAportada){
		this.nombre = nombre;
		this.energiaAportada = energiaAportada;
		this.experienciaAportada = experienciaAportada;
	}

	public Hierbas(String nombre){
		this.nombre=nombre;
		energiaAportada=20;
		experienciaAportada=30;
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