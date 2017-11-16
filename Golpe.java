package poo.videojuego;

public class Golpe implements poo.videojuego.Ataque{
	//Atributos
	private int experienciaAportada;
	private int danoCausado;
	private int experienciaNecesaria;
	private static String nombre ="golpe";

	//Constructor

	public Golpe(String nombre)
	{
		this.nombre=nombre;
		experienciaNecesaria=30;
		experienciaAportada=0;
		danoCausado=60;


	}
	public Golpe (String nombre,int experienciaNecesaria,int experienciaAportada,int danoCausado){
		this.nombre=nombre;
		this.experienciaNecesaria =experienciaNecesaria;
		this.experienciaAportada=experienciaAportada;
		this.danoCausado=danoCausado;
	}

	//Metodos implementados:
	public int getExperienciaQueAporta(){
		return experienciaAportada;
	}
	public int getDanoQueCausa(){
		return danoCausado;
	}
	public int getExperienciaNecesaria(){
		return experienciaNecesaria;
	}
	public String getNombre(){
		return nombre;
	}
}
