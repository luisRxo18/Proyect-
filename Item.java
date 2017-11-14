package poo.videojuego;

/** 
Esta clase implementa la interface Item
*/
public class Item implements poo.videojuego.Item{
	private String nombre;
	private int energiaAportada;
	private int experienciaAportada;

	/** 
	@param nombre es el nombre del Item
	@param energiaAportada es el valor de la energia aportada
	@param experienciaAportada es el valor de la experiencia aportada */
	public Item(String nombre, int energiaAportada, int experienciaAportada){
		this.nombre = nombre;
		this.energiaAportada = energiaAportada;
		this.experienciaAportada = experienciaAportada;
	}

	// @return una cadena con el nombre del Item 
	public  String getNombre(){
		return nombre;
	}
	
	// @return un entero con el valor de la energia que aporta
	public int getEnergiaQueAporta(){
		return energiaAportada;
	}
	
	// @return un entero con el valor de la experiencia que aporta
	public int getExperienciaQueAporta(){
		return experienciaAportada;
	}
}
