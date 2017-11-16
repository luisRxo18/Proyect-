package poo.videojuego;

public class Spry implements poo.videojuego.Item{
	//Atributos
	private static String nombre="spry";
	private int energiaAportada;
	private int experienciaAportada;

	//Constructor
	public Spry(String nombre, int energiaAportada, int experienciaAportada){
		this.nombre = nombre;
		this.energiaAportada = energiaAportada;
		this.experienciaAportada = experienciaAportada;
	}

	public Spry(String nombre){
		this.nombre=nombre;
		energiaAportada=50;
		experienciaAportada=0;
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
