import java.util.Collection;
package poo.videojuego;

public class Personaje3 implements poo.videojuego.Personaje{
	//Atributos
	private String nombre;
	private int experiencia;
	private int vida;
	private Collection<Ataque> ataques;
	private Collection<Item> items;

	//Constructor:
	public Personaje1 (String nombre,int experiencia, int vida){
		this.nombre = nombre;
		this.experiencia = experiencia;
		this.vida = vida;
		ataques = new Collection<Ataque>();
		items = new Collection<Item>();
	}
	//Aqui va el try cath de la experiencia necesaria
	public Ataque lanza(String nombreAtaque){
		for (Ataque A : Collection<Ataque>){
			if (A.getNombre().equals(nombreAtaque)){
				if (A.getExperienciaNecesaria()==experiencia){
					experiencia = experiencia + A.getExpetuenciaQueAporta();
					ataques.remove(A);
					return A;
				}else
				//Aqui ira el catch
			}
		}
	}
	public void recibe (Ataque ataque){
		vida = vida - Ataque.danoCausado();
	}
	public void usa (Item item){
		//No la entendi bien eso de los dos tipos de item
	}
	public void guarda (Ataque ataque){
		ataques.add(Ataque);
	}
	public Collection<Ataque> getAtaques(){
		return ataques;
	}
	public int getExperiencia(){
		return experiencia;
	}
	public int getEnergia(){
		return vida;
	}
	public String getNombre(){
		return nombre;
	}
	public void guardaEnArchivo(String archivo){
		//Aqui podriamos aplicar el command, but no se como
	}
}