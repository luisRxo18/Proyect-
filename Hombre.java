package poo.videojuego;
import java.util.ArrayList;

public class Hombre implements poo.videojuego.Personaje{
	//Atributos
	private String nombre;
	private int experiencia;
	private  int vida;
	private ArrayList<Ataque> ataques;
	private ArrayList<Item> items;

	//Constructor:
	public Hombre (String nombre,int experiencia, int vida){
		this.nombre = nombre;
		this.experiencia = experiencia;
		this.vida = vida;
		ataques = new ArrayList<Ataque>();
		items = new ArrayList<Item>();
	}
	//Aqui va el try cath de la experiencia necesaria
	public Ataque lanza(String nombreAtaque) throws ExperienciaNoSuficienteExcepcion{
		for (Ataque A : ataques){
			if (A.getNombre().equals(nombreAtaque)){
				if (A.getExperienciaNecesaria()==experiencia){
					experiencia = experiencia + A.getExperienciaQueAporta();
					ataques.remove(A);
					return A;
				}
				else
				{
				throw new ExperienciaNoSuficienteExcepcion();
				}

			}
		}
		return null;

	}
	public void recibe (Ataque ataque){
		vida = vida - ataque.getDanoQueCausa();
	}
	public void usa (Item item){
		//No la entendi bien eso de los dos tipos de item
	}
	public void guarda (Ataque ataque){
		ataques.add(ataque);
	}
	public ArrayList<Ataque> getAtaques(){
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