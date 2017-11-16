package poo.videojuego;

/** Clase que impletmenta de Ataque.*/

public class Especial implements poo.videojuego.Ataque{
	//Atributos
	private int experienciaAportada;
	private int danoCausado;
	private int experienciaNecesaria;
	private static String nombre="Especial";

	//Constructor
	/**Constructor
	@param nombre Es el nombre de el ataque
	*/
	public Especial (String nombre,int experienciaNecesaria,int experienciaAportada,int danoCausado){
		this.nombre=nombre;
		this.experienciaNecesaria =experienciaNecesaria;
		this.experienciaAportada=experienciaAportada;
		this.danoCausado=danoCausado;
	}
	/**Constructor
	@param nombre Recibimos nombre en forma de String
	*/
	public Especial (String nombre){
		this.nombre=nombre;
		experienciaNecesaria = 100;
		experienciaAportada = 0;
		danoCausado = 90;
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
