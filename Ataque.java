package poo.videojuego;

/** 
Esta clase implementa la clase Ataque
*/
public class Ataque implements poo.videojuego.Ataque{
	private int experienciaAportada;
	private int danoCausado;
	private int experienciaNecesaria;
	private String nombre;

	/** Constructor
	@param nombre Es el nombre del ataque
	@param experienciaNecesaria Es la experiencia que se necesita para utilizar dicho ataque
	@param danoCausado Es el numero de cuanto daño causa */
	public Ataque (String nombre,int experienciaNecesaria,int experienciaAportada,int danoCausado){
		this.nombre=nombre;
		this.experienciaNecesaria =experienciaNecesaria;
		this.experienciaAportada=experienciaAportada;
		this.danoCausado=danoCausado;
	}

	// @return un entero con el valor de la experiencia aportada 
	public int getExperienciaQueAporta(){
		return experienciaAportada;
	}
	
	// @return un entero con el valor del daño causado
	public int getDanoQueCausa(){
		return danoCausado;
	}
	
	// @return un entero con el valor de la experiencia necesaria 
	public int getExperienciaNecesaria(){
		return experienciaNecesaria;
	}
	
	//return una cadena con el nombre del ataque
	public String getNombre(){
		return nombre;
	}
}
