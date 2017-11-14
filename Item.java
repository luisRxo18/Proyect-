package poo.videojuego;

public class Item implements poo.videojuego.Item{
	//Atributos
	private String nombre;
	private int energiaAportada;
	private int experienciaAportada;

	//Constructor
	public Item(String nombre, int energiaAportada, int experienciaAportada){
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
