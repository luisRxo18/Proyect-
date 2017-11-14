package poo.videojuego;

public class Especial implements poo.videojuego.Ataque{
	//Atributos
	private int experienciaAportada;
	private int danoCausado;
	private int experienciaNecesaria;
	private String nombre;

	//Constructor
	public Especial (String nombre,int experienciaNecesaria,int experienciaAportada,int danoCausado){
		this.nombre=nombre;
		this.experienciaNecesaria =experienciaNecesaria;
		this.experienciaAportada=experienciaAportada;
		this.danoCausado=danoCausado;
	}
	public Especial (String nombre){
		this.nombre=nombre;
		experienciaNecesaria = 100;
		experienciaAportada = 0;
		danoCausado = 90;
	}

	//Metodos implementados:
	public int getExpetuenciaQueAporta(){
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