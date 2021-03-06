package poo.videojuego;

/** Golpe implementa de Ataque*/

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
	/** regresa un valor en entero de la experiencia que aporta
	@param No tiene parámetros
	@return Regresa dato de tipo entero de los puntos de experiencia que aporta
	*/
	public int getExperienciaQueAporta(){
		return experienciaAportada;
	}
	
	/**@return Retorna el daño que causa el golpe en entero*/
	public int getDanoQueCausa(){
		return danoCausado;
	}
	/**@return Retorna la experiencia necesaria para utilizarlo en entero*/
	public int getExperienciaNecesaria(){
		return experienciaNecesaria;
	}
	
	/**@return Retorna el nombre del golpe como cadena*/
	public String getNombre(){
		return nombre;
	}
}
