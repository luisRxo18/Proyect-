package poo.videojuego;

public class Ataque1 implements poo.videojuego.Ataque{
	//Atributos
	private int experienciaAportada;
	private int danoCausado;
	private int experienciaNecesaria;
	private String nombre;

	//Constructor
	public Ataque1 (String nombre,int experienciaNecesaria,int experienciaAportada,int danoCausado){
		this.nombre=nombre;
		this.experienciaNecesaria =experienciaNecesaria;
		this.experienciaAportada=experienciaAportada;
		this.danoCausado=danoCausado;
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