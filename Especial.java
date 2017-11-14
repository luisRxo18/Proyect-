package poo.videojuego;

/**
Esta es una clase llamada Especial que implementa Ataque 
*/
public class Especial implements poo.videojuego.Ataque{
	private int experienciaAportada;
	private int danoCausado;
	private int experienciaNecesaria;
	private String nombre;

	/** 
	@param nombre es el nombre del Ataque Especial
	@param experienciaNecesaria es el valor de la experiencia necesaria
	@param experienciaAportada es el valor de la experiencia aportada
	@param danoCausado es el valor del dano que causara */
	public Especial (String nombre,int experienciaNecesaria,int experienciaAportada,int danoCausado){
		this.nombre=nombre;
		this.experienciaNecesaria =experienciaNecesaria;
		this.experienciaAportada=experienciaAportada;
		this.danoCausado=danoCausado;
	}
	
	/** Este constructor dara los valores a las variables 
	param nombre es el nombre del Ataque Especial */
	public Especial (String nombre){
		this.nombre=nombre;
		experienciaNecesaria = 100;
		experienciaAportada = 0;
		danoCausado = 90;
	}

	// @return un entero con el valor de la experiencia aportada
	public int getExpetuenciaQueAporta(){
		return experienciaAportada;
	}
	
	// @return un entero con el valor del dano causado
	public int getDanoQueCausa(){
		return danoCausado;
	}
	
	// @return un entero con el valor de la experiencia necesaria
	public int getExperienciaNecesaria(){
		return experienciaNecesaria;
	}
	
	// @return una cadena con el nombre del ataque
	public String getNombre(){
		return nombre;
	}
}
